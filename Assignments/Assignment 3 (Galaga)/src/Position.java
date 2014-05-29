/**
 * Chris HardingBrown 4/16/2014 Comp 1672 CompSci II Lab 5
 */
public class Position {

    private static int x;
    private static int y;

    public Position(final int x, final int y) {
        Position.x = x;
        Position.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(final int i) {
        Position.x = i;
    }

    protected void setY(final int i) {
        Position.y = i;
    }

}
