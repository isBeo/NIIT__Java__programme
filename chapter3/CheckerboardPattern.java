public class CheckerboardPattern {
    public static void main(String[] args) {

        int row = 1; // start from row 1

        while (row <= 8) { // 8 rows total
            int column = 1;

            // For every even-numbered row, print a leading space
            if (row % 2 == 0) {
                System.out.print(" ");
            }

            // Print 8 stars per row
            while (column <= 8) {
                System.out.print("* ");
                column++;
            }

            // Move to the next line
            System.out.println();

            // Increment row
            row++;
        }
    }
}
