package Day3;

import java.util.HashSet;

public class DayThree {
    public static void main(String[] args) {
        swap(10, 20);
        System.out.println(sumofDigits(12345));
        System.out.println("the Digit Analyzer:" + DigitAnalyzer(52342));
        TriangleValidatorClassifier(5, 12, 13);
        securityCheckPin(2312);
    }

    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }

    public static int sumofDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + (n % 10);
            n = n / 10;
        }
        return sum;
    }

    public static boolean DigitAnalyzer(int n) {
        System.out.println("The sum of even digits is:" + SumOfEvenDigits(n));
        boolean x = firstAboveLast(n);
        boolean y = unique(n);
        if (x && y) {
            return true;
        }
        return false;
    }

    public static int SumOfEvenDigits(int n) {
        int sumOfEvenDigits = 0;
        for (int i = 0; n > 0; i++) {
            if (i % 2 == 0) {
                sumOfEvenDigits += n % 10;
            }
            n = n / 10;
        }
        return sumOfEvenDigits;
    }

    public static boolean firstAboveLast(int n) {
        int firstDigit = n;
        int lastDigit = n % 10;
        while (firstDigit > 10) {
            firstDigit /= 10;
        }
        return firstDigit > lastDigit;
    }

    public static boolean unique(int n) {
        HashSet<Integer> a = new HashSet<>();
        int i = 0;
        while (n > 0) {
            i++;
            a.add(n % 10);
            n /= 10;
        }
        return i == a.size();
    }

    public static void TriangleValidatorClassifier(int a, int b, int c) {
        if ((a + b) > c && (b + c) > a && (a + c) > b) {
            if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            } else if (a != b && a != c && b != c) {
                System.out.println("Scalene");
            }
            if ((a * a + b * b) == (c * c) || (a * a + c * c) == (b * b) || (c * c + b * b) == (a * a)) {
                System.out.println("Right-angled");
            }
        } else {
            System.out.println("Not a Triangle");
        }
    }

    public static void securityCheckPin(int n) {
        HashSet<Integer> arr = new HashSet<>();
        boolean checks = false;
        int count = 0;
        int sum = 0;
        while (n > 0) {
            arr.add(n % 10);
            count++;
            sum = sum + n % 10;
            n = n / 10;
        }
        if (count == arr.size() && sum % 2 == 0) {
            checks = true;
        }
        if (checks) {
            System.out.println("Good PIN");
        } else {
            System.out.println("Not good for security");
        }
    }
}
