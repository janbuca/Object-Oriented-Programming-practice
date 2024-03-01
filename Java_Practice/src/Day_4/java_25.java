package Day_4;

import java.util.Scanner;

public class java_25 {
    public static void main(String[] firew) {
        Scanner in = new Scanner(System.in);
        float a, b, c;
        System.out.println("Enter three numbers ");
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();
        if ((a > b) && (a > c))
            System.out.println("the value of a is the greatest!!!");
        else if ((b > a) && (b > c))
            System.out.println("the value of b is the greatest!!!");
        else if ((c > a) && (c > b))
            System.out.println("the value of c is the greatest!!!");
        else
            System.out.println("May be two or three of them are equal");

        float d, e, f;
        System.out.println("Enter three numbers ");
        d = in.nextFloat();
        e = in.nextFloat();
        f = in.nextFloat();
        if ((d > e) || (d > f))
            System.out.println("the value of a is the greatest!!!");
        else if ((e > d) || (e > f))
            System.out.println("the value of b is the greatest!!!");
        else if ((f > d) || (f > e))
            System.out.println("the value of c is the greatest!!!");
        else
            System.out.println("May be two or three of them are equal");

        if (true){
            System.out.println("the value of a is the greatest!!!");
        }else{
            System.out.println("the value of b is the greatest!!!");
        }
    }
}
