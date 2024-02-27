package Day_1;
import java.util.Scanner;
/*
Arithmetic Operator
    like Addition(+),  Subtraction(-) , Multiplication(*) and Division(/) are the basic arithmetic operators it also Remainder(%)
    in Java Programming Language.

*/
public class java_6 {
    public static void main(String[] firew){

        System.out.println("Addition Ended:");
        addition();

        System.out.println("Subtraction Ended:");
        subtraction();

        System.out.println("Multiplication Ended:");
        multiplication();

        System.out.println("Division Ended:");
        division();

        System.out.println("Remainder Ended:");
        remainder();  
     }
     public static void addition(){
        Scanner input = new Scanner(System.in);
        int a, b, sum;
        System.out.print("Enter First Number : ");
        a=input.nextInt();
        System.out.print("Enter Second Number : ");
        b=input.nextInt();
        sum=a+b;
        System.out.println("Sum of "+a+" and "+b+" is : " +sum+"\n\n");  
     }
     public static void subtraction(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a, b, sub;
        a=input.nextInt();
        System.out.print("Enter the Second Number : ");
        b=input.nextInt();
        sub=a-b;
        System.out.println("The Subtraction" +a+"and"+b+"is :"+sub+"\n\n");
     }
     public static void  multiplication(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        float m1, n1, mul;
        m1=input.nextFloat();
        System.out.print("Enter the second number : ");
        n1=input.nextFloat();
        mul=m1*n1;
        System.out.println("The Multiplication of "+m1+" and "+n1+" is : "+mul+"\n\n");
     }
     public static void division(){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the division number : ");
        float d1=input.nextFloat();
        System.out.print("Enter the second division : ");
        float d2=input.nextFloat();
        float div=d1/d2;
        System.out.println("The Division of "+d1+" and "+d2+" is "+div+"\n\n");

     }
     public static void remainder(){
        Scanner input = new Scanner(System.in);
        double rem, r1, r2;
        System.out.print("Enter th Remainder Number");
        r1 = input.nextDouble();
        System.out.print("Enter th Remainder Number");
        r2 = input.nextDouble();
        rem = r1%r2;
        System.out.println("The Remainder of "+r1+" and "+r2+" is "+rem+"\n\n");
     }
     
}
