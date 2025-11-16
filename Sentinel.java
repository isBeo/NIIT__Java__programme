import java.util.Scanner;

public class Sentinel{
	
	
	public static void main(String[] args){
		
		int num ;
		Scanner input = new Scanner(System.in);
		int sum = 0 ;
		int counter =  0 ;
		
		System.out.print("Enter number or \"-1\": ");
		
		while(true){
			
			num = input.nextInt();
			
			if(num == -1 ){
				break;
			}
			
			sum += num;
			counter++;
			
			
		}//end of the while loop
		
		
		
		System.out.printf("The total %d number(s) is %d%n",counter,sum);
	}//end of the main method
}//end of the sentinel class