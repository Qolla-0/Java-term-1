package carshop.interfaces;

public interface Customer {
    double getCarPrice();
    double getCarColors();
    double getCarPrice(int id);
    double getCarColor(int id);
    double purchaseCar(int id);
}
