package Recursion;

import java.util.Scanner;

public class aone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Sum is : " + sum(n));
        System.out.println("factorial is : " + fact(n));
        System.out.println("The fibonacci : " + fibo(n));
        print(n, 1);
        System.out.println();
        printdec(n);
        System.out.println("Reverse of number: " + reverse(n, 0));
        System.out.println("Number of digits: " + countn(1234, 0));
    }

    public static int sum(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static int fibo(int n) {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void print(int n, int num) {
        if (num > n) {
            return;
        }
        System.out.print(num + " ");
        print(n, num + 1);
    }

    public static void printdec(int n) {
        if (n <= 0) {
            return;
        }
        System.out.print(n + " ");
        printdec(n - 1);
    }

    public static int reverse(int n, int sum) {
        if (n <= 0) {
            return sum;
        }
        return reverse(n / 10, sum * 10 + (n % 10));
    }

    public static int countn(int n, int count) {
        if (n <= 0) {
            return count;
        }
        return countn(n / 10, count + 1);
    }
}
