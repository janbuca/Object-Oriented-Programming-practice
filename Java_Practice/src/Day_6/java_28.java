package Day_6;
import java.util.Scanner;
public class java_28 {

    public static void main(String[] firew){
        Scanner in = new Scanner (System.in);
        // Argument Promotion and Casting

        int a, b;
        double sum;
        System.out.println("Enter the first Number !");
            a = in.nextInt();
        System.out.println("Enter the first Number !");
            b = in.nextInt();

        sum = add(a, b); //3, 4
        
        System.out.printf("The sum of the two numbers is %f%n", sum);
        }
        
        public static double add(double x, double y)
        {
            return (x + y);
        }
}

    

