import java.util.Scanner;

public class UserInput{
	/*
		Input data from user in java
		to obtain input data from a user in java , the scanner class is commonly employed.
		The scanner class is a built-in class and it is part of the java.util package and provide
		methods for parsing various data types from an input stream, typically System.in(the 
		standard input, usually the keyboard).
		
		Common Scanner Methods:
		nextByte(): reads a byte
		nextShort(): reads a short
		nextInt(): reads an integer
		nextLine(): reads strings of character
		nextBool(): reads booleans etc
		
		
		INPUT DATA FROM USER IN JAVA 
			to obtain 
			
			
			
		OPERATORS IN JAVA :
		Operators in java are special symbols that tells the compiler on how to ...
		
		
		
	*/
	
	public static void main(String[] args){
		
		double bal = 542.21;
		char dollar = '$';
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your  first name : ");
		String firstName = scanner.nextLine();
		
		
		System.out.println("What is your  last name : ");
		String lastName = scanner.nextLine();
		
		
		System.out.print("what is your age: ");
		Short age = scanner.nextShort();
		
		System.out.printf(
		"Welcome %s %s to Opay Micro Finance Bank. You are %d years old. Your balance is %c%.2f",
							firstName,
							lastName,
							age,
							dollar,
							bal);
		
		scanner.close();
		
	}
	
	
}