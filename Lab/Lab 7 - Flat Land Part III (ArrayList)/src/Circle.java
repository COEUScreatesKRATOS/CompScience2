/**
 * @author ChrisHardingBrown Apr 24, 2014 Comp 1672
 */

public class Circle extends Shape {

    public Circle(final int x, final int y) {
        super(x, y);
    }

    @Override
    public void draw() {
        if (!hidden) {
            StdDraw.setPenColor(StdDraw.YELLOW);
            StdDraw.filledCircle(myX, myY, radius);
        }
    }
}
