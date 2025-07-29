package Day14;

public class MinimumDeletions {
    public static void main(String[] args) {
        minimumDeletions("dabdcbdcdcd", 2);
    }

    public static int minimumDeletions(String word, int k) {
        if (word.length() <= 1)
            return 0;
        int arr[] = new int[26];
        for (char ch : word.toCharArray()) {
            arr[ch - 'a']++;
        }
        int minDel = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (arr[i] == 0)
                continue;
            int del = 0;
            int freq = arr[i];

            for (int j = 0; j < 26; j++) {
                if (arr[j] == 0)
                    continue;
                if (i == j)
                    continue;

                int f = arr[j];
                if (f < freq) {
                    del += f;
                } else if (f - freq > k) {
                    del += f - freq - k;
                }
            }

            minDel = Math.min(minDel, del);
        }
        return minDel;
    }
}
