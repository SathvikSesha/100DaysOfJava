package Day13;

public class Day13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }

    public static int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case 'I':
                    if (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X') {
                        sum = sum - 1;
                    } else {
                        sum = sum + 1;
                    }
                    break;
                case 'V':
                    sum = sum + 5;
                    break;
                case 'X':
                    if (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')
                        sum = sum - 10;
                    else
                        sum = sum + 10;
                    break;
                case 'L':
                    sum = sum + 50;
                    break;
                case 'C':
                    if (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M') {
                        sum = sum - 100;
                    } else
                        sum = sum + 100;
                    break;
                case 'D':
                    sum = sum + 500;
                    break;
                case 'M':
                    sum = sum + 1000;
                    break;
            }
        }
        char lastChar = s.charAt(s.length() - 1);
        switch (lastChar) {
            case 'I':
                sum += 1;
                break;
            case 'V':
                sum += 5;
                break;
            case 'X':
                sum += 10;
                break;
            case 'L':
                sum += 50;
                break;
            case 'C':
                sum += 100;
                break;
            case 'D':
                sum += 500;
                break;
            case 'M':
                sum += 1000;
                break;
        }
        return sum;
    }
}