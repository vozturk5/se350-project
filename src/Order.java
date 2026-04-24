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

    ArrayList<String> uniqueItems = new ArrayList<>();

    for (MenuItem item : items) {
        String name = item.getName();

        if (!uniqueItems.contains(name)) {
            int quantity = 0;
            double totalPrice = 0;

            for (MenuItem i : items) {
                if (i.getName().equals(name)) {
                    quantity++;
                    totalPrice += i.getPrice();
                }
            }

            if (quantity > 1) {
                System.out.printf("%-15s x%-2d %8s%n", name, quantity, String.format("$%.2f", totalPrice));
            } else {
                System.out.printf("%-15s     %8s%n", name, String.format("$%.2f", totalPrice));
            }

            uniqueItems.add(name);
        }
    }

    System.out.println("-----------------------------------");
    System.out.printf("%-15s     %8s%n", "Subtotal:", String.format("$%.2f", getSubtotal()));
    System.out.printf("%-15s     %8s%n", "Tax:", String.format("$%.2f", getTax()));
    System.out.printf("%-15s     %8s%n", "Total:", String.format("$%.2f", getTotal()));
    System.out.println("===================================");
}
}