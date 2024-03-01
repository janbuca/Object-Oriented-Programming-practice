package Day_3;
import java.util.Scanner;

public class java_17 {
    public static void main(String[]fire){
        Scanner in = new Scanner (System.in);

        System.out.println("Enter the Student Mark ");
        float mark = in.nextFloat();

        if(mark>=90){
            System.out.println("He/She is deserves Grade A+");
        }else if(mark>=85){
            System.out.println("He/She is not Deserves Grade A");
        }else if(mark>=80){
            System.out.println("He/She is not Deserves Grade A-");
        }else if(mark>=75){
            System.out.println("He/She is not Deserves Grade B+");
        }else if(mark>=70){
            System.out.println("He/She is not Deserves Grade B");
        }else if(mark>=65){
            System.out.println("He/She is not Deserves Grade B-");
        }else if(mark>=60){
            System.out.println("He/She is not Deserves Grade C+");
        }else if(mark>=55){
            System.out.println("He/She is not Deserves Grade C");
        }else if(mark>=50){
            System.out.println("He/She is not Deserves Grade C-");
        }else if(mark>=45){
            System.out.println("He/She is not Deserves Grade D");
        }else if(mark<=45){
            System.out.println("He/She is not Deserves Grade It is Fall");
        }
        

    }
    
}
