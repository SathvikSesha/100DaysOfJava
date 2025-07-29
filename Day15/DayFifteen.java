package Day15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DayFifteen {
    public static void main(String[] args) {
        System.out.println(minimumDistances(new ArrayList<Integer>(java.util.Arrays.asList(3, 2, 1, 2, 3))));
    }

    public static int minimumDistances(List<Integer> a) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int mindiff = Integer.MAX_VALUE;
        int index = 0;
        for (int num : a) {
            if (set.add(num)) {
                arr.add(num);
            } else {
                int i = arr.indexOf(num);
                mindiff = Math.min(index - i, mindiff);
            }
            index++;
        }
        if (mindiff == Integer.MAX_VALUE)
            return -1;
        return mindiff;
    }
}
