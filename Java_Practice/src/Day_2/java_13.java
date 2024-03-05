package Day_2;
import java.util.Scanner;

public class java_13 {

    public static void main (String[] firew){
        Scanner input = new Scanner(System.in);

        java_11 account_1 = new java_11("Janbuca Teshome"); 
        java_12 account_2 = new java_12("Firew Kifle");

        System.out.printf("Account name is: %s%n", account_1.getName());
        System.out.printf("Account name is: %s%n", account_2.getName());

        System.out.println("please enter the name!");
        String theName = input.nextLine();
        account_1.setName(theName);
        System.out.printf("Account name is: %s%n", account_1.getName());
        System.out.printf("Account name is: %s%n", account_2.getName());
        
        }
    
   
}
