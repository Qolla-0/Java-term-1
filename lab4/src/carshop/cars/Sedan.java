package carshop.cars;

public class Sedan extends Car {
    private int length;

    public Sedan(int speed, boolean isSellOut, double regularPrice, String color, int length) {
        super(speed, isSellOut, regularPrice, color);
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        if (length > 20) {
            return super.regularPrice * 0.80;
        } else {
            return super.regularPrice;
        }
    }
}
