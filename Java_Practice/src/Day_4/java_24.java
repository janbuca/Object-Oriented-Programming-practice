package Day_4;

public class java_24 {
    public static void main(String[] firew){
        int a = 10, b, c, d, e, f, g, sum;
        System.out.println(" The initial value of a is : " + a);
        b = ++a; // a = 11, b =11
        System.out.println(" The value of a is : " + a);
        System.out.println(" The value of b is : " + b);
        c = b++; // c = 11, b =12
        System.out.println(" The value of b is : " + b);
        System.out.println(" The value of c is : " + c);
        d = --c; // c = 10, d =10
        System.out.println(" The value of c is : " + c);
        System.out.println(" The value of d is : " + d);
        e = d--; // e = 10, d =9
        System.out.println(" The value of d is : " + d);
        System.out.println(" The value of e is : " + e);
        f = ++e; // e = 11, f = 11
        System.out.println(" The value of e is : " + e);
        System.out.println(" The value of f is : " + f);
        g = a++; // g = 11, a = 12
        System.out.println(" The value of a is : " + a);
        System.out.println(" The value of g is : " + g);
        //12+10 + 12+9 +11 +11+ 11
        sum = a + b + c + d + --e + f + g++;
        System.out.println(" The value of sum is : " + sum);
        System.out.println(" The value of g is : " + g);
        }
}
