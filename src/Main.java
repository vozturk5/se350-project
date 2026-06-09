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

        Order order = new OrderBuilder()
                .addItem(burger)
                .addItem(fries)
                .addItem(drink, 2)
                .addItem(dessert)
                .build();

        order.printOrder();

        System.out.println();

        PaymentStrategy payment = new CardPayment("4242");
        order.checkout(payment);

        System.out.println();

        order.prepare();
        order.markReady();
        order.complete();

        System.out.println();

        order.printOrder();
    }
}