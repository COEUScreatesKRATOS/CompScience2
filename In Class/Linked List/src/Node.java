
public class Node 
{
	private Book theBook;
	private Node nextNode;
	
	public Node(Book b, Node n)
	{
		theBook = b;
		nextNode = n;
	}
	
	public Node nextNode()
	{
		return nextNode;
	}
	
	public Book getValue()
	{
		return theBook;
	}
	
	public void setNext(Node n)
	{
		nextNode = n;
	}
	
	public void setValue(Book b)
	{
		theBook = b;
	}
	
	public String toString()
	{
		return "[" + theBook.toString() + "]";
				
	}

}
