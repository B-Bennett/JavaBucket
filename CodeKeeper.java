import java.util.*;

/**
 * Created by BennettIronYard on 2016.
 */
public class CodeKeeper {
    ArrayList list;
    String[] codes = { "alpha", "lambda", "gamma", "delta", "zeta" };

    public CodeKeeper(String[] usersCodes) {
        list = new ArrayList();
        // load built in codes
        for (int i = 0; i < codes.length; i++) {
            addCode(codes[i]);
        }
        // load user codes
        for (int j = 0; j < usersCodes.length; j++) {
            addCode(usersCodes[j]);
        }
        // display all codes
        for (Iterator ite = list.iterator(); ite.hasNext(); ) {
            String output = (String) ite.next();
            System.out.println(output);
        }
    }
    private void addCode(String code) {
        if (!list.contains(code)) {
            list.add(code);
        }
    }

    public static void main(String[] args) {
        CodeKeeper keeper = new CodeKeeper(args);
    }
}
