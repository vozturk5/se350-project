public class Main {
    public static void main(String[] args) {
        RestaurantManager restaurantManager = RestaurantManager.getInstance();
        restaurantManager.printWelcomeMessage();

        System.out.println();

        MenuItemFactory burgerFactory = new BurgerFactory();
        MenuItemFactory friesFactory = new FriesFactory();
        MenuItemFactory drinkFactory = new DrinkFactory();
        MenuItemFactory dessertFactory = new DessertFactory();

        MenuItem burger = burgerFactory.createMenuItem();
        MenuItem fries = friesFactory.createMenuItem();
        MenuItem drink = drinkFactory.createMenuItem();
        MenuItem dessert = dessertFactory.createMenuItem();

        Menu menu = new Menu();
        menu.addItem(burger);
        menu.addItem(fries);
        menu.addItem(drink);
        menu.addItem(dessert);

        menu.printMenu();

        System.out.println();
        System.out.println("========== COMPLETED ORDER DEMO ==========");

        // Builder Pattern: build the completed order step by step
        Order completedOrder = new OrderBuilder()
                .addItem(burger)
                .addItem(fries)
                .addItem(drink, 2)
                .addItem(dessert)
                .build();

        OrderInvoker completedOrderInvoker = new OrderInvoker();

        completedOrder.printOrder();

        System.out.println();

        // Command Pattern: execute order actions as command objects
        completedOrderInvoker.runCommand(new CheckoutCommand(completedOrder, new CardPayment("4242")));
        completedOrderInvoker.runCommand(new PrepareOrderCommand(completedOrder));
        completedOrderInvoker.runCommand(new MarkReadyCommand(completedOrder));
        completedOrderInvoker.runCommand(new CompleteOrderCommand(completedOrder));

        restaurantManager.recordCompletedOrder(completedOrder);

        System.out.println();

        completedOrder.printOrder();

        System.out.println("Commands executed for completed order: " + completedOrderInvoker.getCommandCount());

        System.out.println();
        System.out.println("========== CANCELLED ORDER DEMO ==========");

        Order cancelledOrder = new Order();
        OrderInvoker cancelledOrderInvoker = new OrderInvoker();

        cancelledOrderInvoker.runCommand(new AddItemCommand(cancelledOrder, burger, 1));
        cancelledOrderInvoker.runCommand(new AddItemCommand(cancelledOrder, drink, 1));

        System.out.println();

        cancelledOrder.printOrder();

        System.out.println();

        cancelledOrderInvoker.runCommand(new CancelOrderCommand(cancelledOrder));
        restaurantManager.recordCancelledOrder(cancelledOrder);

        System.out.println();

        cancelledOrder.printOrder();

        System.out.println();

        System.out.println("Trying to pay cancelled order:");
        cancelledOrderInvoker.runCommand(new CheckoutCommand(cancelledOrder, new CashPayment()));

        System.out.println("Commands executed for cancelled order: " + cancelledOrderInvoker.getCommandCount());

        System.out.println();

        restaurantManager.printManagerSummary();
    }
}