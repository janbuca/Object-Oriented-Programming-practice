package Day_4;

import java.util.Scanner;

public class java_20 {
    public static void main(String[] firew) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        for (int n = 0; n <= 5; n++)
            System.out.println("Hi");

        for (int j = 0; j <= 5; j++) {
            System.out.println(j);
            System.out.println("Hi");
        }
        // The while statement can be used to implement any counter-controlled loop.
        // Java also provides the for repetition statement, which specifies the
        // counter-controlled-repetition details in a single line of code.

        for (int counter = 1; counter <= 10; counter++)
            System.out.printf("%d ", counter);
        System.out.println();

        int sum = 0;
        for (int c = 10; c >= 1; c--) {
            sum += c;
            System.out.println(sum);
        }

        int add = 0;
        for (int f = 10; f >= 1; f--) {
            add += f;
        }
        System.out.println(add);
    }
}
