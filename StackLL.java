//CS201 Lab8	
//Nicole Fella

/**
 * Implement Stack interface using instance of LinkedList to maintain data
 * @author nicole
 * 
 */
public class StackLL<T> implements Stack<T>
{
	/**
	 * The head of the list will represent the top of stack
	 */
	LinkedList<T> list = new LinkedList<T>();
	
	/**
	 * Operation push to add data (parameter) to top of stack
	 */
	public void push(T data)
	{
		this.list.insertFirst(data);
	}
	
	/**
	 * Operation pop to remove something from top of stack 
	 */
	public T pop()
	{
		T localData = this.list.getFirst();
		
		this.list.deleteFirst();
		
		return localData;
		
	}
	
	/**
	 * Query which will check what is at top of stack
	 * @return what is at top of stack
	 */
	public T peek()
	{
		return this.list.getFirst();
	}
	
	/**
	 * Query if the Stack is empty or not
	 * @return boolean true or false
	 */
	public boolean isEmpty()
	{
		return this.list.isEmpty();
	}

}
