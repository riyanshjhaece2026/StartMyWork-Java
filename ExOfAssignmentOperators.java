package PracticeWallah;

public class ExOfAssignmentOperators {
    public static void main(String[] args) {
        int a = 10;

        System.out.println(a+=5);
        System.out.println(a-=3);
        System.out.println(a*=2);
        System.out.println(a%=3);
        System.out.println(a/=4);

        int p= 15;
        int q = 10;

        System.out.println(p+=q);//25
        System.out.println(p-=q);//15
        System.out.println(p*=q);//150
        System.out.println(p/=q);//15
        System.out.println(p%=q);//5
        System.out.println(p*=q);//50

    }
}
