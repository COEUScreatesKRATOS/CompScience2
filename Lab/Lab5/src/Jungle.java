import java.util.Random;

/**
 * 
 */

/**
 * @author ChrisHardingBrown
 * 
 */
public class Jungle {

    /**
     * @param args
     */
    public static void main(final String[] args) {
        // initialize the canvas
        StdDraw.setCanvasSize(500, 500);
        StdDraw.setXscale(0, 500);
        StdDraw.setYscale(500, 0);

        final Random r = new Random();
        final Square[] sAry = new Square[10];
        for (int i = 0; i < sAry.length; i++) {
            sAry[i] = new Square(r.nextInt(500), r.nextInt(500));
        }

        final Circle[] cAry = new Circle[100];
        for (int i = 0; i < cAry.length; i++) {
            cAry[i] = new Circle(r.nextInt(500), r.nextInt(500));
        }

        while (true) {
            // erase the screen
            StdDraw.clear();

            // draw and move square
            for (final Square element : sAry) {
                element.move();
                element.draw();
            }
            // draw and move circle
            for (final Circle mc : cAry) {
                mc.move();
                mc.collision(sAry);
                mc.draw();
            }
            // Show the picture after 20 milliseconds
            StdDraw.show(20);
        }
    }
}
