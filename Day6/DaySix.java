package Day6;

public class DaySix {
    public static void main(String[] args) {
        String s = "-999999999999";
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {
        if (s == null || s.length() == 0)
            return 0;
        s = s.trim();
        int index = 0;
        int sign = 1;
        long result = 0;
        if (s.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(index) == '+') {
            index++;
        }
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            result = result * 10 + (s.charAt(index) - '0');
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            index++;
        }
        return (int) (sign * result);
    }
}
