package carshop.interfaces;

public interface Customer {
    String getCarPrice();
    String getCarColors();
    String getCarPrice(int id);
    String getCarColor(int id);
    String purchaseCar(int id);
}
