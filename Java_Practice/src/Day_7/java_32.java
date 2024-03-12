package Day_7;

import java.util.Scanner;

//Reading array values from the keyboard
public class java_32 {
    public static void main(String[] args)
        {
        int[] array = new int[5];
        int total = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter five integer numbers ");
        for(int i = 0; i<5; i++)
        array[i] = in.nextInt(); // add each element's value to total
        for (int counter = 0; counter < array.length; counter++)
        total += array[counter];
        System.out.printf("The sum of array elements: %d%n", total);
        }


        
//         int[] array = new int[5];
//         System.out.println("Enter five integer numbers ");
//         for(int i = 0; i<5; i++)
//         array[i] = in.nextInt();
//         System.out.printf("%s%8s%n", "Index", "Value"); // column headings
//         // output each array element's value
//         for (int counter = 0; counter < array.length; counter++)
//         System.out.printf("%5d%8d%n", counter, array[counter]);
//         }
 }
