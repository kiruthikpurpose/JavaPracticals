// 10. Design a Java program that features a method called validateAge(int age). Employ the throws keyword to throw an IllegalArgumentException if the age is below 18 years.

public class AgeValidation10 {
    public static void validateAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15); 
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
