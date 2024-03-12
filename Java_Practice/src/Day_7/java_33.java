package Day_7;

//Enhanced for Statement
public class java_33 {
    public static void main(String[] args) {
        int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int total = 0; // add each element's value to total
        for (int number : array)
        total += number;
        System.out.printf("The sum of array elements: %d%n", total);
        }
}
