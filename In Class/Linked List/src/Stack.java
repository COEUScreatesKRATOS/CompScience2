
public class Stack 
{
	private LinkedList myStack;
	
	public Stack()
	{
		myStack = new LinkedList();
	}
	
	//add the book b on top of the stack
	public void push(Book b)
	{
		myStack.insertAtHead(b);
	}
	
	//give me the book on top of the stack
	public Book pop()
	{
		Book b = myStack.getHeadValue();
		myStack.deleteHead();
		return b;
	}

	public String toString()
	{
		String outputString = "The Stack:\n";
		outputString += myStack.toString();
		return outputString;
	}
	public static void main(String[] args)
	{
		Stack s = new Stack();
		s.push( new Book("A", 1));
		s.push(new Book("B", 40));
		s.push(new Book("C", 50));
		
		System.out.println(s);
		
		System.out.println("Pop The stack: " + s.pop());
		
		System.out.println(s);


		
	}
	
}
