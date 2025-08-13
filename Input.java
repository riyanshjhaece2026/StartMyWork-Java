package PracticeWallah;

import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name");
        String name = sc.nextLine();
        System.out.println("Name is: " +name);

        System.out.println("Enter your lucky Number");
        float num_1 = sc.nextFloat();
        System.out.println("Number is: " +num_1);
    }
}
