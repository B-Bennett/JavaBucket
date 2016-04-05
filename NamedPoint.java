import java.awt.*;

/**
 * Created by BennettIronYard on 2/10/16.
 */
public class NamedPoint extends Point {
    String name;

    NamedPoint(int x, int y, String name) {
        super(x,y);
        this.name = name;
    }

    public static void main(String[] args) {
        NamedPoint np = new NamedPoint(5, 5, "SmallPoint");
        System.out.println("x is " + np.x);
        System.out.println("y is " + np.y);
        System.out.println("Name is " + np.name);
    }
}
// good idea to pass constructors up the hierarchy to make sure that everything is set up correctly.