package Day_1;
// Relational Operators

import java.util.Scanner;
public class java_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
float num1, num2;

       System.out.println("Enter the first Integer number");
       num1 = input.nextInt(); 

       System.out.println("Enter the Second Integer number");
       num2 = input.nextInt(); 

       System.out.println(num1 == num2);
       System.out.println((num1 != num2));
       System.out.println(num1 < num2);
       System.out.println(num1 > num2);
       System.out.println(num1 >= num2);
        
    }
}
