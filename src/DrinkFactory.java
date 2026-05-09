public class DrinkFactory extends MenuItemFactory {
    @Override
    public MenuItem createMenuItem() {
        return new MenuItem("Drink", 1.99);
    }
}