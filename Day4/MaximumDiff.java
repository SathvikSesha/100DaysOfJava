package Day4;

public class MaximumDiff {
    public static void main(String[] args) {
        int nums[] = { -4, -2, -3 };
        System.out.println(new MaximumDiff().maxAdjacentDistance(nums));
    }

    public int maxAdjacentDistance(int[] nums) {
        int maxdiff = nums[0] - nums[1];
        for (int i = 1; i < nums.length - 1; i++) {
            int current = Math.abs(nums[i] - nums[i + 1]);
            maxdiff = Math.max(maxdiff, current);
        }
        int current = Math.abs(nums[nums.length - 1] - nums[0]);
        return Math.max(maxdiff, current);
    }
}
