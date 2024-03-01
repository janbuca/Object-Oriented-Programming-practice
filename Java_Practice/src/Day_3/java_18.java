package Day_3;

import java.util.Scanner;

public class java_18 {
    public static void main(String[] firew) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your Marks : ");
        float mark = in.nextFloat();
        String x = (mark >= 50 ? "Passed" : "Failed");
        System.out.println(x);

    }

}
