
/**
 * Chris HardingBrown 4/16/2014 Comp 1672 CompSci II Lab 5
 */
public abstract class Move {

    public abstract Position calculate(final Position pos, final int boardHeight, final int boardWidth);

    public Move(final Position pos, final Team t, final Ship s) {
        // User Move
        if (t == Team.Player) {
            // Left Arrow or "A" is pressed
            if (StdDraw.isKeyPressed(37) || StdDraw.isKeyPressed(65)) {
                if (pos.getX() < s.getWidth() / 2) {
                    pos.setX(s.getWidth() / 2);
                }
                pos.setX(pos.getX() + (s.getxVel() * -1));
            }
            // Right Arrow or "D" is pressed
            else if (StdDraw.isKeyPressed(39) || StdDraw.isKeyPressed(68)) {
                if (pos.getX() > GameClass.getCanvasX() - (s.getWidth() / 2)) {
                    pos.setX(GameClass.getCanvasX() - (s.getWidth() / 2));
                }
                pos.setX(pos.getX() + s.getxVel());
            }
        }
        // NPC Move
        if (t == Team.NPC) {
            if (pos.getX() < s.getWidth() / 2) {
                s.setxVel(s.getxVel() * -1);
                pos.setX(s.getWidth() / 2);

            } else if (pos.getX() > GameClass.getCanvasX() - (s.getWidth() / 2)) {
                s.setxVel(s.getxVel() * -1);
                pos.setX((GameClass.getCanvasX() - (s.getWidth() / 2)));

            }
            pos.setX(pos.getX() + s.getxVel());
            pos.setY(pos.getY() + s.getHeight());
        }

    }

}
