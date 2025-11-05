//get 10 numbers from a user and find the sum of all the numbers
import java.util.Scanner;

public class Sum{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int num, 
		i = 1,
		sum = 0;
		
		while(i <= 10){
			System.out.printf("Enter a number%d: ",i);
			num = input.nextInt();
			
			sum += num;
			i++;
			
		}//end of while loop
		
		
		System.out.println("Sum = "+sum);
	}//the end of the main method
}//the end of Sum class