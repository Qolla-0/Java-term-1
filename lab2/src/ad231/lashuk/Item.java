package ad231.lashuk;

public class Item {

    String name;
    float price;

    public Item(String name, float price) {
        this.name = name;
        this.price = checkPrice(price);
    }

    public void raisePriceItem(float percent) {
        percent = checkDiscount(percent);
        price = price + (price * percent / 100);
    }

    public void decreasePriceItem(float percent) {
        percent = checkDiscount(percent);
        price = price - (price * percent / 100);
    }

    private float checkPrice(float price) {
        if (price < 0) {
            price = 0;
        }
        return price;
    }

    private float checkDiscount(float percent) {
        if (percent > 100) {
            percent = 0;
        }
        return percent;
    }

    public void printItem() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}
