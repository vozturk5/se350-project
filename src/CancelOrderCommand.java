public class CancelOrderCommand implements OrderCommand {
    private Order order;

    public CancelOrderCommand(Order order) {
        this.order = order;
    }

    public void execute() {
        order.cancel();
    }
}