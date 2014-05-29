/**
 * Chris HardingBrown 4/16/2014 Comp 1672 CompSci II Lab 5
 */
public class BadGuy1 extends NPCShip {

    public BadGuy1(final Position pos) {
        super(pos);

    }

    @Override
    protected int getWidth() {
        return 20;
    }

    @Override
    protected int getHeight() {
        return 20;
    }

    @Override
    protected String getImage() {
        return "BadGuy1Galaga.png";
    }
}
