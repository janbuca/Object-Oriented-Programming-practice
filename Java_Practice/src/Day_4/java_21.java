package Day_4;

import java.util.Scanner;

public class java_21 {
    public static void main(String[] firew) {
        Scanner in = new Scanner(System.in);

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

        int j = 5;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);
        System.out.println("this is the false " + j);


        int n = 100, sum = 0;
        do {
            sum += n;
            System.out.println(sum);
            n++;
        } while (n < 105);
        System.out.println("this is the false " + n);
    }

}
