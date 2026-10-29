public class CheeseDecorator extends MenuItemDecorator {
    public CheeseDecorator(MenuItems item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 0.6;
    }

    @Override
    public String getToppings() {
        return item.getToppings() + ", Cheese";
    }
}