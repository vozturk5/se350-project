import java.util.ArrayList;

public class Order {
    private static int nextId = 1;   // static for unique IDs
    private int orderId;
    private ArrayList<MenuItem> items;

    public Order() {
        this.orderId = nextId++;
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public double getTotal() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void printOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Summary:");

        for (MenuItem item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }

        System.out.println("Total: $" + getTotal());
    }
}