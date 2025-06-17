package Day5;

import java.util.Arrays;

public class DayFive {
    public static void main(String[] args) {
        System.out.println(new DayFive().isAnagram("anagram", "naragam"));
    }

    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr, tArr);
    }
}

class Tester {

    // Bubble sort in ascending order
    public static void sortArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Find maximum sum of 'm' elements
    public static int findMaxSum(int arr[], int m) {
        if (arr.length < m)
            return 0;
        int sum = 0;
        for (int i = arr.length - m; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Find minimum sum of 'm' elements
    public static int findMinSum(int arr[], int m) {
        if (arr.length < m)
            return 0;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int m = 4;

        sortArray(arr);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        int maxSum = findMaxSum(arr, m);
        int minSum = findMinSum(arr, m);

        System.out.println("\nMaximum Sum of " + m + " elements: " + maxSum);
        System.out.println("Minimum Sum of " + m + " elements: " + minSum);
    }
}
