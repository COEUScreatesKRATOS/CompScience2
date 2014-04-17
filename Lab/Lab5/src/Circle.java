/**
 * 
 */

/**
 * @author ChrisHardingBrown
 * 
 */
public class Circle {

    private int myX;
    private int myY;
    private int myXVel;
    private int myYVel;
    private final int myDiameter;
    private boolean isHidden;
    private final double radius;

    public Circle(final int x, final int y) {
        myX = x;
        myY = y;
        myXVel = 5;
        myYVel = 4;
        myDiameter = 10;
        radius = myDiameter / 2.0;
    }

    public void draw() {
        if (!isHidden) {
            StdDraw.setPenColor(StdDraw.YELLOW);
            StdDraw.filledCircle(myX, myY, myDiameter);
        }
    }

    public void move() {
        if (myX > 500 - myDiameter / 2 || myX < myDiameter / 2) {
            myXVel *= -1;
        }

        if (myY > 500 - myDiameter / 2 || myY < myDiameter / 2) {
            myYVel *= -1;
        }

        myY += myYVel;

        myX += myXVel;

    }

    public void collision(final Square[] squares) {
        if (isHidden) {
            return;
        }

        for (final Square square : squares) {
            final int sXValue = square.getMyX();
            final int sMyWidth = square.getMyWidth();
            final int sMyHeight = square.getMyHeight();
            final int sYValue = square.getMyY();

            if ((sXValue - (sMyWidth / 2.0)) <= myX && myX <= (sXValue + (sMyWidth / 2.0))) {
                // Using vertical collision detection
                final double threshold = (radius + (sMyHeight / 2.0));
                final double deltaY = Math.abs(sYValue - myY);

                if (deltaY <= threshold) {
                    isHidden = true;
                    System.out.println("hidden do to vertical collsion");
                    return;
                }
            } else if ((sYValue - (sMyHeight / 2.0)) <= myY && myY <= (sYValue + (sMyHeight / 2.0))) {
                // TODO Using horizontal collision detection
                final double threshold = (radius + (sMyWidth / 2.0));
                final double deltaX = Math.abs(sXValue - myX);

                if (deltaX <= threshold) {
                    isHidden = true;
                    System.out.println("hidden do to horizontal collsion");
                    return;
                }
            } else {
                // TODO Using corner collision detection
                final double minDistBCenter = square.distancetocorner + radius;
                final double distBetweenCenter = Math.sqrt(Math.pow((sXValue - myX), 2) + Math.pow((sYValue - myY), 2));

                if (distBetweenCenter <= minDistBCenter) {
                    isHidden = true;
                    System.out.println("hidden do to corner collsion");
                    return;
                }
            }
        }
    }
}
