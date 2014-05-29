/**
 * Chris HardingBrown 4/16/2014 Comp 1672 CompSci II Lab 5
 */
public abstract class Ship extends Shape {

    protected static int xVel;

    public Ship(final Position pos, final Team team) {
        super(pos, team);
        xVel = 10;
    }

    public Missle fireMissle() {
        return new Missle(pos, team);

    }

    @Override
    protected boolean doCollide(final Shape that) {

        return false;
    }

    protected int getxVel() {
        return xVel;
    }

    protected void setxVel(final int xVel) {
        Ship.xVel = xVel;
    }
}
