package Day_2;
import java.util.Scanner;
public class java_10 {
    public static void main(String[] firew){
        Scanner input = new Scanner(System.in);

        java_9 myJava_9 = new java_9() ;
        System.out.printf("Initial name is : %s%n%n ", myJava_9.getName());
        System.out.print("Please enter the name : ");
        String theName = input.nextLine();
        myJava_9.setName(theName);
        System.out.println();
        System.out.printf("Name in Object myjava_9 is : %s:%n%s%n", myJava_9.getName());
        
    }

}
