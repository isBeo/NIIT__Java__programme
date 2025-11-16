/*
	4.13 (Factorials) Factorials are used frequently in probability problems. 
	The factorial of a positive integer n (written n! and pronounced “n factorial”) 
	is equal to the product of the positive integers from 1 to n. Write an application 
	that calculates the factorials of 1 through 20. Use type long. Display the results in tabular format.
	 What difficulty might prevent you from calculating the factorial of 100? 

*/

public class Factorials {
    public static void main(String[] args) {
        System.out.printf("%-10s %-25s%n", "Number", "Factorial");

        long factorial = 1;

        for (int n = 1; n <= 20; n++) {
            factorial *= n;
            System.out.printf("%-10d %-25d%n", n, factorial);
        }
    }
}
