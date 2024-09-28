// 2. Payroll system for employees

import java.util.Scanner;

public class PayrollSystem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] ids = new int[n];
        double[] hourlyRates = new double[n];
        double[] hoursWorked = new double[n];
        double[] grossPays = new double[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine(); // clear buffer
            System.out.print("Enter name for employee " + (i + 1) + ": ");
            names[i] = sc.nextLine();
            System.out.print("Enter employee ID for " + names[i] + ": ");
            ids[i] = sc.nextInt();
            System.out.print("Enter hourly rate for " + names[i] + ": ");
            hourlyRates[i] = sc.nextDouble();
            System.out.print("Enter hours worked for " + names[i] + ": ");
            hoursWorked[i] = sc.nextDouble();
            grossPays[i] = hourlyRates[i] * hoursWorked[i];
        }

        System.out.println("Employee Payroll Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Employee: " + names[i] + " | ID: " + ids[i] + 
                               " | Hourly Rate: $" + hourlyRates[i] + 
                               " | Hours Worked: " + hoursWorked[i] + 
                               " | Gross Pay: $" + grossPays[i]);
        }
        sc.close();
    }
}
