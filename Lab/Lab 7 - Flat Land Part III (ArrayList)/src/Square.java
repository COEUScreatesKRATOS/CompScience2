public class Square extends Shape {

    public Square(final int x, final int y) {
        super(x, y);
    }

    @Override
    public void draw() {
        // if (!hidden) {
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledSquare(myX, myY, radius);
        // }
    }

}
