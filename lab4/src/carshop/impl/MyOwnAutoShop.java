package carshop.impl;

import carshop.cars.Ford;
import carshop.cars.Sedan;
import carshop.cars.Truck;
import carshop.interfaces.Admin;
import carshop.interfaces.Customer;

public class MyOwnAutoShop implements Admin, Customer {
    private Sedan sedan;
    private Ford fordFirst;
    private Ford fordSecond;
    private Truck truckFirst;
    private Truck truckSecond;

    public MyOwnAutoShop(Sedan sedan, Ford fordFirst, Ford fordSecond, Truck truckFirst, Truck truckSecond) {
        this.sedan = new Sedan(140, true, 50000, "White", 35);
        this.fordFirst = new Ford(200, false, 36000, "Black", 2024, 1200);
        this.fordSecond = new Ford(180, true, 30000, "Red", 2023, 2000);
        this.truckFirst = new Truck(100, true, 29000, "Grey", 1200);
        this.truckSecond = new Truck(90, false, 22000, "Blue", 1000);
    }

    public double getIncome() {
        double totalIncome = 0.0;
        return totalIncome;
    }

    public double getCarPrice() {
        //TODO
    }

    public double getCarColors() {
        //TODO
    }

    public double getCarPrice(int id) {
        //TODO
    }

    public String getCarColor(int id) {
        //TODO
    }

    public double purchaseCar(int id) {
        //TODO
    }
}
