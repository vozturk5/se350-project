public class CheckoutCommand implements OrderCommand {
    private Order order;
    private PaymentStrategy paymentStrategy;

    public CheckoutCommand(Order order, PaymentStrategy paymentStrategy) {
        this.order = order;
        this.paymentStrategy = paymentStrategy;
    }

    public void execute() {
        order.checkout(paymentStrategy);
    }
}