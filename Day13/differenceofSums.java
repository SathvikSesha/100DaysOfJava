package Day13;

public class differenceofSums {
    public static void main(String[] args) {
        int x = differenceOfSums(5, 6);
        System.out.println(x);
    }

    static int differenceOfSums(int n, int m) {
        int divisible = 0;
        int nondivisible = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0)
                divisible += i;
            else
                nondivisible += i;
        }
        System.out.println(nondivisible + " " + divisible);
        return nondivisible - divisible;
    }
}
