public class SelectionStatement{
	
	
	public static void main(String[] args){
		int age = 18;
		
		//Single Selection
	/*	if(age >= 18){
			System.out.println("--------------------------------------------");
			
			System.out.println("wow, you are an adult. ");
			System.out.println("--------------------------------------------");
			System.out.println("Being an adult is not fun. ");
			System.out.println("--------------------------------------------");
			
		}
	*/	
		//Double Selection
		int num1 = 5;
		int num2 = 2;
		if(num1>num2){
			System.out.println();
			
			System.out.printf("num1 (%d) is the greatest. ",num1);
			System.out.println();
			
		}
		else{
			System.out.println();
			System.out.printf("num2 (%d) is the greater number",num2);
			System.out.println();
			
		}
	}
}