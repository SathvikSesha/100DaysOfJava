package Day7;

public class validPalindrome {
    public static void main(String[] x) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        if (s == null || s.length() == 0)
            return false;
        s = s.trim();
        StringBuilder str = new StringBuilder();
        for (char c : s.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                str.append(c);
            }
        }
        String original = str.toString();
        String reversed = str.reverse().toString();

        return original.equals(reversed);
    }
}
