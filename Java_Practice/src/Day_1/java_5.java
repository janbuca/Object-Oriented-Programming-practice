package Day_1;
import java.util.Scanner;    
public class java_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        System.out.println("Calculate the area of the Circle");

        double r, area;
        System.out.println("Enter the radius of the Circle:");
        r = input.nextDouble();
        area = Math.PI*r*r;
        System.out.printf("The Area of the circle is : %.2f",area); 
    }
}
