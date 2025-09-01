package PatternPrinting;
import java.util.Scanner;

public class NumRectangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        for (int i = 1; i<=r; i++){
            // Print numbers from i to r

            for (int j = i; j <= r; j++){
                System.out.print(j); // Print with space
            }
            // Print numbers from 1 to i-1
            for (int k = 1; k<= i-1; k++){
                System.out.print(k); // Print with space
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
