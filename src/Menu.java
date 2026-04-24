import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> items;

    public Menu() {
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void printMenu() {
        System.out.println("========== RESTAURANT MENU ==========");
        for (MenuItem item : items) {
            System.out.printf("%-15s $%.2f%n", item.getName(), item.getPrice());
        }
        System.out.println("=====================================");
    }
}