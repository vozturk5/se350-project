public class CompletedState implements OrderState {
    public String getStatusName() {
        return "COMPLETED";
    }

    public boolean canModifyOrder() {
        return false;
    }

    public void pay(Order order) {
        System.out.println("Completed orders cannot be paid again.");
    }

    public void prepare(Order order) {
        System.out.println("Completed orders cannot be prepared again.");
    }

    public void markReady(Order order) {
        System.out.println("Completed orders are already finished.");
    }

    public void complete(Order order) {
        System.out.println("Order is already completed.");
    }

    public void cancel(Order order) {
        System.out.println("Completed orders cannot be cancelled.");
    }
}