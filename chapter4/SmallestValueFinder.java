/*
	
4.11 (Find the Smallest Value) Write an application that finds the smallest of several integers. 
Assume that the first value read specifies the number of values to input from the user. 

*/

import java.util.Scanner;

public class SmallestValueFinder {
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int count = input.nextInt();

        System.out.print("Enter number 1: ");
        int smallest = input.nextInt();

        for (int i = 2; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();

            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("The smallest number is: " + smallest);
        input.close();
    }
}
