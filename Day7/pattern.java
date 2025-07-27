package Day7;

public class pattern {
    public static void main(String[] args) {
        // print1(5);
        // print2(5);
        // print3(5);
        print4(5);
        // print5(5);
    }

    public static void print1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void print2(int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void print3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((i + j) % 2 + " ");
            }
            System.out.println();
        }
    }

    public static void print4(int n) {
        int count = 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void print5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = n - i; j < n; j++) {
                System.out.print(n - j);
            }
            System.out.println();
        }
    }
}
