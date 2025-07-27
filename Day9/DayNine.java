package Day9;

public class DayNine {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
    }

    public static int maxArea(int heights[]) { // leetcode problem 11
        int maxarea = 0, i = 0, j = heights.length - 1;
        while (i < j) {
            int x = Math.min(heights[i], heights[j]);
            maxarea = Math.max(maxarea, x * (j - i));
            if (heights[i] > heights[j])
                j--;
            else
                i++;
        }
        return maxarea;
    }
}
