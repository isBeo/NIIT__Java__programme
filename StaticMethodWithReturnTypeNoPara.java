public class StaticMethodWithReturnTypeNoPara{
	
	
	public static void main(String[] args){
		
		 int add = addition();
		 
		 System.out.printf("%nThe sum is %d%n",add);
		
	}//end of the main method
	
	public static int addition(){
		
		int num1 = 16;
		int num2 = 8;
		 int num3 = 90;
		 
		 int sum = num1 + num2 + num3 ;
		 
		 
		 return sum;
	}//end of the addition method
}//end class