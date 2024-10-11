package carshop.cars;

abstract class Car {
    private int speed;
    private boolean isSellOut;
    protected double regularPrice;
    private String color;

    public Car(int speed, boolean isSellOut, double regularPrice, String color) {
        this.speed = speed;
        this.isSellOut = isSellOut;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public abstract double getSalePrice();
}
