public class PreparingState implements OrderState {
    public String getStatusName() {
        return "PREPARING";
    }

    public boolean canModifyOrder() {
        return false;
    }

    public void pay(Order order) {
        System.out.println("Order has already been paid.");
    }

    public void prepare(Order order) {
        System.out.println("Order is already being prepared.");
    }

    public void markReady(Order order) {
        order.setState(new ReadyState());
        System.out.println("Order status changed to READY.");
    }

    public void complete(Order order) {
        System.out.println("Order cannot be completed before it is ready.");
    }

    public void cancel(Order order) {
        order.setState(new CancelledState());
        System.out.println("Order status changed to CANCELLED.");
    }
}