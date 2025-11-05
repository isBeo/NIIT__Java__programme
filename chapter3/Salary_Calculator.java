import java.util.Scanner;

public class Salary_Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // We’ll calculate for 3 employees
        int employeeCount = 3;

        System.out.println("***** Salary Calculator *****");

        for (int i = 1; i <= employeeCount; i++) {
            System.out.println("\nEmployee " + i);

            System.out.print("Enter employee name: ");
            String name = input.next();

            System.out.print("Enter hours worked last week: ");
            double hoursWorked = input.nextDouble();

            System.out.print("Enter hourly rate: ");
            double hourlyRate = input.nextDouble();

            double grossPay;

            if (hoursWorked <= 40) {
                grossPay = hoursWorked * hourlyRate;
            } else {
                double overtimeHours = hoursWorked - 40;
                grossPay = (40 * hourlyRate) + (overtimeHours * hourlyRate * 1.5);
            }

            System.out.printf("Gross pay for %s: $%.2f%n", name, grossPay);
        }

        input.close();
        System.out.println("\nAll employee salaries calculated successfully!");
    }
}
