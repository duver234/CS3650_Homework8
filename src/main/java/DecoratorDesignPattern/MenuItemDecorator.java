public class MenuItemDecorator implements MenuItems {
    protected MenuItems item;

    public MenuItemDecorator(MenuItems item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice();
    }

    @Override
    public String getToppings() {
        return item.getToppings();
    }
}