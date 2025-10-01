import java.awt.*;
public class BigRectangleFilter implements Filter {
    @Override
    public boolean accept(Object x) {
        if (x instanceof Rectangle) {
            Rectangle rect = (Rectangle) x;
            int perimeter = 2 * (rect.width + rect.height);
            return perimeter > 10;
        }
        return false;
    }
}
