// 4. Design a class hierarchy for different shapes. Create a base class called Shape with a method called area() 
// that returns 0. Then, create derived classes called Circle and Rectangle that override the area() method 
// to return the area of the respective shape. Provide a clear and detailed explanation of the class hierarchy, 
// including the constructors, member variables, and methods for each class using Java.

// 4. Shape hierarchy with Circle and Rectangle

class Shape {
    // Method to calculate area (default for base class)
    public double area() {
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override area method for Circle
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length, width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override area method for Rectangle
    @Override
    public double area() {
        return length * width;
    }
}

public class ShapeDemo4 {
    public static void main(String[] args) {
        // Create Circle and Rectangle objects using polymorphism
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        // Display the area of Circle and Rectangle
        System.out.println("Area of the Circle: " + circle.area());
        System.out.println("Area of the Rectangle: " + rectangle.area());
    }
}