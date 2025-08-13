package PracticeWallah;
import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int course = sc.nextInt();
        switch (course) {
            case 1:
                System.out.println("Java");
                break;
            case 2:
                System.out.println("Python");
                break;
            case 3:
                System.out.println("cpp");
                break;
        } // <-- Missing closing brace here to close switch statement
    } // <-- Closing brace for main method
} // <-- Closing brace for class Main