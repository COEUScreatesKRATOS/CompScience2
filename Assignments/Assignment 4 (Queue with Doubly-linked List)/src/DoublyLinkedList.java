/**
 * Chris HardingBrown 5/20/2014 Comp 1672 CompSci II Assignment 4
 */

public class DoublyLinkedList {
    private static Object deleteHead;
    private static Object deleteTail;
    protected Node head;

    public DoublyLinkedList() {
        this.head = new Node(-1);
    }

    public void insertAtHead(final int i) {
        final Node newNumber = new Node(i);
        final Node temp = head;

        if (temp.getValue() == -1) {
            head = newNumber;
            return;
        } else {
            newNumber.pointerNextNode = head;
            head.pointerPreviousNode = newNumber;
            head = newNumber;
            return;
        }
    }

    // temp.pointerNextNode != null && temp.pointerNextNode.getValue() < i
    public void insertAtTail(final int i) {
        final Node newNumber = new Node(i);
        Node temp1 = head;

        if (temp1.getValue() == -1) {
            head = newNumber;
        }
        while (temp1.pointerNextNode != null) {
            temp1 = temp1.pointerNextNode;
        }

        if (temp1.pointerNextNode == null) {
            newNumber.pointerNextNode = temp1.pointerNextNode;
            newNumber.pointerPreviousNode = temp1;
            temp1.pointerNextNode = newNumber;
            return;
        }

    }

    public void deleteHead() {
        Node temp1 = head;
        final Node temp2 = head;

        if (temp1.getValue() == -1) {
            return;
        } else if (temp1.getpointerNextNode() == null && temp1.getPointerPreviousNode() == null && temp1.getValue() >= 0) {
            this.head = new Node(-1);
            return;
        }
        temp1 = temp1.pointerNextNode;
        temp2.pointerNextNode = null;
        temp1.pointerPreviousNode = null;
        head = temp1;
        return;
    }

    public void deleteTail() {
        Node temp1 = head;
        Node temp2 = temp1.pointerPreviousNode;

        if (temp1.getValue() == -1) {
            return;
        } else if (temp1.getpointerNextNode() == null && temp1.getPointerPreviousNode() == null && temp1.getValue() >= 0) {
            this.head = new Node(-1);
            return;
        }

        while (temp1.pointerNextNode != null) {
            temp1 = temp1.pointerNextNode;
            temp2 = temp1.pointerPreviousNode;
        }
        if (temp1.pointerNextNode == null) {
            temp2.pointerNextNode = null;
            temp1.pointerPreviousNode = null;
            return;
        }

    }

    public void deleteRemaining() {

        while (head.getValue() != -1) {
            deleteTail();

        }

    }

    @Override
    public String toString() {
        String output = "";
        Node temp1 = head;

        if (temp1.getValue() == -1) {
            System.out.println("List Empty!!");
        }
        while (temp1 != null) {
            output += temp1.toString();
            temp1 = temp1.pointerNextNode;
        }

        return output;
    }
}
