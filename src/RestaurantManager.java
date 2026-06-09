import java.util.ArrayList;

public class RestaurantManager {
    private static RestaurantManager instance;
    private String restaurantName;
    private ArrayList<Order> completedOrders;
    private ArrayList<Order> cancelledOrders;

    private RestaurantManager() {
        this.restaurantName = "SE350 Restaurant";
        this.completedOrders = new ArrayList<>();
        this.cancelledOrders = new ArrayList<>();
    }

    public static RestaurantManager getInstance() {
        if (instance == null) {
            instance = new RestaurantManager();
        }

        return instance;
    }

    public void printWelcomeMessage() {
        System.out.println("Welcome to " + restaurantName);
    }

    public void recordCompletedOrder(Order order) {
        if (order.getStatus().equals("COMPLETED")) {
            completedOrders.add(order);
            System.out.println("Restaurant Manager recorded completed order #" + order.getOrderId() + ".");
        }
    }

    public void recordCancelledOrder(Order order) {
        if (order.getStatus().equals("CANCELLED")) {
            cancelledOrders.add(order);
            System.out.println("Restaurant Manager recorded cancelled order #" + order.getOrderId() + ".");
        }
    }

    public int getCompletedOrders() {
        return completedOrders.size();
    }

    public int getCancelledOrders() {
        return cancelledOrders.size();
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void printManagerSummary() {
        System.out.println("========== MANAGER SUMMARY ==========");
        System.out.println("Completed orders: " + getCompletedOrders());
        System.out.println("Cancelled orders: " + getCancelledOrders());
        System.out.println("=====================================");
    }
}