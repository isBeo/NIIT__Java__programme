public class LogicalOperators{
	/*
		Logical operators 
			Logical operators are sed to join two or more conditions or to reverse
			 a condition.
			 
			 Types of Logical Operators in Java:
				a. AND (&&)
					returns true if both conditions are true.
					
				b. OR(||): This returns true if one of the operands is true.
				
				c. NOT(!): rreturns true if at least one condition is true.
				
		unary operators
			unary operators are operators that work on a single operand (one variable or value). 
			they are called unary because they need only one operand to perform an operation.
			
			Types
			
				
	
	*/
	
	
	
	
	
	
	
	public static void main(String[] args){
		
		int num1 = 5;
		int num2 = 25;
		int num3 = 17;
		
		
		//AND LOGICAL OPERATOR
		boolean _AND__result = (num1 > num2) && (num1 > num3);
		System.out.printf("The result is %b%n",_AND__result);
		
		
		// OR LOGICAL OPERATOR
		boolean _OR__result = (num1 > num2) || (num1 > num3);
		System.out.printf("The result is %b",_OR__result);
		
		
		//NOT LOGICAL OPERATOR 
		boolean result3 = !((num1 > num2) && (num1 > num3));
		System.out.printf("The result is %b%n",result3);
		
		System.out.println();
		//Pre-increment unary operator
		int num4 = 10;
		System.out.println("Pre-increment unary operator");
		System.out.printf("before : %d%n",num4);
		System.out.printf("after: %d%n",++num4);
		
		System.out.println();
		//Post-increment unary operator
		int num5 = 10;
		System.out.println("Post-increment unary operator");
		System.out.printf("before : %d%n",num5);
		System.out.printf("after: %d%n",num5++);
		
		
		System.out.println();
		//Pre-decrement unary operator
		//int num6 = 10;
		System.out.println("Pre-decrement unary operator");
		System.out.printf("before : %d%n",num4);
		System.out.printf("after: %d%n",--num4);
		
		System.out.println();
		//Post-decrement unary operator
		//int num7 = 10;
		System.out.println("Post-decrement unary operator");
		System.out.printf("before : %d%n",num5);
		System.out.printf("after: %d%n",num5--);
		
		/*
			CONTROL STRUCTURES
			
				types of control structures
					a. selection (decision)
					b. repetion (loop)
					c. jump
					
					SELECTION TYPES:
						single, double and multiple selection
						
						single selection : if(){}
						
						
		*/
		
		
		
		
	}
}