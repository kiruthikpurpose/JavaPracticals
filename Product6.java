// 6. Design an abstract class called Product with the following abstract methods: calculateDiscount() and displayDetails(). Implement two subclasses, Electronics and Clothing, that extend the Product class and provide specific implementations for the methods. Demonstrate abstraction by allowing the user to input details of both products and calculate discounts.

abstract class Product {
    public abstract double calculateDiscount();
    public abstract void displayDetails();
}

class Electronics extends Product {
    private String name;
    private double price;
    private double discountRate;

    public Electronics(String name, double price, double discountRate) {
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
    }

    @Override
    public double calculateDiscount() {
        return price * discountRate / 100;
    }

    @Override
    public void displayDetails() {
        System.out.println("Electronics: " + name + ", Price: $" + price + ", Discount: $" + calculateDiscount());
    }
}

class Clothing extends Product {
    private String type;
    private double price;
    private double discountRate;

    public Clothing(String type, double price, double discountRate) {
        this.type = type;
        this.price = price;
        this.discountRate = discountRate;
    }

    @Override
    public double calculateDiscount() {
        return price * discountRate / 100;
    }

    @Override
    public void displayDetails() {
        System.out.println("Clothing: " + type + ", Price: $" + price + ", Discount: $" + calculateDiscount());
    }
}

public class Product6 {
    public static void main(String[] args) {
        Product electronics = new Electronics("Laptop", 1000, 10);
        Product clothing = new Clothing("Jacket", 200, 15);

        electronics.displayDetails();
        clothing.displayDetails();
    }
}
