/**
 * Chris HardingBrown 5/20/2014 Comp 1672 CompSci II Assignment 4
 */

public class DoubleLinkedListDriver {

    public static void main(final String[] args) {

        final DoublyLinkedList list = new DoublyLinkedList();
        // Insert number list from head (LiFo)
        list.insertAtHead(4);
        list.insertAtHead(6);
        list.insertAtHead(1);
        list.insertAtHead(3);
        list.insertAtHead(10);
        list.insertAtHead(7);

        System.out.println("Insert at Head: " + list);
        // System.out.println("");

        list.deleteHead();
        System.out.println("Delete Head: " + list);
        // System.out.println("");

        list.deleteTail();
        System.out.println("Delete Tail: " + list);

        // Delete remaining test numbers
        list.deleteRemaining();

        // Start list over from Tail (Fifo)
        list.insertAtTail(4);
        list.insertAtTail(6);
        list.insertAtTail(1);
        list.insertAtTail(3);
        list.insertAtTail(10);
        list.insertAtTail(7);

        System.out.println("Insert at Tail: " + list);
        // System.out.println("");

        list.deleteHead();
        System.out.println("Delete at Head: " + list);
        // System.out.println("");

        list.deleteTail();
        System.out.println("Delete Tail: " + list);
        // System.out.println("");

        // Delete remaining test numbers
        list.deleteRemaining();

        System.out.println("\n\n");
        System.out.println("Queuing");
        final Queue q = new Queue();

        // Insert in order, (printed left to right)
        q.enqueue(4);
        q.printQueue();

        q.enqueue(6);
        q.printQueue();

        q.enqueue(1);
        q.printQueue();

        q.enqueue(3);
        q.printQueue();

        q.enqueue(10);
        q.printQueue();

        q.enqueue(7);

        q.printQueue();

        // Remove the first in (removes the far left)
        q.dequeue();
        q.printQueue();

        q.dequeue();
        q.printQueue();

        q.dequeue();
        q.printQueue();

        q.dequeueAll();

    }
}
