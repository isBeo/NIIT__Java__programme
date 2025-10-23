public class DataType{
	
	
	public static void main(String[] args){
	byte age = 23;
	short quantity = 20394;
	int nigeria__population = 2000000000;
	long worldspopulation = 321000000000000L; 
	float price  = 458.315F;
	double balance = 3456926.29345862;
	char symbol ='$';
	System.out.print("hello data type\n");
		System.out.printf("I am %d old.%n",age);
		System.out.printf("The population is %d %n",nigeria__population);
		System.out.printf("I ordered %d quantity of phones. %n", quantity);
		System.out.printf("The world population is %d%n",worldspopulation);
		System.out.printf("The price for two books is %.2f %n",price);
		System.out.printf("My account balance is %.2f%n",balance);
		System.out.printf("My account balance is %c%f%.2f%n",symbol,balance);
		
		
	}
}