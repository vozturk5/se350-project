public class CreatedState implements OrderState {
    public String getStatusName() {
        return "CREATED";
    }

    public boolean canModifyOrder() {
        return true;
    }

    public void pay(Order order) {
        order.setState(new PaidState());
        System.out.println("Order status changed to PAID.");
    }

    public void prepare(Order order) {
        System.out.println("Order must be paid before it can be prepared.");
    }

    public void markReady(Order order) {
        System.out.println("Order cannot be marked ready before preparation.");
    }

    public void complete(Order order) {
        System.out.println("Order cannot be completed before payment and preparation.");
    }

    public void cancel(Order order) {
        order.setState(new CancelledState());
        System.out.println("Order status changed to CANCELLED.");
    }
}