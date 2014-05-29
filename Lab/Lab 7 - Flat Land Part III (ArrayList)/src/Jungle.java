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

        final Square[] sqArray = new Square[1];
        for (int i = 0; i < sqArray.length; i++) {
            sqArray[i] = new Square(r.nextInt(500), r.nextInt(500));
        }
        final Circle[] cirArray = new Circle[100];
        for (int i = 0; i < cirArray.length; i++) {
            cirArray[i] = new Circle(r.nextInt(500), r.nextInt(500));
        }

        while (true) {
            // erase the screen
            StdDraw.clear();

            // draw and move square
            for (final Square sqr : sqArray) {
                sqr.moveX();
                sqr.draw();
            }
            // draw and move circle
            for (final Circle cir : cirArray) {
                cir.collision(sqArray);
                cir.moveX();
                cir.moveY();

                cir.draw();
            }
            // Show the picture after 20 milliseconds
            StdDraw.show(20);
        }
    }
}
