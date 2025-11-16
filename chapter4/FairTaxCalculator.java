/*
4.31 (Tax Plan Alternatives; The “FairTax”) 
There are many proposals to make taxation fairer. Check out the FairTax initiative in the United States at www.fairtax.org. Research 

*/



import java.util.Scanner;


public class FairTaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- Let user choose tax interpretation ---
        System.out.println("🧾 FairTax Calculator");
        System.out.println("Choose tax rate interpretation:");
        System.out.println("1. 23% (FairTax supporters’ view)");
        System.out.println("2. 30% (FairTax opponents’ view)");
        System.out.print("Enter choice (1 or 2): ");
        int choice = input.nextInt();

        double taxRate = (choice == 2) ? 0.30 : 0.23;
        System.out.printf("%nUsing a %.0f%% consumption tax rate.%n%n", taxRate * 100);

        // --- Ask user for annual spending in each category ---
        System.out.print("Enter your annual housing expenses: $");
        double housing = input.nextDouble();

        System.out.print("Enter your annual food expenses: $");
        double food = input.nextDouble();

        System.out.print("Enter your annual clothing expenses: $");
        double clothing = input.nextDouble();

        System.out.print("Enter your annual transportation expenses: $");
        double transportation = input.nextDouble();

        System.out.print("Enter your annual education expenses: $");
        double education = input.nextDouble();

        System.out.print("Enter your annual healthcare expenses: $");
        double healthcare = input.nextDouble();

        System.out.print("Enter your annual vacation expenses: $");
        double vacation = input.nextDouble();

        // --- Compute total spending ---
        double totalSpending = housing + food + clothing + transportation + education + healthcare + vacation;

        // --- Compute FairTax ---
        double fairTax = totalSpending * taxRate;

        // --- Display results ---
        System.out.println("\n========================================");
        System.out.printf("Total annual spending: $%,.2f%n", totalSpending);
        System.out.printf("Estimated FairTax owed: $%,.2f%n", fairTax);
        System.out.println("========================================");

        input.close();
    }
}
