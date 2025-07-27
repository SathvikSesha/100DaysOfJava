package Day10;

import java.util.Arrays;

public class MinDifference {
    public static void main(String[] args) {
        Consecutive_MindiffElement(new int[] { 1, 3, 6, 9, 11, 12, 14, 17 });
    }

    public static void Consecutive_MindiffElement(int arr[]) {
        int mindiff = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            mindiff = Math.min(diff, mindiff);
        }
        System.out.println(mindiff);
    }

    public static void reverse(String str) {
        int i = 0, j = str.length() - 1;
        char arr[] = str.toCharArray();
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        Arrays.toString(arr);
    }
}
