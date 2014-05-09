public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void insertNumberAtHead(final int i) {
        final Node newNode = new Node(i, head);
        head = newNode;
    }

    public void insertNumber(final int i) {
        final Node newNode = new Node(i, null);
        Node temp = head;

        if (temp == null) {
            temp = newNode;
            head = temp;
            return;
        }

        else if (i <= temp.getValue()) {
            newNode.nextNode = temp;
            head = newNode;
            return;

        }

        while (temp.nextNode != null && temp.nextNode.getValue() < i) {
            temp = temp.nextNode;
        }

        if (temp.nextNode == null) {
            newNode.nextNode = temp.nextNode;
            temp.nextNode = newNode;
        } else {
            newNode.nextNode = temp.nextNode;
            temp.nextNode = newNode;

        }
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
            temp = temp.nextNode;
        }

        return output;
    }

    public static void main(final String[] args) {
        final LinkedList list = new LinkedList();
        list.insertNumber(4);
        list.insertNumber(6);
        list.insertNumber(1);
        list.insertNumber(3);
        list.insertNumber(10);
        list.insertNumber(7);

        System.out.println(list);

    }
}
