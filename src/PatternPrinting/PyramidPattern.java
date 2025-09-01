package PatternPrinting;
import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the height of the pyramid
        System.out.print("Enter the height of the pyramid: ");
        int height = scanner.nextInt();

        // Loop to print the pyramid pattern
        for (int i = 1; i <= height; i++) {
            // Print spaces
            for (int j = i; j < height; j++) {
                System.out.print(" ");
            }
            // Print '*'
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }

        scanner.close();
    }
}
