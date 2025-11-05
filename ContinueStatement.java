public class ContinueStatement {

    public static void main(String[] args) {
        
        int i = 1;
        
        while(i <= 10) {
            
            if(i == 5 || i == 9) {
                System.out.println("This line was skipped.");
                i++; // increment before continue to avoid infinite loop
                continue; // skip the rest of the loop
            }
            
            System.out.println("Testing the continue statement.");
            i++;
        }
    }
}
