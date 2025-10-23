public class TypeCasting{
	public static void main(String[] args){
		// widening
		double num = 10;
		
		//narrowing 
		double price = 321.83;
		int result = (int)price;
		
		/*  
			TOKENS: these are the smallest units of a program that the compiler can understand
			Think of them like the words and punctuation marks in a sentence - they are
			the building blocks of java code. These includes:
			1.keywords:
				keywords are predefined words in java that have special meanings and cannot 
				be used for variable names or other purposes.
				
			2. IDENTIFIERS: these are names for variables , classes methods 
				Rules:
					must not start with a digit,
					no spaces allowed,
					java is case-sensitive,
					
			3. Literals - fixed values in code
			
			4. Statements= endings with semi-colon
			
	ASSIGNMENT one: in msword, type out all the tokens of java and push to github.
	ASSIGNMENT two: in msword, type out all the tokens of java and push to github.
			GUIDELINE:
				create a folder with the name of the chapter and encapsulate the files 
				for the assignment.
	
					
				
		*/
		System.out.printf("the value is %.2f%n",num);
		System.out.printf("The value is %d",result);
	}
}