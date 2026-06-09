public class RestaurantManager {
    private static RestaurantManager instance;
    private String restaurantName;
    private int completedOrders;

    private RestaurantManager() {
        this.restaurantName = "SE350 Restaurant";
        this.completedOrders = 0;
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
            completedOrders++;
            System.out.println("Restaurant Manager recorded completed order.");
        }
    }

    public int getCompletedOrders() {
        return completedOrders;
    }

    public String getRestaurantName() {
        return restaurantName;
    }
}