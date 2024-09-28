package ad231.lashuk;

public class Main {
    public static void main(String[] args) {

        Cart cart = new Cart(5);

        Item[] items = {
            new Item("Bread", 40.5F),
            new Item("Milk", 20.0F),
            new Item("Cake", 150.2F),
            new Item("Water", 15.0F),
            new Item("Coffee", 66.0F),
        };

        for (Item item : items) {
            cart.addItem(item);
        }

        printTotalPrice(cart);
        printRaisedPrice(cart);
        printDecreasedPrice(cart);
    }

    public static void printTotalPrice(Cart cart) {
        float totalPrice = cart.calculateTotalPrice();
        System.out.println("Total price : " + totalPrice);
    }

    public static void printRaisedPrice(Cart cart) {
        cart.raisePrices(15.0F);
        float raisedPrice = cart.calculateTotalPrice();
        System.out.println("Raised price : " + raisedPrice);
    }

    public static void printDecreasedPrice(Cart cart) {
        cart.decreasePrices(30.0F);
        float decreasedPrice = cart.calculateTotalPrice();
        System.out.println("Decreased price : " + decreasedPrice);
    }
}