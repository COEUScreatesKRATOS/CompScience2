/**
 * Chris HardingBrown 5/20/2014 Comp 1672 CompSci II Assignment 4
 */

public class Queue extends DoublyLinkedList {

    public Queue() {
        super();
    }

    public void enqueue(final int i) {
        // System.out.print("Queue'd the number " + i);
        // toString();
        insertAtTail(i);
    }

    public void dequeue() {
        // head.getValue();
        // System.out.println("Dequeue'd then number" + head.getValue());
        deleteHead();
    }

    public void printQueue() {
        System.out.println(toString());
    }

    public void dequeueAll() {
        deleteRemaining();
    }
}
