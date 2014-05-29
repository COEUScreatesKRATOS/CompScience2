/**
 * @author ChrisHardingBrown May 6, 2014 Comp 1672
 */
public abstract class NPCShip extends Ship {

    public NPCShip(final Position pos) {
        super(New Position(), Team.NPC);
        xVel = 10;
    }

    protected void move() {
        if (pos.getX() < this.getWidth() / 2) {
            this.setxVel(this.getxVel() * -1);
            pos.setX(this.getWidth() / 2);

        } else if (pos.getX() > GameClass.getCanvasX() - (this.getWidth() / 2)) {
            this.setxVel(this.getxVel() * -1);
            pos.setX((GameClass.getCanvasX() - (this.getWidth() / 2)));

        }
        pos.setX(pos.getX() + this.getxVel());
        // pos.setY(pos.getY() + this.getHeight());
    }
}
