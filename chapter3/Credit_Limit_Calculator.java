import java.util.Scanner;

public class Credit_Limit_Calculator{
	
	
	public static void main(String[] args){
		
		System.out.println("\n*************** Program Begins *****************\n");
		
		Long accNum;
		
		int	beginningBal,
			charges,
			credits,
			creditLimit,
			newBal;
			
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter account number or \"-1\" to quit: ");
		accNum = input.nextLong();
		
		while(accNum != -1){
			
			System.out.print("Enter beginning balance: ");
			beginningBal = input.nextInt();
			
			System.out.print("\nEnter credits : ");
			credits = input.nextInt();
			
			System.out.print("\nEnter total charges: ");
			charges = input.nextInt();
			
			System.out.print("\nEnter credit limit: ");
			creditLimit = input.nextInt();
			
			//System.out.print("Enter new balance: ");
			newBal = beginningBal + charges - credits;
	
			System.out.printf("New balance is : ",newBal);
			
			System.out.println();
			if(newBal > creditLimit){
				System.out.println("Credit limit exceeded!\n");
			}//end of ifblock
			
			System.out.println("-------------------------------------");
			
			System.out.print("Enter next account number or -1 to quit: ");
			accNum = input.nextLong();
			
			System.out.println("*************** Program Ends *******************");
			
		}//end of the while loop
		
	}//the end of the main method = input.nextInt();
	
			
}//the end of the main class