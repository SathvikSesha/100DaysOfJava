package Day11;

import java.util.Arrays;
import java.util.Scanner;

public class operations {
    public static void main(String[] args) {
        leftRightSum(new int[] { 1, 5, 2, 7, 3, 8, 4 });
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char a[] = str.toCharArray();
        int i = 0, j = str.length() - 1;
        while (i < j) {
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        if (str.equals(a.toString()))
            System.out.print("Yes");
        else
            System.out.print("No");
    }

    public static void leftRightSum(int arr[]) {
        int b[] = new int[arr.length];
        int totalsum = 0;
        for (int num : arr) {
            totalsum += num;
        }
        int leftsum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rightsum = totalsum - leftsum - arr[i];
            b[i] = Math.abs(leftsum - rightsum);
            leftsum += arr[i];
        }
        System.out.println(Arrays.toString(b));
    }
}
