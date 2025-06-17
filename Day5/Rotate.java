package Day5;

import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateClockwise(new int[] { 1, 2, 3, 4, 5 }, 2)));
        System.out.println(Arrays.toString(rotateAntiClockwise(new int[] { 1, 2, 3, 4, 5 }, 2)));
    }

    public static int[] rotateClockwise(int arr[], int d) {
        reverseArr(arr, 0, arr.length - 1);
        reverseArr(arr, 0, arr.length - d - 1);
        reverseArr(arr, arr.length - d, arr.length - 1);
        return arr;
    }

    public static int[] rotateAntiClockwise(int arr[], int d) {
        reverseArr(arr, 0, arr.length - 1);
        reverseArr(arr, 0, d - 1);
        reverseArr(arr, d, arr.length - 1);
        return arr;
    }

    public static void reverseArr(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
