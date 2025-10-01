import java.awt.*;
import java.util.ArrayList;


public class BigRectLister {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        rectangles.add(new Rectangle(1, 1));
        rectangles.add(new Rectangle(2, 2));
        rectangles.add(new Rectangle(3, 3));
        rectangles.add(new Rectangle(4, 2));
        rectangles.add(new Rectangle(5, 1));
        rectangles.add(new Rectangle(6, 2));
        rectangles.add(new Rectangle(7, 1));
        rectangles.add(new Rectangle(2, 5));
        rectangles.add(new Rectangle(1, 6));
        rectangles.add(new Rectangle(10, 2));

        BigRectangleFilter filter = new BigRectangleFilter();

        for (Rectangle r : rectangles) {
            if (filter.accept(r)) {
                int perimeter = 2 * (r.width + r.height);
                System.out.println("Big rectangle: " + r +
                        " perimeter = " + perimeter);
            }
        }
    }
}
