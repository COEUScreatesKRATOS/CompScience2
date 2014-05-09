
public class Queue 
{
	private LinkedList myQueue;
	
	public Queue()
	{
		myQueue = new LinkedList();
	}
	
	public void enqueue(Book b)
	{
		myQueue.insertAtHead(b);
	}
	
	public Book dequeue()
	{
		Book result = myQueue.getTailValue();
		myQueue.deleteTail();
		return result;
	}
	
	public String toString()
	{
		return myQueue.toString();
	}
	public static void main(String args[])
	{
		Queue q = new Queue();
		q.enqueue(new Book("FlatLand", 4));
		q.enqueue(new Book("Star Ship Troopers", 10));
		q.enqueue(new Book("Twilight", 5));
		q.enqueue(new Book("The Phantom tollbooth", 5));
		
		System.out.println(q);
		
		System.out.println("Dequeue result: " + q.dequeue());
		System.out.println("Dequeue result: " + q.dequeue());
		System.out.println("Dequeue result: " + q.dequeue());
		System.out.println("Dequeue result: " + q.dequeue());

		
		System.out.println(q);

	}

}
