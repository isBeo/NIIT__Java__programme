public class TypeCasting{
	public static void main(String[] args){
		// widening
		double num = 10;
		
		//narrowing 
		double price = 321.83;
		int result = (int)price;
		
		
		System.out.printf("the value is %.2f%n",num);
		System.out.printf("The value is %d",result);
	}
}