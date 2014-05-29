/**
 * @author ChrisHardingBrown May 13, 2014 Comp 1672
 */
public class INode {
    // TODO get methods given an index/ object return element at that index

    private Node head;

    public LinkedList() {
        head = null;
    }

    public void insertAtHead(final Book b) {
        final Node newNode = new Node(b, head);
        head = newNode;
    }

    public int getNodeAt(final int i) {
        
        final int UI = i;   
        final int counter = 1;
        final Node temp = head;
        
            while(counter != UI && counter < index){
                temp = Node.nextNode;
                counter++;      
            }
            if ()
        }

    public int linkedListSize() {
        Node temp = head;
        int counter = 0;

        while (temp != null) {
            temp = temp.nextNode();
            counter++;
        }
        return counter;
    }

    public boolean contains(final Book b) {

        if (b) {
            return;
        }

    }

    public reverse(){
       Node temp = head;
        while (temp != null){
            temp = temp.nextNode();
    }

    @Override
    public String toString() {
        String output = "";
        Node temp = head;

        if (temp == null) {
            System.out.println("list is empty!");
        }
        while (temp != null) {
            output += temp.toString() + "\n";
            temp = temp.nextNode();
        }

        return output;
    }

    public void deleteHead() {
        head = head.nextNode();
    }

    public Book getHeadValue() {
        return head.getValue();
    }

    public void deleteTail() {
        Node temp = head;
        if (temp != null && temp.nextNode() == null) {
            head = null;
            return;
        }
        while (temp.nextNode().nextNode() != null) {
            temp = temp.nextNode();
        }
        temp.setNext(null);
    }

    public Book getTailValue() {
        Node temp = head;
        if (temp == null) {
            return null;
        }
        if (temp.nextNode() == null) {
            return temp.getValue();
        }
        while (temp.nextNode().nextNode() != null) {
            temp = temp.nextNode();
        }
        return temp.nextNode().getValue();
    }

    public static void main(final String[] args) {
        final LinkedList list = new LinkedList();
        list.insertAtHead(new Book("Flat Land", 10));
        list.insertAtHead(new Book("The ground land", 3));
        list.insertAtHead(new Book("Star Ship Troopers", 30));
        list.insertAtHead(new Book("Java Something something", 300));

        System.out.println(list);
        System.out.println(list);
    }

    public int getNodeAt(final int i) {

        final int UI = i;
        final int counter = 0;
        final Node temp = head;

        while (counter != UI && counter < index) {

            temp = Node.nextNode;
            counter++;
        }
    }

}
