public class DessertFactory extends MenuItemFactory {
    @Override
    public MenuItem createMenuItem() {
        return new MenuItem("Dessert", 4.99);
    }
}