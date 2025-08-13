package PracticeWallah;
import java.util.Scanner;

public class GradeClassificationExample {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Your Score(0-100): ");
        int score = sc.nextInt();
        if (score >=0 && score <=100){
            if (score > 90){
                System.out.println("Outstanding");
            } else if (score>=80) {
                System.out.println("Excelent");
            } else if (score>=70) {
                System.out.println("Good");
            } else if (score>=50) {
                System.out.println("Average");
            }else {
                System.out.println("Fail");
            }
        }else {
            System.out.println("Invalid score entered");
        }
    }
}
