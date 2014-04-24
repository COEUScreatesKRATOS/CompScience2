
public class Shape {

    private int myX;
    private int myY;
    private int xVel;
    private int yVel;
    private boolean isHidden;
    private int myWidth;
    private int myHeight;

    // public final double distancetocorner;
    // private double radius;

    // public Shape() {
    //
    // }

    public void move() {
        if (myX < myWidth / 2) {
            xVel *= -1;
            myX = myWidth / 2;
        } else if (myX > 500 - myWidth / 2) {
            xVel *= -1;
            myX = (500 - myWidth / 2);
        }
        if (myY < myHeight / 2) {
            yVel *= -1;
            myY = myHeight / 2;
        } else if (myY > 500 - myHeight / 2) {
            yVel *= -1;
            myY = (500 - myHeight / 2);
        }

        myY += yVel;

        myX += xVel;

    }
}
