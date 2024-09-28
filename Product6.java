// 6. Design an abstract class called Product with the following abstract methods: 
// calculateDiscount() and displayDetails(). Implement two subclasses, Electronics and Clothing, 
// that extend the Product class and provide specific implementations for the methods. 
// Demonstrate abstraction by allowing the user to input details of both products and calculate discounts.

import java.util.Scanner;

abstract class Product {
    public abstract double calculateDiscount();
    public abstract void displayDetails();
}

class Electronics extends Product {
    private String name;
    private double price;
    private double discountRate;

    // Constructor to initialize Electronics attributes
    public Electronics(String name, double price, double discountRate) {
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
    }

    // Calculate discount for Electronics
    @Override
    public double calculateDiscount() {
        return price * discountRate / 100;
    }

    // Display details of the Electronics product
    @Override
    public void displayDetails() {
        System.out.println("Electronics: " + name + ", Price: $" + price + ", Discount: $" + calculateDiscount());
    }
}

class Clothing extends Product {
    private String type;
    private double price;
    private double discountRate;

    // Constructor to initialize Clothing attributes
    public Clothing(String type, double price, double discountRate) {
        this.type = type;
        this.price = price;
        this.discountRate = discountRate;
    }

    // Calculate discount for Clothing
    @Override
    public double calculateDiscount() {
        return price * discountRate / 100;
    }

    // Display details of the Clothing product
    @Override
    public void displayDetails() {
        System.out.println("Clothing: " + type + ", Price: $" + price + ", Discount: $" + calculateDiscount());
    }
}

public class Product6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input details for Electronics
        System.out.print("Enter Electronics name: ");
        String electronicName = scanner.nextLine();
        System.out.print("Enter Electronics price: ");
        double electronicPrice = scanner.nextDouble();
        System.out.print("Enter Electronics discount rate (%): ");
        double electronicDiscountRate = scanner.nextDouble();

        // Input details for Clothing
        scanner.nextLine(); // Clear the buffer
        System.out.print("Enter Clothing type: ");
        String clothingType = scanner.nextLine();
        System.out.print("Enter Clothing price: ");
        double clothingPrice = scanner.nextDouble();
        System.out.print("Enter Clothing discount rate (%): ");
        double clothingDiscountRate = scanner.nextDouble();

        // Create product instances
        Product electronics = new Electronics(electronicName, electronicPrice, electronicDiscountRate);
        Product clothing = new Clothing(clothingType, clothingPrice, clothingDiscountRate);

        // Display details
        electronics.displayDetails();
        clothing.displayDetails();

        scanner.close();
    }
}