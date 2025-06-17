package Day5;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextPermutationArray(new int[] { 2, 4, 1, 7, 5, 0 })));
    }

    public static int[] nextPermutationArray(int arr[]) {
        int index = -1;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                index = i - 1;
                break;
            }
        }
        if (index == -1) {
            reverseArr(arr, 0, arr.length - 1);
            return arr;
        }
        for (int i = arr.length - 1; i > index; i--) {
            if (arr[i] > arr[index]) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                break;
            }
        }
        reverseArr(arr, index + 1, arr.length - 1);
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
