import java.util.Random;

/**
 * @author ChrisHardingBrown Apr 24, 2014 Comp 1672
 */
public class Jungle {

    public static void main(final String[] args) {
        // initialize the canvas
        StdDraw.setCanvasSize(500, 500);
        StdDraw.setXscale(0, 500);
        StdDraw.setYscale(500, 0);

        final Random r = new Random();
        final Shape[] sAry = new Shape[20];

        for (int i = 0; i < (sAry.length / 2); i++) {
            sAry[i] = new Square(r.nextInt(500), r.nextInt(500));
        }

        for (int i = 10; i < sAry.length; i++) {
            sAry[i] = new Circle(r.nextInt(500), r.nextInt(500));
        }

        while (true) {
            // erase the screen
            StdDraw.clear();

            // draw and move square
            for (final Shape sqr : sAry) {
                sqr.move();
                sqr.draw();
            }
            // draw and move circle
            for (final Shape cir : sAry) {
                cir.move();
                cir.collision(sAry);
                cir.draw();
            }
            // Show the picture after 20 milliseconds
            StdDraw.show(20);
        }
    }
}
