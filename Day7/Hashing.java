package Day7;

import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        int x = OccuranceNum(new int[] { 1, 2, 3, 4, 4, 3, 8, 9, 2, 1, 11, 9, 4 }, 4);
        System.out.println(x);
        System.out.println(OccuranceChar("abbaaabaa", 'a'));
        System.out.println(usingMaps(new int[] { 1, 2, 3, 4, 4, 3, 8, 9, 2, 1, 11, 9, 4 }, 4));
    }

    public static int OccuranceNum(int arr[], int num) {// let us assume we have max to 10^5 numbers
        int hash[] = new int[100001];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] += 1;
        }
        return hash[num];
    }

    public static int OccuranceChar(String str, char a) {
        int hash[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int x = str.charAt(i) - 'a';
            hash[x] += 1;
        }
        return hash[a - 'a'];
    }

    public static int usingMaps(int arr[], int num) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : arr) {
            map.put(a, map.getOrDefault(num, 0) + 1);
        }
        return map.get(num);
    }
}
