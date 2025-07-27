package Day8;

import java.util.Scanner;

public class BinaryNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        int n = sc.nextInt();
        while (n > 0) {
            str.append(n % 2);
            n = n / 2;
        }
        String s = str.toString();
        int current = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                current++;
            } else {
                current = 0;
            }
            max = Math.max(max, current);
        }
        System.out.println(max);
        sc.close();
    }
}
