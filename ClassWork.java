/*write a java program to accept infinite number from a user and calculate the total 
-positive numbers 
-negative numbers
-zero*/

import java.util.Scanner;


public class ClassWork{
	
	
	public static void main(String[] args){
		int num= 0 ,zero =0 , pos =0, neg =0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number or -1 to quit: ");
		
		
		while(true){
			
			num = input.nextInt();
			
			if(num == 0 ){
				zero += 1;
			}
			if(num < -1){
				neg += 1;
			}
			if(num>0){
				pos += 1;
			}
			if(num == -1){
				break;
			}
		}
		
		System.out.printf("negative =  %d %n Zero = %d%n Positive = %d",neg,zero,pos);
	}
}