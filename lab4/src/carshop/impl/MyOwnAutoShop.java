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
        this.sedan = sedan;
        this.fordFirst = fordFirst;
        this.fordSecond = fordSecond;
        this.truckFirst = truckFirst;
        this.truckSecond = truckSecond;
    }

    public static MyOwnAutoShop addCars() {
        Sedan sedan = new Sedan(140, true, 50000, "White", 35);
        Ford fordFirst = new Ford(200, false, 36000, "Black", 2024, 1200);
        Ford fordSecond = new Ford(180, true, 30000, "Red", 2023, 2000);
        Truck truckFirst = new Truck(100, true, 29000, "Grey", 1200);
        Truck truckSecond = new Truck(90, false, 22000, "Blue", 1000);

        return new MyOwnAutoShop(sedan, fordFirst, fordSecond, truckFirst, truckSecond);
    }

    public double getIncome() {
        double totalIncome = 0.0;
        totalIncome += sedan.getSalePrice();
        totalIncome += fordFirst.getSalePrice();
        totalIncome += fordSecond.getSalePrice();
        totalIncome += truckFirst.getSalePrice();
        totalIncome += truckSecond.getSalePrice();
        return totalIncome;
    }

    public String getCarPrice() {
        return "Car prices: " + "\n" +
                "Sedan: " + sedan.getSalePrice() + "\n" +
                "First Ford: " + fordFirst.getSalePrice() + "\n" +
                "Second Ford: " + fordSecond.getSalePrice() + "\n" +
                "First Truck: " + truckFirst.getSalePrice() + "\n" +
                "Second Truck: " + truckSecond.getSalePrice();
    }

    public String getCarColors() {
        return "Car colors: " + "\n" +
                "Sedan: " +  sedan.getColor() + "\n" +
                "First Ford: " + fordFirst.getColor() + "\n" +
                "Second Ford: " + fordSecond.getColor() + "\n" +
                "First Truck: " + truckFirst.getColor() + "\n" +
                "Second Truck: " + truckSecond.getColor();
    }

    public String getCarPrice(int id) {
        switch (id) {
            case 0:
                System.out.println("Sedan: " + sedan.getSalePrice());
                break;
            case 1:
                System.out.println("First Ford: " + fordFirst.getSalePrice());
                break;
            case 2:
                System.out.println("Second Ford: " + fordSecond.getSalePrice());
                break;
            case 3:
                System.out.println("First Truck: " + truckFirst.getSalePrice());
                break;
            case 4:
                System.out.println("Second Truck: " + truckSecond.getSalePrice());
                break;
            default:
                System.out.println("Invalid car id");
                break;
        }
        return "";
    }

    public String getCarColor(int id) {
        switch (id) {
            case 0:
                System.out.println("Sedan: " + sedan.getColor());
                break;
            case 1:
                System.out.println("First Ford: " + fordFirst.getColor());
                break;
            case 2:
                System.out.println("Second Ford: " + fordSecond.getColor());
                break;
            case 3:
                System.out.println("First Truck: " + truckFirst.getColor());
                break;
            case 4:
                System.out.println("Second Truck: " + truckSecond.getColor());
                break;
            default:
                System.out.println("Invalid car id");
                break;
        }
        return "";
    }

    public String purchaseCar(int id) {
        switch (id) {
            case 0:
                System.out.println(sedan.getColor() + " Sedan purchased for: " + sedan.getSalePrice());
                break;
            case 1:
                System.out.println(fordFirst.getColor() + " Ford purchased for: " + sedan.getSalePrice());
                break;
            case 2:
                System.out.println(fordSecond.getColor() + " Ford purchased for: " + sedan.getSalePrice());
                break;
            case 3:
                System.out.println(truckFirst.getColor() + " Ford purchased for: " + sedan.getSalePrice());
                break;
            case 4:
                System.out.println(truckSecond.getColor() + " Ford purchased for: " + sedan.getSalePrice());
                break;
            default:
                System.out.println("Invalid car id");
                break;
        }
        return "";
    }
}
