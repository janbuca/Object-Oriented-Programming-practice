package Day_1;

//Programme uses class Scanner
import java.util.Scanner; 
public class java_4 {
    public static void main(String[] args) {
        //Create an object of the class Scanner
        Scanner input = new Scanner(System.in);
        int num1; // first number to add
        int num2; // second number to add

        int sum; // sum of num1 and num2
        System.out.println("Enter first Integer numbers:"); // prompt
        num1 = input.nextInt(); // read the first number from the user

        System.out.println("Enter second Integer numbers:"); // prompt
        num2 = input.nextInt() ; // read the second number from the user
        
        /* Add two numbers using a method */
        sum=addNumbers(num1, num2);

        System.out.printf("The Sum is %d",sum); // print the result
    }
    
   /* Method to add two numbers*/
    public static int addNumbers (int x , int y ) {
       return x + y;
    }
}
  
