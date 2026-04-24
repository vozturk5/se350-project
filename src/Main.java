public class Main {
    public static void main(String[] args) {
        MenuItem burger = new MenuItem("Burger", 8.99);
        MenuItem fries = new MenuItem("Fries", 3.49);

        Order order = new Order();
        order.addItem(burger);
        order.addItem(fries);

        order.printOrder();

        // Strategy Pattern: choose payment method
        PaymentStrategy payment = new CashPayment();
        payment.pay(order.getTotal());
    }
}