public class AddItemCommand implements OrderCommand {
    private Order order;
    private MenuItem item;
    private int quantity;

    public AddItemCommand(Order order, MenuItem item, int quantity) {
        this.order = order;
        this.item = item;
        this.quantity = quantity;
    }

    public void execute() {
        for (int i = 0; i < quantity; i++) {
            order.addItem(item);
        }

        System.out.println("Command executed: added " + quantity + " " + item.getName() + "(s).");
    }
}