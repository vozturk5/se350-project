import java.util.ArrayList;

public class Order {
    private static int nextId = 1;
    private static final double TAX_RATE = 0.1025;

    private int orderId;
    private ArrayList<MenuItem> items;
    private OrderState state;

    public Order() {
        this.orderId = nextId++;
        this.items = new ArrayList<>();
        this.state = new CreatedState();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public String getStatus() {
        return state.getStatusName();
    }

    public void addItem(MenuItem item) {
        if (!state.canModifyOrder()) {
            System.out.println("Cannot add items when order status is " + state.getStatusName() + ".");
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
            state.pay(this);
        }
    }

    public void prepare() {
        state.prepare(this);
    }

    public void markReady() {
        state.markReady(this);
    }

    public void complete() {
        state.complete(this);
    }

    public void cancel() {
        state.cancel(this);
    }

    public void printOrder() {
        System.out.println("========== ORDER RECEIPT ==========");
        System.out.println("Order ID: " + orderId);
        System.out.println("Status: " + state.getStatusName());
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

                String priceStr = String.format("$%.2f", totalPrice);

                if (quantity > 1) {
                    System.out.printf("%-15s x%-2d %10s%n", name, quantity, priceStr);
                } else {
                    System.out.printf("%-15s      %10s%n", name, priceStr);
                }

                uniqueItems.add(name);
            }
        }

        System.out.println("-----------------------------------");

        System.out.printf("%-15s %10s%n", "Subtotal:", String.format("$%.2f", getSubtotal()));
        System.out.printf("%-15s %10s%n", "Tax:", String.format("$%.2f", getTax()));
        System.out.printf("%-15s %10s%n", "Total:", String.format("$%.2f", getTotal()));

        System.out.println("===================================");
    }
}