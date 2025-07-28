package Day11;

import java.math.BigInteger;

public class DayEleven {
    public static void main(String[] args) {
        int n = 25;
        extraLongFactorials(n);
        System.out.println(camelcase("saveChangesInTheEditor"));
        System.out.println(anagram("mnop"));
    }

    public static void extraLongFactorials(int n) {
        BigInteger a = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            a = a.multiply(BigInteger.valueOf(i));
        }
        System.out.println(a);
    }

    public static int camelcase(String s) {
        String arr[] = s.split("[A-Z]");
        return arr.length;
    }

    public static int anagram(String s) {
        if (s.length() % 2 != 0)
            return -1;

        String s1 = s.substring(0, s.length() / 2);
        String s2 = s.substring(s.length() / 2);

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (char c : s1.toCharArray()) {
            freq1[c - 'a']++;
        }
        for (char c : s2.toCharArray()) {
            freq2[c - 'a']++;
        }

        int changes = 0;
        for (int i = 0; i < 26; i++) {
            // How many characters are extra in s1 compared to s2
            if (freq1[i] > freq2[i]) {
                changes += freq1[i] - freq2[i];
            }
        }

        return changes;
    }

}
