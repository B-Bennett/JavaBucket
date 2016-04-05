/**
 * Created by BennettIronYard on 2016.
 */
public class PracticeOutputs {

    public static void main(String[] args) {

        int a[] = {1,2,3,4,5};
        int d[] = a;
        int sum = 0;
        for (int j = 0; j < 3; ++j)
            System.out.println( sum += (a[j] * d[j + 1]) + (a[j + 1] * d[j]));
        System.out.println(sum);

        char array_variable [] = new char[10];
        for (int i = 0; i < 10; ++i) {
            array_variable[i] = 'i';
            System.out.print(array_variable[i] + "");
            i++; // result 5 'i's
        }

        System.out.println("\n---"); // new operator then all of its elements are initialized to 0 automatically.

        int array_pariable [] = new int[10];
        for (int i = 0; i < 10; ++i) {
            array_pariable[i] = i/2;
            array_pariable[i]++;
            System.out.print(array_pariable[i] + " ");
            i++; // result 1-5
        }

        System.out.println("\n---");

        int avrray_variable [] = new int[10];
        for (int i = 0; i < 10; ++i) {
            avrray_variable[i] = i;
            System.out.print(avrray_variable[i] + " ");
            i++; // result 0-8
        }

        System.out.println("\n---");

        int arr[][] = new int[3][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        int sum1 = 0;
        for (int i = 0; i < 3; ++i)
            for (int j = 0; j < i + 1; ++j)
                System.out.print(arr[i][j] = j + 1);
        for (int i = 0; i < 3; ++i)
            for (int j = 0; j < i + 1; ++j)
                System.out.print(sum1 += arr[i][j]);
        System.out.println("\n"+ sum1);

        System.out.println("\n---");

        int aray[] = new int[] {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = 6;
        n = aray[aray[n] / 2];
        System.out.println(aray[n] / 2);
    }
}

