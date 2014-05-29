/**
 * @author ChrisHardingBrown Apr 24, 2014 Comp 1672
 */
public abstract class Shape {

    protected double myX;
    protected double myY;
    private int myXVel;
    private int myYVel;
    private final int myWidth;
    private final int myHeight;
    public double distancetocorner;
    protected boolean hidden;
    protected double radius;;

    public Shape(final double x, final double y) {
        myX = x;
        myY = y;
        myXVel = 5;
        myYVel = 5;
        myWidth = 10;
        myHeight = 10;
        radius = 10;

        distancetocorner = Math.sqrt(Math.pow(myWidth / 2.0, 2) + Math.pow(myHeight / 2.0, 2));
    }

    public void moveX() {
        if (myX < myWidth / 2) {
            myXVel *= -1;
            myX = myWidth / 2;
        } else if (myX > 500 - myWidth / 2) {
            myXVel *= -1;
            myX = (500 - myWidth / 2);
        }

        myX += myXVel;
    }

    public void moveY() {
        if (myY < myHeight / 2) {
            myYVel *= -1;
            myY = myHeight / 2;
        } else if (myY > 500 - myHeight / 2) {
            myYVel *= -1;
            myY = (500 - myHeight / 2);
        }

        myY += myYVel;
    }

    public void draw() {
        if (!hidden) {

        }
    }

    public double getRadius() {
        return radius;
    }

    public double getMyX() {
        return myX;
    }

    public double getMyY() {
        return myY;
    }

    public int getMyWidth() {
        return myWidth;
    }

    public int getMyHeight() {
        return myHeight;
    }

    public void collision() {
        if (hidden) {
            return;
        }

        for (final Shape shape : shapes) {
            final double sXValue = shape.getMyX();
            final int sMyWidth = shape.getMyWidth();
            final int sMyHeight = shape.getMyHeight();
            final double sYValue = shape.getMyY();

            if ((sXValue - (sMyWidth / 2.0)) <= myX && myX <= (sXValue + (sMyWidth / 2.0))) {
                // TODO Using vertical collision detection
                final double threshold = (myY + (sMyHeight / 2.0));
                final double deltaY = Math.abs(sYValue - myY);

                if (deltaY <= threshold) {
                    hidden = true;
                    System.out.println("hidden do to vertical collsion");
                    return;
                }
            } else if ((sYValue - (sMyHeight / 2.0)) <= myY && myY <= (sYValue + (sMyHeight / 2.0))) {
                // TODO Using horizontal collision detection
                final double threshold = (myX + (sMyWidth / 2.0));
                final double deltaX = Math.abs(sXValue - myX);

                if (deltaX <= threshold) {
                    hidden = true;
                    System.out.println("hidden do to horizontal collsion");
                    return;
                }
            } else {
                // TODO Using corner collision detection
                final double minDistBCenter = shape.distancetocorner + radius;
                final double distBetweenCenter = Math.sqrt(Math.pow((sXValue - myX), 2) + Math.pow((sYValue - myY), 2));

                if (distBetweenCenter <= minDistBCenter) {
                    hidden = true;
                    System.out.println("hidden do to corner collsion");
                    return;
                }
            }
        }
    }

}
