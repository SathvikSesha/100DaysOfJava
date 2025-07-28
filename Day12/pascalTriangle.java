package Day12;

import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        // for (int i = 1; i <= 5; i++) {
        // int c = 1;
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" " + c);
        // c = c * (i - j) / j;
        // }
        // System.out.println();
        // }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = (2 * (5 - i)); j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
