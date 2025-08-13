package PracticeWallah;

import java.util.Scanner;

public class SumOfTwoNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number");
        int num_1 = sc.nextInt();

        System.out.println("Enter Second number");
        int num_2 = sc.nextInt();

        int sum = num_1 + num_2;
        System.out.println("Sum: " + sum);
    }
}
