public class BadGuy2 extends NPCShip {

    public BadGuy2(final Position pos) {
        super(pos);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected String getImage() {

        return "BadGuy2Galaga.png";
    }

    @Override
    protected int getWidth() {
        return 20;
    }

    @Override
    protected int getHeight() {
        return 20;
    }

}
