import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MultipleOperations8 {
    public static void main(String[] args) {
        Scanner scanner = null;
        
        try {
            // File Reading
            try {
                File file = new File("example.txt"); // Replace with a valid file path or use a file that doesn't exist to trigger the exception
                scanner = new Scanner(file);
                System.out.println("File contents:");
                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
            }

            // Array Access
            try {
                int[] arr = new int[5];
                System.out.println("Array element at index 10: " + arr[10]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds: " + e.getMessage());
            }

            // Division
            try {
                int numerator = 10;
                int denominator = 0; 
                int result = numerator / denominator;
                System.out.println("Division result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic error (division by zero): " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
