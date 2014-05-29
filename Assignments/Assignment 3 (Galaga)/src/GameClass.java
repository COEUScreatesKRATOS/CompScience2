import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Chris HardingBrown 4/16/2014 Comp 1672 CompSci II Lab 5
 */
public class GameClass {

    /**
     * @param args
     */
    private static int canvasWidth = 500;
    private static int canvasHeight = 500;

    public static void main(final String[] args) {
        // initialize the canvas
        StdDraw.setCanvasSize(canvasWidth, canvasHeight);
        StdDraw.setXscale(0, canvasWidth);
        StdDraw.setYscale(canvasHeight, 0);

        final Position xy = new Position(250, 250);
        final BadGuy1 bad = new BadGuy1(xy);
        final UserShip good = new UserShip(canvasHeight, canvasHeight);
        // ArrayList<NPCShips>
        final ArrayList<Missle> missle = new ArrayList<Missle>();
        Iterator<Missle> it;

        while (true) {
            // erase the screen
            StdDraw.clear(StdDraw.BLACK);
            bad.move();
            bad.draw();
            // good.draw();
            // good.move();
            if (StdDraw.isKeyPressed(KeyEvent.VK_SPACE)) {
                final Missle M1 = good.fireMissle();
                missle.add(M1);
            }
            it = missle.iterator();
            while (it.hasNext()) {
                final Missle M2 = it.next();
                M2.draw();
                M2.move();

            }
            // Show the final picture after 20 final milliseconds
            StdDraw.show(20);
        }
    }

    public static int getCanvasX() {
        return canvasWidth;
    }

    public static int getCanvasY() {
        return canvasHeight;
    }
}
