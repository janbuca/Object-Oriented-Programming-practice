package Day_6;
import java.util.Scanner;
/*
    Assembling Strings with String Concatenation
        Java allows you to assemble String objects into larger strings by using operators + or +=.
        This is known as string concatenation. When both operands of operator + are String objects, operator + creates a new String object in which the characters of the right operand are placed at the end of those in the left operand—e.g., the expression "hello " + "there" creates the String "hello there".
        Every primitive value and object in Java can be represented as a String. When one of the + operator's operands is a String, the other is converted to a String, then the two are concatenated. Primitive values used in String concatenation are converted to Strings.
        A boolean concatenated with a String is converted to the String "true" or "false".
        All objects have a toString method that returns a String representation of the object. e.g.
*/
public class java_30 {
    public static void main (String[] firew){
        Scanner in = new Scanner(System.in);
        String s1 = "Ethio";
        String s2 = " ";
        String s3 = "Programming";
        System.out.println(s1+s2+s3);

        String n1 = "Ethio";
        int n2 = 567;
        String n3 = "Programming";
        System.out.println(n1+n2+n3); // The compiler will call n1.toString(), n2.toString() and n3.toString().
        System.out.println(n1+" "+n2+" "+n3);

        //boolean example:
        boolean b1 = true, b2 = false;
        System.out.println("b1 : " + b1 + ", b2 : " + b2);
        System.out.println("Boolean : " + (b1 == true));

        char c1 = 'A', c2 = '\u0041';
        System.out.println("c1 : " + c1 + ", c2 : " + c2);

        double d1 = 12.345678901234567890;
        long l1 = 987654321987654321L;
        float f1 = 0.1234567F;
        byte B1 = 127;
        short S1 = 32767;

        System.out.println("\n Double : " + d1);
        System.out.println("Long : " + l1);
        System.out.println("Float : " + f1);
        System.out.println("Byte : " + B1);
        System.out.println("Short : " + S1);

        /*
            The + operator can be used for string concatenation as shown above. However, if the operands are not Strings but other types,
            The + operator can be used for string concatenation as shown above. However, if one of the operands is not a String then it
            The + operator can be used for arithmetic addition if both operands are numbers.
            However, it cannot be used for string    concatenation if one or both operands are not Strings.
            To force numeric addition, use parentheses around either number.
        */
        System.out.println ("\nAddition with Arithmetic Operators:\n");
        System.out.println ("d1 + d1 : " + (d1 + d1) );
        System.out.println ("l1  + l1 : " + (l1 + l1));
        System.out.println ("f1  + f1 : " + (f1 + f1));
        System.out.println ("B1  + B1 : " + (B1 + B1));
        System.out.println ("S1  + S1 : " + (S1 + S1));

        /*
           If you try to add a number and a non-number using the + operator without parenthesis,
           Java will give an error because it doesn't know how to perform that operation.
           But when you put the number in parenthesis, Java knows you want to do arithmetic addition.
        */
        int i1 = 5;
        System.out.println ("i1 : " + i1);
        System.out.println ("i1 + i1 : " + (i1 + i1));
        System.out.println ("i1 + \"text\" : " + (i1 + "text")); // Error!
        System.out.println ("\"text\" + i1 : " + ("text" + i1)); // OK - this is string concatenation.

        /*
           You can also use the - operator for subtraction, but only between two numbers.
           Like the + operator, the - operator does not work for strings.
        */
        System.out.println ("\n Subtraction with Arithmetic Operator:\n");
        System.out.println ("d1 - d1 : " + (d1 - d1));
        System.out.println ("l1 - l1 : " + (l1 - l1));
        System.out.println ("f1 - f1 : " + (f1 - f1));
        System.out.println ("B1 - B1 : " + (B1 - B1 ));
        System.out.println ("S1 - S1 : " + (S1 - S1));

        /*
           Multiplication works just like addition, except with * instead of +.
           Again, there is no multiplication between integers and BigDecimals, so we need to cast.
        */
        System.out.println ("\nMultiplication:\n");
        System.out.println ("d1 * d1 : " + (d1 * d1));
        System.out.println ("(double) i1 * d1: " + ((double) i1 * d1));
        System.out.println ("l1 * l1 : " + (l1 * l1));
        System.out.println ("f1 * f1 : " + (f1 * f1) );
    }
}
      

