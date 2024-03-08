package Day_6;
/*Distinguishing Between Overloaded Methods

The compiler distinguishes overloaded methods by their signatures—a combination of the method's
 name and the number, types and order of its parameters, but not its return type. Return Types of 
 Overloaded Methods In discussing the logical names of methods used by the compiler, we did not mention 
 the return types of the methods. Method calls cannot be distinguished only by return type. If you had overloaded 
 methods that differed only by their return types and you called one of the methods in a standalone statement as in:
  square(2); the compiler would not be able to determine the version of the method to call, because the return value is ignored.
   Compiler issues an arror. */
import java.util.Scanner;
public class java_29 {
    public static void main(String[] firew){
        Scanner in = new Scanner(System.in);

        int a, b, c, sumInt, sum;
        double x, y, sumDouble;

        System.out.println("Enter the first Interger Number !");
            a = in.nextInt();
        System.out.println("Enter the second Interger Number !");
            b = in.nextInt();
        System.out.println("Enter the third Interger Number !");
            c = in.nextInt();

        sumInt = add(a, b); //5, 7
            System.out.printf("The sum of the two integer numbers is %d%n", sumInt); //12
        sum = add(a, b, c); //5, 7, 9
            System.out.printf("The sum of the three integer numbers numbers is %d%n", sum); //21
            int y1 = 5;
            System.out.println("Enter the first Double Number !");

        x = in.nextDouble();
            System.out.println("Enter the second Double Number !");
        y = in.nextDouble();
        sumDouble = add(x, y); //7.5, 4.7
            System.out.printf("The sum of the two Double numbers is %f%n", sumDouble); //12.2

        System.out.printf("Square of integer 7 is %d%n", square(7));
        System.out.printf("Square of double 7.5 is %f%n", square(7.5));
        }

   

    public static int add(int x, int y)
        {
            return (x + y);
        }

        public static int add(int x, int y, int z)
        {
            return (x + y + z);
        }

        public static double add(double x, double y)
        {
            return (x + y);
        }

        public static int square(int intValue) {
            System.out.printf("%nCalled square with int argument: %d%n", intValue);
            return intValue * intValue;
        }

        public static double square(double doubleValue){
            System.out.printf("%nCalled square with double argument: %f%n", doubleValue);
            return doubleValue * doubleValue;
        }
     }

