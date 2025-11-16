public class StaticMethodWithParameterWithNoReturnType{
	public static void main(String[] args){
		
		addition(3,2,5);
		addition(5,2,1);
		addition(84,28,442);
	}//end of the main method
	
	public static void addition(
		int num1 ,
		int num2,
		int num3
	){
		
		//int sum = num1 + num2 + num3;
		
		int sum = num1 + num2 + num3;
		System.out.printf("%nThe sum is %d%n",sum);
	}//end of the addition method
}//end of class 