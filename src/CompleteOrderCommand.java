public class CompleteOrderCommand implements OrderCommand {
    private Order order;

    public CompleteOrderCommand(Order order) {
        this.order = order;
    }

    public void execute() {
        order.complete();
    }
}