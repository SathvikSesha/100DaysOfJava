package Recursion;

import java.util.Scanner;

public class RecursionPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("The give is a palindromre: " + palindrome(str, 0, str.length() - 1));
    }

    public static boolean palindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(end) != str.charAt(start)) {
            return false;
        }
        return palindrome(str, ++start, --end);
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
