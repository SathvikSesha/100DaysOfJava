package Day14;

public class DayFourTeen {
    public static void main(String[] args) {
        getConcatenation(new int[] { 1, 2, 3, 4 });
    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        System.arraycopy(nums, 0, ans, 0, nums.length);
        System.arraycopy(nums, 0, ans, nums.length, nums.length);
        return ans;
    }
}
