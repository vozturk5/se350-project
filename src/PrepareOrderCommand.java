public class PrepareOrderCommand implements OrderCommand {
    private Order order;

    public PrepareOrderCommand(Order order) {
        this.order = order;
    }

    public void execute() {
        order.prepare();
    }
}