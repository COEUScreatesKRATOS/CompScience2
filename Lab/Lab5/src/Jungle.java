import java.util.Random;

/**
 * Chris HardingBrown 4/16/2014 Comp 1672 CompSci II Lab 5
 */
public class Jungle {

    /**
     * @param args
     */
    private static int canvasX = 500;
    private static int canvasY = 500;

    public static void main(final String[] args) {
        // initialize the canvas
        StdDraw.setCanvasSize(canvasX, canvasY);
        StdDraw.setXscale(0, canvasX);
        StdDraw.setYscale(canvasY, 0);

        final Random r = new Random();
        final Square[] sAry = new Square[10];
        for (int i = 0; i < sAry.length; i++) {
            sAry[i] = new Square(r.nextInt(canvasX), r.nextInt(canvasY));
        }

        final Circle[] cAry = new Circle[100];
        for (int i = 0; i < cAry.length; i++) {
            cAry[i] = new Circle(r.nextInt(canvasX), r.nextInt(canvasY));
        }

        while (true) {
            // erase the screen
            StdDraw.clear();

            // draw and move square
            for (final Square msq : sAry) {
                msq.move();
                msq.draw();
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
