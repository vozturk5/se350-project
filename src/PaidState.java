public class PaidState implements OrderState {
    public String getStatusName() {
        return "PAID";
    }

    public boolean canModifyOrder() {
        return false;
    }

    public void pay(Order order) {
        System.out.println("Order has already been paid.");
    }

    public void prepare(Order order) {
        order.setState(new PreparingState());
        System.out.println("Order status changed to PREPARING.");
    }

    public void markReady(Order order) {
        System.out.println("Order must be prepared before it can be ready.");
    }

    public void complete(Order order) {
        System.out.println("Order cannot be completed before it is ready.");
    }

    public void cancel(Order order) {
        order.setState(new CancelledState());
        System.out.println("Order status changed to CANCELLED.");
    }
}