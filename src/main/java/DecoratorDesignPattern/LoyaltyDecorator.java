public class LoyaltyDecorator extends MenuItemDecorator {
    public LoyaltyDecorator(MenuItems item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return item.getPrice() - 1.0;
    }

    @Override
    public String getToppings() {
        return item.getToppings() + ", Loyalty Member Discount";
    }
}