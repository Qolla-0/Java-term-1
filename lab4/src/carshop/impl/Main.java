package carshop.impl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyOwnAutoShop autoShop = MyOwnAutoShop.addCars();

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            menuMessage();
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Invalid input");
            }

            switch (choice) {
                case 1:
                    System.out.println(autoShop.getCarPrice());
                    break;
                case 2:
                    System.out.println(autoShop.getCarColors());
                    break;
                case 3:
                    System.out.println("Enter car index (0-4): ");
                    if (scanner.hasNextInt()) {
                        int priceIndex = scanner.nextInt();
                        if (priceIndex >= 0 && priceIndex <= 4) {
                            System.out.println(autoShop.getCarPrice(priceIndex));
                        } else {
                            System.out.println("Invalid car index");
                        }
                    } else {
                        System.out.println("Invalid car index");
                    }
                    break;
                case 4:
                    System.out.println("Enter car index (0-4): ");
                    if (scanner.hasNextInt()) {
                        int colorIndex = scanner.nextInt();
                        if (colorIndex >= 0 && colorIndex <= 4) {
                            System.out.println(autoShop.getCarColor(colorIndex));
                        } else {
                            System.out.println("Invalid car index");
                        }
                        break;
                    }
                case 5:
                    System.out.println("Enter car index (0-4): ");
                    if (scanner.hasNextInt()) {
                        int purchaseIndex = scanner.nextInt();
                        if (purchaseIndex >= 0 && purchaseIndex <= 4) {
                            System.out.println(autoShop.purchaseCar(purchaseIndex));
                        } else {
                            System.out.println("Invalid car index");
                        }
                    } else {
                        System.out.println("Invalid car index");
                    }
                    break;
                case 6:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 6);

        scanner.close();
    }

    static void menuMessage() {
        System.out.println("\n" + "Welcome to the Auto Shop!");
        System.out.println("Please select an option:");
        System.out.println("1. Show all car prices");
        System.out.println("2. Show all car colors");
        System.out.println("3. Get price of a specific car");
        System.out.println("4. Get color of a specific car");
        System.out.println("5. Purchase a car");
        System.out.println("6. Exit");
    }
}
