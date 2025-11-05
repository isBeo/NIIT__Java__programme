import java.util.Scanner;

public class Find_Largest_Number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 1;   // counts how many numbers entered
        int number;        // current number input
        int largest = Integer.MIN_VALUE; // smallest possible start value

        System.out.println("***** Find the Largest Number *****");

        while (counter <= 10) {
            System.out.print("Enter integer #" + counter + ": ");
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            }

            counter++;
        }

        System.out.println("\nThe largest number entered is: " + largest);

        input.close();
    }
}
