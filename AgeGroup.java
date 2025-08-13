package PracticeWallah;

import java.util.Scanner;
public class AgeGroup {

    //Using if-else if and Nested if-else statements
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age<=12)          //Using Nested if-else
        {
            if (age <=5){
                System.out.println("Toddler");
            }else {
                System.out.println("Child");
            }

    } else if (age>12 && age<18) {
            System.out.println("Teenager");
        } else if (age>18) {
            System.out.println("Adult");
            
        }

    }
    }
