/**
 * Chris HardingBrown 4/16/2014 Comp 1672 CompSci II Lab 5
 */
public abstract class Shape {
    protected Position pos;
    protected Team team;
    private double distancetocorner;

    public Shape(final Position pos, final Team team) {
        this.pos = pos;
        this.team = team;
    }

    protected abstract boolean doCollide(Shape that);

    // public void move(final Move m, final int boardHeight, final int
    // boardWidth) {
    // pos = m.calculate(pos, boardHeight, boardWidth);

    // }

    // public boolean collide(final Shape that) {
    // if (this.team == that.team) {
    // return false;
    // }

    // for (final Shape shape : shapes) {
    // final int thatX = that.pos.getX();
    // final int thatWidth = that.getWidth();
    // final int thatHeight = that.getHeight();
    // final int thatY = that.pos.getY();
    //
    // if ((thatX - (thatWidth / 2.0)) <= this.pos.getX() && this.pos.getX()
    // <= (thatX + (thatWidth / 2.0))) {
    // // Using vertical collision detection
    // final double threshold = (this.getHeight() / 2 + (thatHeight / 2.0));
    // final double deltaY = Math.abs(thatY - this.pos.getY());
    //
    // if (deltaY <= threshold) {
    // System.out.println("hidden do to vertical collsion");
    // return true;
    // }
    // } else if ((thatY - (thatHeight / 2.0)) <= this.pos.getY() &&
    // this.pos.getY() <= (thatY + (thatHeight / 2.0))) {
    // // TODO Using horizontal collision detection
    // final double threshold = (this.getWidth() + (thatWidth / 2.0));
    // final double deltaX = Math.abs(thatX - this.pos.getX());
    //
    // if (deltaX <= threshold) {
    // System.out.println("hidden do to horizontal collsion");
    // return true;
    // }
    // } else {
    // // TODO Using corner collision detection
    // final double minDistBCenter = shape.distancetocorner +
    // this.getHeight() / 2;
    // final double distBetweenCenter = Math.sqrt(Math.pow((thatX -
    // this.pos.getX()), 2) + Math.pow((thatY - this.pos.getY()), 2));
    //
    // if (distBetweenCenter <= minDistBCenter) {
    // System.out.println("hidden do to corner collsion");
    // return true;
    // }
    // }

    // }

    protected abstract String getImage();

    protected abstract int getWidth();

    protected abstract int getHeight();

    public void draw() {
        // if (collide) {
        StdDraw.picture(pos.getX(), pos.getY(), getImage(), getHeight(), getWidth());
        // }
    }

    //
    public double getDistancetocorner() {
        return distancetocorner;
    }

    public void setDistancetocorner(final double distancetocorner) {
        this.distancetocorner = Math.sqrt(Math.pow(this.getWidth() / 2.0, 2) + Math.pow(this.getHeight() / 2.0, 2));
        ;
    }
}
