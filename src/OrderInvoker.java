import java.util.ArrayList;

public class OrderInvoker {
    private ArrayList<OrderCommand> commandHistory;

    public OrderInvoker() {
        commandHistory = new ArrayList<>();
    }

    public void runCommand(OrderCommand command) {
        command.execute();
        commandHistory.add(command);
    }

    public int getCommandCount() {
        return commandHistory.size();
    }
}