/**
 * Created by BennettIronYard on 2016.
 */
public class Twelve {
    public static void main(String[] args) {

        int multiple = 0;

        while (multiple < 13) {
            System.out.print(multiple + " * 12 = ");
            System.out.println(multiple * 12);
            multiple++;
        }

        for (int i = 0; i < 13; i++) {
            System.out.println(i * 12);
            //System.out.print(i + " = 12 * ");
        }
    }

}
