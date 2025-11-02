import java.util.Scanner;
public class MilageCalculator{
	/*
		Algorithm: Gas Mileage Calculator

				Start

						Initialize variables:

								totalMiles = 0

								totalGallons = 0

								miles = 0

								gallons = 0

						Create a Scanner to read user input.

						Prompt the user to enter miles driven (integer) or -1 to end.

						Read the miles.

						While miles is not -1:

								Prompt the user to enter gallons used (integer).

								Read gallons.

								Calculate miles per gallon for this trip:
								mpg = (double) miles / gallons

								Display the miles per gallon for the trip.

								Add miles to totalMiles.

								Add gallons to totalGallons.

								Calculate combined miles per gallon so far:
								combinedMPG = (double) totalMiles / totalGallons

								Display the combined MPG.

								Prompt again for next miles driven (or -1 to end).

						End loop when miles = -1.

						If totalGallons > 0, display the final overall MPG.

				Stop


	*/
	
	
	

		
	public static void main(String[] args){
		
		int totalMiles = 0;
		int totalGallons = 0;
		int	miles = 0;
		int gallons = 0;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		
		System.out.println("*********** Program Begins ***************************");
		System.out.println();
		
		
		System.out.println("		Milage Calculator");
		System.out.println();
		
		
		System.out.print("Enter Miles Covered: ");
		miles = input.nextInt();
		
		while(miles != -1 ){
			
			
			System.out.print("Enter gallons used (integer): ");
			gallons = input.nextInt();
			
			if(gallons < 1){
				System.out.println("\nError: You can not drive a vehicle with out fuel.\n");
				break;
			}//end of if statement
			
			double mpg = (double) miles / gallons;
			
			System.out.println("__________________________________");
			System.out.println("Result:");
			System.out.printf("%nYour milage for a distance of %d miles,%n with %d gallons of fuel is %.2f mpg%n ",
				miles,gallons,mpg);
			System.out.println("__________________________________");
			
			totalMiles += miles;
			totalGallons += gallons;
			
			System.out.print("\nEnter any additional miles covered. Quit (\"-1\"): ");	
			int ex__miles = input.nextInt();
			
			if(ex__miles == -1){
				System.out.println("Thank you for testing this program. ");
				System.out.printf("%nYour milage for a distance of %d miles,%n with %d gallons of fuel is %.2f mpg%n ",
				miles,gallons,mpg);
				break;
			}//end of if
			
			totalMiles += ex__miles ;
			
			System.out.print("\nEnter any additional gallons used. Cancel (\"-1\"): ");	
			int ex__gallons = input.nextInt();
			
			if(ex__gallons == -1){
				System.out.println("Invalid input. ");
				break;
			}//end of if
			
			totalGallons += ex__gallons ;
			
			double combinedMPG = (double) totalMiles / totalGallons;
				
				
			System.out.println("__________________________________");
			System.out.println("Result:");
			System.out.printf("%nYour total milage for a distance of %d miles,%n with %d  total gallons of fuel is %.2f mpg%n ",
				totalMiles,totalGallons,combinedMPG);
			System.out.println("__________________________________");
			System.out.print("\n Enter next mile . Enter \"-1\" to cancel: ");
			miles = input.nextInt();
			
				
		}//end of while loop
		
		System.out.println();
		System.out.println("************ Program Ends **************************");
		System.out.println();
		
		
		
	}//end of main()
}//end of class MilageCalculator

