package Day_3;

import java.util.Scanner;

public class java_19 {
    public static void main(String[] firew) {
        Scanner in = new Scanner(System.in);

        int i = 0;
        while (i < 5) {
            System.out.println("Hello World");
            i++; // i = i + 1
        }

        int j = 10;
        while (j < 21) {
            System.out.println("Hey Baby ");
            j = j + 2;
        }

        int n = 10;
        while (n < 50) {
            if (n % 2 == 0)
                System.out.println(n);
            n++; // i = i + 1
        }

        float mark, total = 0, gradeCounter = 0;
        System.out.println("Enter student's Mark or -1 to quit: ");
        mark = in.nextInt();
        while (mark != -1) {
            total = total + mark; // add grade to total
            gradeCounter = gradeCounter + 1; // increment counter
            // prompt for input and read next grade from user
            System.out.println("Enter student's mark or -1 to quit: ");
            mark = in.nextFloat();
        }
        System.out.println();
        System.out.println("The Total Mark is " + total);
        System.out.println("The Average is " + total / gradeCounter);

    }
}
