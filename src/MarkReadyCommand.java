public class MarkReadyCommand implements OrderCommand {
    private Order order;

    public MarkReadyCommand(Order order) {
        this.order = order;
    }

    public void execute() {
        order.markReady();
    }
}