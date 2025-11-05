import java.util.Scanner;

public class Sales_Commission_Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double item1 = 239.99;
        double item2 = 129.75;
        double item3 = 99.95;
        double item4 = 350.89;
        double totalSales = 0.0;
        double commissionRate = 0.09;
        double basePay = 200.00;

        System.out.println("***** Sales Commission Calculator *****");
        System.out.println("Item\tValue");
        System.out.println("1\t" + item1);
        System.out.println("2\t" + item2);
        System.out.println("3\t" + item3);
        System.out.println("4\t" + item4);
        System.out.println("Enter -1 to finish.\n");

        while (true) {
            System.out.print("Enter item number sold (1 to 4) or -1 to quit: ");
            int item = input.nextInt();

            if (item == -1) {
                break;
            }

            switch (item) {
                case 1:
                    totalSales += item1;
                    break;
                case 2:
                    totalSales += item2;
                    break;
                case 3:
                    totalSales += item3;
                    break;
                case 4:
                    totalSales += item4;
                    break;
                default:
                    System.out.println("Invalid item number. Try again.");
            }
        }

        double earnings = basePay + (commissionRate * totalSales);

        System.out.printf("%nTotal Sales: $%.2f%n", totalSales);
        System.out.printf("Earnings for the week: $%.2f%n", earnings);

        input.close();
    }
}
