import java.util.ArrayList;

public class Order {
    private static int nextId = 1;
    private static final double TAX_RATE = 0.1025;

    private int orderId;
    private ArrayList<MenuItem> items;
    private OrderStatus status;

    public Order() {
        this.orderId = nextId++;
        this.items = new ArrayList<>();
        this.status = OrderStatus.CREATED;
    }

    public void addItem(MenuItem item) {
        if (status == OrderStatus.PAID) {
            System.out.println("Cannot add items after the order has been paid.");
            return;
        }

        items.add(item);
    }

    public double getSubtotal() {
        double subtotal = 0;

        for (MenuItem item : items) {
            subtotal += item.getPrice();
        }

        return subtotal;
    }

    public double getTax() {
        return getSubtotal() * TAX_RATE;
    }

    public double getTotal() {
        return getSubtotal() + getTax();
    }

    public void checkout(PaymentStrategy paymentStrategy) {
        boolean paid = paymentStrategy.pay(getTotal());

        if (paid) {
            status = OrderStatus.PAID;
        }
    }

    public void printOrder() {
        System.out.println("========== ORDER RECEIPT ==========");
        System.out.println("Order ID: " + orderId);
        System.out.println("Status: " + status);
        System.out.println("-----------------------------------");

        for (MenuItem item : items) {
            System.out.printf("%-15s $%.2f%n", item.getName(), item.getPrice());
        }

        System.out.println("-----------------------------------");
        System.out.printf("%-15s $%.2f%n", "Subtotal:", getSubtotal());
        System.out.printf("%-15s $%.2f%n", "Tax:", getTax());
        System.out.printf("%-15s $%.2f%n", "Total:", getTotal());
        System.out.println("===================================");
    }
}