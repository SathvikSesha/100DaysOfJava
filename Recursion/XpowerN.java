package Recursion;

import java.util.Scanner;

public class XpowerN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base (X) : ");
        int x = sc.nextInt();
        System.out.print("Enter the power (N) : ");
        int n = sc.nextInt();
        System.out.println("The X^N is : " + xpown(x, n));
        ;
    }

    public static int xpown(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * xpown(x, n - 1);
    }
}
