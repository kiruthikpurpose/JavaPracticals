import java.util.Scanner;

public class NegNumbers9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            if (number < 0) {
                throw new IllegalArgumentException("Negative numbers are not allowed");
            } else {
                System.out.println("You entered: " + number);
            }
        } finally {
            scanner.close();
        }
    }
}
