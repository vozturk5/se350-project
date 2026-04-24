public class Main {
    public static void main(String[] args) {
        MenuItem burger = new MenuItem("Burger", 8.99);
        MenuItem fries = new MenuItem("Fries", 3.49);
        MenuItem drink = new MenuItem("Drink", 1.99);

        Menu menu = new Menu();
        menu.addItem(burger);
        menu.addItem(fries);
        menu.addItem(drink);

        menu.printMenu();

        System.out.println();

        Order order = new Order();
        order.addItem(burger);
        order.addItem(fries);

        order.printOrder();

        PaymentStrategy payment = new CashPayment();
        payment.pay(order.getTotal());
    }
}