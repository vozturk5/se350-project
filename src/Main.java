public class Main {
    public static void main(String[] args) {
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

        Order order = new Order();
        OrderInvoker invoker = new OrderInvoker();

        invoker.runCommand(new AddItemCommand(order, burger, 1));
        invoker.runCommand(new AddItemCommand(order, fries, 1));
        invoker.runCommand(new AddItemCommand(order, drink, 2));
        invoker.runCommand(new AddItemCommand(order, dessert, 1));

        System.out.println();

        order.printOrder();

        System.out.println();

        invoker.runCommand(new CheckoutCommand(order, new CardPayment("4242")));
        invoker.runCommand(new PrepareOrderCommand(order));
        invoker.runCommand(new MarkReadyCommand(order));
        invoker.runCommand(new CompleteOrderCommand(order));

        System.out.println();

        order.printOrder();

        System.out.println("Commands executed: " + invoker.getCommandCount());
    }
}