public class BurgerFactory extends MenuItemFactory {
    @Override
    public MenuItem createMenuItem() {
        return new MenuItem("Burger", 8.99);
    }
}