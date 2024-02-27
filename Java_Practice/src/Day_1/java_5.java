package Day_1;
import java.util.Scanner; 
/*
The range of values for an int is -2,147, 483,648 to 2,147, 483,648
    In the Data Type int, float, double and char are called primitive type.
        The size of a primitive data types is fixed in Java.
        Primitive-type names are keywords and must appear in all lowercase letters.
    

*/

   
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
