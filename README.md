# 22CS302 - PROBLEM SOLVING TECHNIQUE III

## List of Experiments

### 1. Matrix Operations
**Question**: Write a Java program for the given matrix of integers and perform the following operations:
- Calculate the sum of each row and each column.
- Find the maximum element in the matrix.
- Transpose the matrix. Use nested loops and conditional to perform the matrix operations and print the results. The matrix will be a 2D array of integers.

**Answer**: 
This program initializes a 2D array (matrix) of integers, computes the sum of each row and column, finds the maximum element, and transposes the matrix. It utilizes nested loops to iterate through the elements and performs calculations accordingly.

### 2. Payroll System
**Question**: You are tasked with developing a payroll system for a company. As a part of this system, you need to create a Java program that can calculate gross pay for employees based on their hourly rate and hours worked. Design and implement a Java program that prints the details of each employee, including their name, employee ID, hourly rate, hours worked, and gross pay, in a user-friendly format.

**Answer**: 
This program defines an Employee class that includes attributes for name, employee ID, hourly rate, and hours worked. It then calculates the gross pay and displays the information in a user-friendly format.

### 3. Student Class
**Question**: Design a Student class with attributes name, id, and grade. Implement getter and setter methods for each attribute to enforce encapsulation. Demonstrate how to use these methods to access and modify student information by using a Java program.

**Answer**: 
The Student class is designed with private attributes and public getter and setter methods to ensure encapsulation. The program demonstrates creating a Student object and using these methods to modify and access student information.

### 4. Shape Hierarchy
**Question**: Design a class hierarchy for different shapes. Create a base class called Shape with a method called area() that returns 0. Then, create derived classes called Circle and Rectangle that override the area() method to return the area of the respective shape. Provide a clear and detailed explanation of the class hierarchy, including the constructors, member variables, and methods for each class using Java.

**Answer**: 
The hierarchy consists of a base class `Shape` with an area method. The `Circle` and `Rectangle` classes extend this base class and implement their own versions of the area method. The program demonstrates polymorphism by creating instances of Circle and Rectangle and calling the area method.

### 5. Vehicle Fuel Efficiency
**Question**: Write a Java program to create a base class Vehicle with a method calculateFuelEfficiency(). Implement two derived classes, Car and Truck, that override the calculateFuelEfficiency() method to calculate the fuel efficiency based on their respective fuel consumption rates and distance traveled. Demonstrate polymorphism by creating an array of Vehicle objects that refer to Car and Truck instances and call the calculateFuelEfficiency() method.

**Answer**: 
This program features a base class `Vehicle` and derived classes `Car` and `Truck`, each implementing their own calculation for fuel efficiency. An array of Vehicle objects is used to demonstrate polymorphism by storing different types of vehicles and calculating their efficiencies.

### 6. Product Abstraction
**Question**: Design an abstract class called Product with the following abstract methods: calculateDiscount() and displayDetails(). Implement two subclasses, Electronics and Clothing, that extend the Product class and provide specific implementations for the methods. Finally, demonstrate the concept of abstraction by allowing the user to input details of an electronic product and a clothing item, calculating their discounts, and displaying their details using Java.

**Answer**: 
An abstract class `Product` defines methods for discount calculation and displaying details. The `Electronics` and `Clothing` subclasses implement these methods. The program allows user input for product details and calculates discounts accordingly.

### 7. Online Payment System
**Question**: Design an online payment system that allows users to make payments using different methods, such as credit cards or PayPal. The system should include an interface called Payment with a method called processPayment(double amount). Create two classes, CreditCardPayment and PayPalPayment, that implement the Payment interface and provide specific implementations for processing payments. Allow the user to input the payment amount and choose the payment method (Credit Card or PayPal). Demonstrate the use of interfaces by processing the payment using the selected method and displaying a confirmation message.

**Answer**: 
This program defines a `Payment` interface with a method for processing payments. The `CreditCardPayment` and `PayPalPayment` classes implement this interface. Users can input the payment amount and select their preferred payment method.

### 8. Exception Handling in Java
**Question**: Write a Java program that performs multiple operations, including file reading, array access, and division. Use nested try-catch blocks to handle multiple exceptions such as FileNotFoundException, ArrayIndexOutOfBoundException, and ArithmeticException. Print appropriate error messages for each exception.

**Answer**: 
The program employs nested try-catch blocks to handle various exceptions. It includes operations like reading from a file, accessing an array, and performing division, each with dedicated exception handling.

### 9. IllegalArgumentException for Negative Numbers
**Question**: Write a Java program that reads an integer from the user. If the number is negative, throw an IllegalArgumentException with the message “Negative numbers are not allowed”.

**Answer**: 
This program reads an integer input from the user and checks if it is negative. If so, it throws an `IllegalArgumentException` with the specified message.

### 10. Age Validation
**Question**: Design a Java program that features a method called validateAge(int age) to access a provided integer age. Employ the throws keyword to throw an IllegalArgumentException if the age is below 18 years.

**Answer**: 
The program includes a `validateAge` method that checks if the provided age is below 18. If it is, the method throws an `IllegalArgumentException`.

### 11. Thread Joining
**Question**: Create a Java program that demonstrates thread joining. Implement a main thread that spawns two threads: Thread A and Thread B. Thread A prints numbers from 1 to 5, and Thread B prints letters from ‘A’ to ‘E’. Ensure Thread B starts only after Thread A has finished.

**Answer**: 
This program demonstrates thread joining by creating two threads. It ensures that Thread B starts after Thread A completes its execution, resulting in synchronized output.

### 12. Thread Synchronization
**Question**: Design a Java program to demonstrate thread synchronization using a synchronized block. Consider a BankAccount class with a balance, and deposit() and withdraw() methods that are synchronized for thread safety. Implement two threads: one for depositing money into the account and another for withdrawing money concurrently.

**Answer**: 
The program features a `BankAccount` class with synchronized methods for depositing and withdrawing money. It creates two threads to demonstrate safe concurrent access to the account balance.
