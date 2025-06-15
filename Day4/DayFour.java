package Day4;

import java.util.Arrays;

public class DayFour {
    public static void main(String[] args) {
        int nums[] = { 0, 2, 1, 5, 3, 4 };
        int ans[] = new DayFour().BuildArray(nums);
        System.out.println(Arrays.toString(ans));
    }

    public int[] buildArray(int[] nums) {
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
            System.out.println(Arrays.toString(ans));
        }
        return ans;
    }

    public int[] BuildArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] + (nums[nums[i]] % nums.length) * nums.length;
            System.out.println(Arrays.toString(nums));
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] /= nums.length;
        }
        return nums;
    }
}
