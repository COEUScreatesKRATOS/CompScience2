/**
 * @author ChrisHardingBrown May 6, 2014 Comp 1672
 */
public class Missle extends Shape {
    private final int yVel;

    public Missle(final Position pos, final Team team) {
        super(new Position(pos.getX(), pos.getY()), team);
        yVel = (team == Team.NPC ? 1 : -1);
    }

    @Override
    protected boolean doCollide(final Shape that) {
        return true;
    }

    @Override
    protected String getImage() {
        return "Missle.png";
    }

    @Override
    protected int getWidth() {
        return 5;
    }

    @Override
    protected int getHeight() {
        // TODO Auto-generated method stub
        return 10;
    }

    public void move() {
        missle.pos.setY(Ship.pos.getY() - 5);
    }

}
