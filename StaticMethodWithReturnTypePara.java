import java.util.Scanner;

public class StaticMethodWithReturnTypePara{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter your name: ");
		String person = input.nextLine();
		int add = addition(23238,3223,3233);
		System.out.println("\n****************************");
		System.out.printf("Welcome to my website,%s%nYour bill is $%d",person,add);
		System.out.println("\n****************************\n");
		
	}//end of the main method
	
	public static String myName(String name){
		
		return name;
	}//end of the myName method
	
	public static int addition(
		int num1,
		int num2,
		int num3){
		
		int sin = num1 + num2 + num3;
		
		return sin;
	}//end of the addition method
}//end of the class