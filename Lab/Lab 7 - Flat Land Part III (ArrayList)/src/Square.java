/**
 * Chris HardingBrown 4/16/2014 Comp 1672 CompSci II Lab 5
 */
public class Square {

    private int myX;
    private final int myY;
    private int myXVel;
    private final int myWidth;
    private final int myHeight;
    public final double distancetocorner;

    public Square(final int x, final int y) {
        myX = x;
        myY = y;
        myXVel = 5;
        myWidth = 10;
        myHeight = 10;
        distancetocorner = Math.sqrt(Math.pow(myWidth / 2.0, 2) + Math.pow(myHeight / 2.0, 2));

    }

    public void draw() {
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledRectangle(myX, myY, myWidth, myHeight);
    }

    public void move() {
        if (myX < myWidth / 2) {
            myXVel *= -1;
            myX = myWidth / 2;
        } else if (myX > 500 - myWidth / 2) {
            myXVel *= -1;
            myX = (500 - myWidth / 2);
        }
        myX += myXVel;
    }

    public int getMyX() {
        return myX;
    }

    public int getMyY() {
        return myY;
    }

    public int getMyWidth() {
        return myWidth;
    }

    public int getMyHeight() {
        return myHeight;
    }

}
