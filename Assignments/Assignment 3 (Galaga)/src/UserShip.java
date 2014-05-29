/**
 * @author ChrisHardingBrown May 6, 2014 Comp 1672
 */
public class UserShip extends Ship {
    // private final int xVel;

    public UserShip(final int canvasWidth, final int canvasHeight) {
        super(new Position(GameClass.getCanvasX() / 2, GameClass.getCanvasY() - 10), Team.Player);
    }

    @Override
    protected String getImage() {
        return "GoodGuyGalagaShip.png";
    }

    @Override
    protected int getWidth() {
        // TODO Auto-generated method stub
        return 20;
    }

    @Override
    protected int getHeight() {
        // TODO Auto-generated method stub
        return 20;
    }

    public void move() {
        // Left Arrow or "A" is pressed
        if (StdDraw.isKeyPressed(37) || StdDraw.isKeyPressed(65)) {
            if (pos.getX() < this.getWidth() / 2) {
                pos.setX(this.getWidth() / 2);
            }
            pos.setX(pos.getX() - 10);
        }
        // Right Arrow or "D" is pressed
        else if (StdDraw.isKeyPressed(39) || StdDraw.isKeyPressed(68)) {
            if (pos.getX() > GameClass.getCanvasX() - (this.getWidth() / 2)) {
                pos.setX(GameClass.getCanvasX() - (this.getWidth() / 2));
            }
            pos.setX(pos.getX() + 10);
        }
    }
}

// public UserShip() {
// Shape.setxValue = (GameClass.getCanvasX() / 2);
// Shape.setyValue = (h / 2);
// w = 10;
// h = 10;
// xv = 1;
// yv = 0;
// }
//
// public void draw() {
// StdDraw.setPenColor(StdDraw.BLUE);
// StdDraw.filledRectangle(getxValue(), getyValue(), getWidth(), getHeight());
// }
//
// public void moveX() {
//
// if (getxValue() < getWidth() / 2) {
// setxVel(getxVel() * -1);
// setxValue(getWidth() / 2);
//
// } else if (getxValue() > GameClass.getCanvasX() - (getWidth() / 2)) {
// setxVel(getxVel() * -1);
// setxValue((GameClass.getCanvasX() - (getWidth() / 2)));
//
// }
// setxValue(getxValue() + getxVel());
// }
//
// public void moveY() {
// if (getyValue() < (getHeight() / 2)) {
// setyVel(getyVel() * -1);
// setyValue(getHeight() / 2);
//
// } else if (getyValue() > GameClass.getCanvasY() - (getHeight() / 2)) {
// setyVel(getyVel() * -1);
// setyValue((GameClass.getCanvasY() - (getHeight() / 2)));
// }
// setyValue(getyValue() + getyVel());
// }
//
// }
