public class OnionDecorator extends MenuItemDecorator {
    public OnionDecorator(MenuItems item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 0.5;
    }

    @Override
    public String getToppings() {
        return item.getToppings() + ", Onions";
    }
}