public class KetchupDecorator extends MenuItemDecorator {
    public KetchupDecorator(MenuItems item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 0.3;
    }

    @Override
    public String getToppings() {
        return item.getToppings() + ", Ketchup";
    }
}