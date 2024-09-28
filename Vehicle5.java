// 5. Write a Java program to create a base class Vehicle with a method calculateFuelEfficiency(). 
// Implement two derived classes, Car and Truck, that override the calculateFuelEfficiency() method 
// to calculate the fuel efficiency based on their respective fuel consumption rates and distance traveled. 
// Demonstrate polymorphism by creating an array of Vehicle objects that refer to Car and Truck instances 
// and call the calculateFuelEfficiency() method.

class Vehicle {
    // Method to calculate fuel efficiency (default for base class)
    public double calculateFuelEfficiency() {
        return 0;
    }
}

class Car extends Vehicle {
    private double fuelConsumed;
    private double distanceTraveled;

    // Constructor to initialize fuelConsumed and distanceTraveled
    public Car(double fuelConsumed, double distanceTraveled) {
        this.fuelConsumed = fuelConsumed;
        this.distanceTraveled = distanceTraveled;
    }

    // Override calculateFuelEfficiency method for Car
    @Override
    public double calculateFuelEfficiency() {
        return distanceTraveled / fuelConsumed;
    }
}

class Truck extends Vehicle {
    private double fuelConsumed;
    private double distanceTraveled;

    // Constructor to initialize fuelConsumed and distanceTraveled
    public Truck(double fuelConsumed, double distanceTraveled) {
        this.fuelConsumed = fuelConsumed;
        this.distanceTraveled = distanceTraveled;
    }

    // Override calculateFuelEfficiency method for Truck
    @Override
    public double calculateFuelEfficiency() {
        return distanceTraveled / fuelConsumed;
    }
}

public class Vehicle5 {
    public static void main(String[] args) {
        // Create an array of Vehicle objects
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car(10, 100); // Car consumes 10 units of fuel for 100 units of distance
        vehicles[1] = new Truck(20, 200); // Truck consumes 20 units of fuel for 200 units of distance

        // Iterate through vehicles and display fuel efficiency
        for (Vehicle vehicle : vehicles) {
            System.out.println("Fuel Efficiency: " + vehicle.calculateFuelEfficiency());
        }
    }
}
