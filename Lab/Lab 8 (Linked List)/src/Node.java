/**
 * Chris HardingBrown 4/16/2014 Comp 1672 CompSci II Lab 5
 */

public class Node {
    protected int number;
    protected Node nextNode;

    public Node(final int i, final Node n) {
        number = i;
        nextNode = n;
    }

    public Node getnextNode() {
        return nextNode;
    }

    public int getValue() {
        return number;
    }

    public void setNext(final Node n) {
        nextNode = n;
    }

    public void setValue(final int i) {
        number = i;
    }

    @Override
    public String toString() {
        return "[" + number + "]";

    }
}
