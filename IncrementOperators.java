package PracticeWallah;

public class IncrementOperators {
    public static void main(String[] args) {
        int p=5;
        int q= 5;

        System.out.println(p++); //5 Assign
        System.out.println(p); //1+5= 6

        System.out.println(++q); //1+5= 6
        System.out.println(q);//6 Assign

        int x = p++;
        int y = ++q;

        System.out.println(x);//6 Assign
        System.out.println(y);//6+1= 7

        System.out.println(p);// 6+1= 7
        System.out.println(q); // 7 Assign

    }
}
