import java.util.StringTokenizer;

//CS201 Lab8
//Nicole Fella

/**
 * This class will use a stack to evaluate post-fix arithmetic expressions.
 * @author nicole
 * This class will use string tokenizer.
 * This program will support addition and multiplication
 */
public class PostFixCalculator {
	/**
	 * Instance fields
	 */
	StackLL<Integer> calcStack;
	
	/**
	 * Constructor
	 */
	public PostFixCalculator(String equation)
	{
		//create new stackLL which will hold integers 
		calcStack = new StackLL<Integer>();
		
		System.out.println(generateOutput(equation));
	}
	
	/**
	 * Generate output method. Must build and evaluate stack. 
	 * If an integer if found, push it to the stack.
	 * If an operation is found (+ or *) call helper methods.
	 * Helper methods will evaluate and push data back to stack. 
	 * The generated output will be returned
	 */
	public Integer generateOutput(String equation)
	{
		StringTokenizer stringTokenizer = new StringTokenizer(equation);
		String currentToken = "";
		//need to build and evaluate the stack
		while(stringTokenizer.hasMoreTokens())
		{
			//update the current token so you aren't starting with blank
			currentToken = stringTokenizer.nextToken();

			//if a multiplication sign is seen (*)
			if(currentToken.equals("*"))
			{
				//call helper method and push return value to stack
				calcStack.push(multiplication());
			}
			//if an addition sign is seen (+)
			else if (currentToken.equals("+"))
			{
				//call helper method and push return value to stack
				calcStack.push(addition());
			}
			//otherwise the string returns an integer
			else 
			{
				calcStack.push(Integer.valueOf(currentToken));
			}
			
		}
		//temporary return
		return calcStack.pop();
	}
	
	/**
	 * Helper method for addition (+).
	 * Parameters: calcStack
	 */
	public Integer addition()
	{
		return calcStack.pop() + calcStack.pop();
	}
	
	/**
	 * Helper method for multiplication (*)
	 */
	public Integer multiplication()
	{
		return calcStack.pop() * calcStack.pop();
	}
	
	/**
	 * Main Method
	 */
	public static void main(String[] args)
	{
		//create new PostFixCalculator object and read input from terminal
		new PostFixCalculator(args[0]);
	}

}
