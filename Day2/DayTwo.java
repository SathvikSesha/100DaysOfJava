package Day2;

import java.util.Scanner;

public class DayTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "12345";
        System.out.println(str + 110);
        int num = Integer.parseInt(str);
        System.out.println(num + 110);
        double x = 105.8975;
        System.out.println(x);
        int numx = (int) x;
        System.out.println(numx);
        float b = 12.876f;
        System.out.println(b);
        int xb = (int) b;
        System.out.println(xb);
        String r = String.valueOf(xb);
        System.out.println(r + 10);
        sc.close();
    }
}
