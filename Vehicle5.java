// 5. Write a Java program to create a base class Vehicle with a method calculateFuelEfficiency(). Implement two derived classes, Car and Truck, that override the calculateFuelEfficiency() method to calculate the fuel efficiency based on their respective fuel consumption rates and distance traveled. Demonstrate polymorphism by creating an array of Vehicle objects that refer to Car and Truck instances and call the calculateFuelEffieciency() method.

class Vehicle {
    public double calculateFuelEfficiency() {
        return 0;
    }
}

class Car extends Vehicle {
    private double fuelConsumed;
    private double distanceTraveled;

    public Car(double fuelConsumed, double distanceTraveled) {
        this.fuelConsumed = fuelConsumed;
        this.distanceTraveled = distanceTraveled;
    }

    @Override
    public double calculateFuelEfficiency() {
        return distanceTraveled / fuelConsumed;
    }
}

class Truck extends Vehicle {
    private double fuelConsumed;
    private double distanceTraveled;

    public Truck(double fuelConsumed, double distanceTraveled) {
        this.fuelConsumed = fuelConsumed;
        this.distanceTraveled = distanceTraveled;
    }

    @Override
    public double calculateFuelEfficiency() {
        return distanceTraveled / fuelConsumed;
    }
}

public class Vehicle5 {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car(10, 100);
        vehicles[1] = new Truck(20, 200);

        for (Vehicle vehicle : vehicles) {
            System.out.println("Fuel Efficiency: " + vehicle.calculateFuelEfficiency());
        }
    }
}
