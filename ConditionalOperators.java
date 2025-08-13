package PracticeWallah;
import java.util.Scanner;

public class ConditionalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int value = sc.nextInt();

        String result;
        if (((value % 2) == 0) && ((value % 3) == 0)) result = String.valueOf(value);
        else result = "Value is not even or not divisible by 3";
        System.out.println( "The value is Divisible: " +result);
    }

}
