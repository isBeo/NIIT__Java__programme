import java.util.Scanner;

public class EncryptData {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 4-digit number to encrypt: ");
        int number = input.nextInt();

        // extract digits
        int d1 = (number / 1000) % 10;
        int d2 = (number / 100) % 10;
        int d3 = (number / 10) % 10;
        int d4 = number % 10;

        // encrypt each digit
        d1 = (d1 + 7) % 10;
        d2 = (d2 + 7) % 10;
        d3 = (d3 + 7) % 10;
        d4 = (d4 + 7) % 10;

        // swap 1st ↔ 3rd and 2nd ↔ 4th
        int temp = d1; d1 = d3; d3 = temp;
        temp = d2; d2 = d4; d4 = temp;

        int encrypted = d1 * 1000 + d2 * 100 + d3 * 10 + d4;

        System.out.printf("Encrypted number: %04d%n", encrypted);

        input.close();
    }
}
