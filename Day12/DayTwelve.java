
package Day12;

import java.util.Arrays;

public class DayTwelve {
    public static void main(String[] args) {
        System.out.println(partitionArray(new int[] { 3, 6, 1, 2, 5 }, 2));
        System.out.println(partitionArray(new int[] { 2, 2, 4, 5 }, 0));
        System.out.println(partitionArray(new int[] { 1, 2, 3 }, 1));
        System.out.println(minimumCardPickup(new int[] { 95, 11, 8, 65, 5, 86, 30, 27, 30, 73, 15, 91, 30, 7, 37, 26,
                55, 76, 60, 43, 36, 85, 47, 96, 6 }));
    }

    public static int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 1;
        int index = 0;
        int i = 1;
        while (i < nums.length) {
            if (nums[i] - nums[index] <= k) {
                i++;
            } else if (nums[i] - nums[index] > k) {
                count++;
                index = i;
            }
        }
        return count;
    }

    public static int minimumCardPickup(int[] cards) {
        int index = 0, i = 1, max = -1;
        while (i < cards.length) {
            if (cards[i] != cards[index]) {
                i++;
            } else if (cards[index] == cards[i]) {
                max = Math.max(i - index + 1, max);
                index++;
                i = index + 1;
            }
        }
        return max;
    }
}
