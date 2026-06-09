public class CancelledState implements OrderState {
    public String getStatusName() {
        return "CANCELLED";
    }

    public boolean canModifyOrder() {
        return false;
    }

    public void pay(Order order) {
        System.out.println("Cancelled orders cannot be paid.");
    }

    public void prepare(Order order) {
        System.out.println("Cancelled orders cannot be prepared.");
    }

    public void markReady(Order order) {
        System.out.println("Cancelled orders cannot be marked ready.");
    }

    public void complete(Order order) {
        System.out.println("Cancelled orders cannot be completed.");
    }

    public void cancel(Order order) {
        System.out.println("Order is already cancelled.");
    }
}