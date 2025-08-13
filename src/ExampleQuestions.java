import java.util.Scanner;

public class ExampleQuestions {
    public static void main(String[] args) {

      /*  Example Q-1
       System.out.println(4+2+"pqr");
        System.out.println("pqr" +4+2);

           Example Q-2
        boolean p= true;
        boolean q= true;
        boolean r= false;

        System.out.println(q==r==p);*/
        Scanner sc = new Scanner(System.in);

        int p= 4 , q= 3 , r= 2;

        int s = (p-++r-++q);
        System.out.println("The value of s: " +s);

    }
}
