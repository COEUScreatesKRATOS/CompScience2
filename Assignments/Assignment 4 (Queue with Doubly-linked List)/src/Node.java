/**
 * Chris HardingBrown 5/20/2014 Comp 1672 CompSci II Assignment 4
 */

public class Node {
    protected int number;
    protected Node pointerNextNode;
    protected Node pointerPreviousNode;

    public Node(final int i) {
        number = i;
        // pointerNesxtNode = n;
        // pointerPreviousNode = p
    }

    public Node getpointerNextNode() {
        return pointerNextNode;
    }

    public int getValue() {
        return number;
    }

    public Node getPointerPreviousNode() {
        return pointerPreviousNode;
    }

    public void setPointerNextNode(final Node n) {
        pointerNextNode = null;
    }

    public void setValue(final int i) {
        number = i;
    }

    public void setPointerPreviousNode(final Node p) {
        pointerPreviousNode = null;
    }

    @Override
    public String toString() {
        return "[" + number + "]";

    }
}
