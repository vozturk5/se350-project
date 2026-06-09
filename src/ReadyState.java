public class ReadyState implements OrderState {
    public String getStatusName() {
        return "READY";
    }

    public boolean canModifyOrder() {
        return false;
    }

    public void pay(Order order) {
        System.out.println("Order has already been paid.");
    }

    public void prepare(Order order) {
        System.out.println("Order has already been prepared.");
    }

    public void markReady(Order order) {
        System.out.println("Order is already ready.");
    }

    public void complete(Order order) {
        order.setState(new CompletedState());
        System.out.println("Order status changed to COMPLETED.");
    }

    public void cancel(Order order) {
        System.out.println("Ready orders cannot be cancelled.");
    }
}