/**
 * Created by BennettIronYard on 2/10/16.
 */
public class Averager {
    public static void main(String[] args) {
        int sum = 0;

        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                sum += Integer.parseInt(args[i]);
            }
            System.out.println("Sum is: " + sum);
            System.out.println("Average is: " + (float) sum / args.length);
        }
        //What is the output of this program? ASCII table
        char var1 = 'A';
        char var2 = 'a';
        System.out.println((int)var1 + " " + (int)var2);


        //What is the output of this program?
        double num[] = {5.5, 10.1, 11, 12.8, 56.9, 2.5};
        double result;
        result = 0;
        for (int i = 0; i < 6; ++i)
            result = result + num[i];
        System.out.print(result/6);

        // What will be the output of the program?
        try
        {
            int x = 0;
            int y = 5 / x;
        }
        catch (Exception e) // It Is caught here
        {
            System.out.println("Exception");
        }
       // catch (ArithmeticException ae) caught at line 32
        {
            System.out.println(" Arithmetic Exception");
        }
        System.out.println("finished");


        // What gets displayed on the screen when the following program is compiled and run?
        int x,y;
        x = 3 & 5;
        y = 3 | 5;
        System.out.println(x + " " + y);
    }
}
