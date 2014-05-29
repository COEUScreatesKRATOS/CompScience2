public class BadGuy3 extends NPCShip {

    public BadGuy3(final Position pos) {
        super(pos);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected String getImage() {
        return "BadGuy3Galaga.png";
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
