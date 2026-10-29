public class Driver {

    public static void main (String[] args) {
        MenuItems burger = new Burger();
        burger = new KetchupDecorator(burger);
        burger = new OnionDecorator(burger);
        burger = new CheeseDecorator(burger);
        System.out.print("Item Description: " + burger.getToppings() + "\nCost: $" + burger.getPrice() + "\n");

        MenuItems hotdog = new Hotdog();
        hotdog = new KetchupDecorator(hotdog);
        hotdog = new LoyaltyDecorator(hotdog);
        System.out.print("Item Description: " + hotdog.getToppings() + "\nCost: $" + hotdog.getPrice() + "\n");
    
        MenuItems fries = new Fries();
        fries = new KetchupDecorator(fries);
        fries = new LoyaltyDecorator(fries);
        System.out.print("Item Description: " + fries.getToppings() + "\nCost: $" + fries.getPrice() + "\n");

    }
}