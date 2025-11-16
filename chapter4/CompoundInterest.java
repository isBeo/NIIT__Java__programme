/*
	4.14 (Modified Compound-Interest Program) Modify the compound-interest 
	application to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%.
	Use a for loop to vary the interest rate. 
*/

public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.0; // initial amount
        double amount;

        System.out.printf("%-10s%-10s%-20s%n", "Rate", "Year", "Amount on Deposit");

        // outer loop for interest rates from 5% to 10%
        for (double rate = 0.05; rate <= 0.10; rate += 0.01) {
            // inner loop for years 1 through 10
            for (int year = 1; year <= 10; year++) {
                amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%-10.2f%-10d$%,.2f%n", rate * 100, year, amount);
            }
            System.out.println(); // blank line after each rate group
        }
    }
}
