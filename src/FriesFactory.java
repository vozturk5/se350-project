public class FriesFactory extends MenuItemFactory {
    @Override
    public MenuItem createMenuItem() {
        return new MenuItem("Fries", 3.49);
    }
}