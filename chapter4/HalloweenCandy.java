import java.util.Scanner;

public class HalloweenCandy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.print("Enter total number of houses visited: ");
        int totalHouses = sc.nextInt();
        
        if (totalHouses < 3) {
            System.out.println("Total houses must be at least 3.");
            return;
        }

        // Number of dollar bills
        int dollarBills = 2;

        // Calculate percentage chance
        double percentage = ((double)dollarBills / totalHouses) * 100;

        // Round up to nearest whole number
        int roundedPercentage = (int) Math.ceil(percentage);

        // Output
        System.out.println(roundedPercentage + "%");
    }
}