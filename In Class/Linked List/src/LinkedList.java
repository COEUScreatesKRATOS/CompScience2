
public class LinkedList 
{
	private Node head;
	
	public LinkedList()
	{
		head = null;
	}

	public void insertAtHead(Book b)
	{
		Node newNode = new Node(b, head);
		head = newNode;
	}
	
	public String toString()
	{
		String output = "";
		Node temp = head;
		
		if( temp == null)
		{
			System.out.println("list is empty!");
		}
		while( temp != null)
		{
			output += temp.toString() + "\n";
			temp = temp.nextNode();
		}
		
		return output;
	}
	
	public void deleteHead()
	{
		head = head.nextNode();
	}
	
	public Book getHeadValue()
	{
		return head.getValue();
	}
	
	public void deleteTail()
	{
		Node temp = head;
		if(temp != null && temp.nextNode() == null)
		{
			head = null;
			return;
		}
		while(temp.nextNode().nextNode() != null)
		{
			temp = temp.nextNode();
		}
		temp.setNext(null);
	}
	
	public Book getTailValue()
	{
		Node temp = head;
		if(temp == null)
		{
			return null;
		}
		if(temp.nextNode() == null)
		{
			return temp.getValue();
		}
		while(temp.nextNode().nextNode() != null)
		{
			temp = temp.nextNode();
		}
		return temp.nextNode().getValue();
	}
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.insertAtHead(new Book("Flat Land", 10));
		list.insertAtHead(new Book("The ground land", 3));
		list.insertAtHead(new Book("Star Ship Troopers", 30));
		list.insertAtHead(new Book("Java Something something", 300));

		
		System.out.println(list);
		System.out.println(list);
	}
}
