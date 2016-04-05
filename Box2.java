import java.awt.*;

/**
 * Created by BennettIronYard on 2/10/16.
 */
public class Box2 {
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;

    Box2(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    Box2(Point toLeft, Point bottomRight) {
        this(toLeft.x, toLeft.y, bottomRight.x, bottomRight.y);
    }
    Box2(Point toLeft, int w, int h) {
        this(toLeft.x, toLeft.y, toLeft.x + w, toLeft.y + h);
    }
    void printBox() {
        System.out.print("Box: <" + ", " + y1);
        System.out.println(", " + x2 + ", " + y2 + ">");
    }

    public static void main(String[] args) {
        Box2 rect;

        System.out.println("Calling Box2 with coordinates " + "(25,25) and (50,50):");
        rect = new Box2(25, 25, 50, 50);
        rect.printBox();

        System.out.println("\nCalling Box2 with 1 point " + "(10,10), width 50 and height 50;");
        rect = new Box2(new Point(10, 10), 50, 50);
        rect.printBox();
    }
}
