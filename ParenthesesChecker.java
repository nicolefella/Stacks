//CS201 Lab8
//Nicole Fella


/**
 * This class uses a stack to check if the parentheses are matched.
 * @author nicole
 * This program should accept inputs with regular parentheses 
 * and prints out if they are matched or not 
 */
public class ParenthesesChecker {
	/**
	 * Instance Fields
	 */
	StackLL<String> stack;
	
	/**
	 * Constructor instantiates new instance of StackLL
	 */
	public ParenthesesChecker(String parentheses)
	{
		//instantiate new stackLL
		stack = new StackLL<String>();
		
		//Print out whether or not the parentheses are correct
		if(isCorrect(parentheses))
			System.out.println("Correct");
		else
			System.out.println("Error!");
	}
	

	
	/**
	 * Method to check of correct parentheses
	 */
	public boolean isCorrect(String parentheses)
	{
		//iterate through all the parentheses in the input
		for (int i=0; i<parentheses.length(); i++)
		{
			//if the stack is empty
			if (this.stack.isEmpty())
			{
				//cannot pop off nothing
				if(parentheses.substring(i, i+1).equals(")"))
				{
					return false;
				}
				else // when substring equals "("
				{
					//push "(" parentheses onto stack
					this.stack.push(parentheses.substring(i, i+1));
				}
			}
			else // when the stack is not empty
			{
				if(parentheses.substring(i, i+1).equals(")"))
				{
					// when ")", pop off top of stack
					this.stack.pop();
				}
				else // when substring equals "("
				{
					//push "(" parentheses onto stack
					this.stack.push(parentheses.substring(i, i+1));
				}
			}
		}
		//once parentheses stack is finished, if stack is empty return false
		return this.stack.isEmpty();
	}
	
	/**
	 * Main Method
	 */
	public static void main(String[] args)
	{		
		//create new ParenthesesChecker object and read the input from terminal
		new ParenthesesChecker(args[0]);
	}
}
