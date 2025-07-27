package Day8;

public class DayEight {
    public static void main(String[] args) {
        System.out.println(maxDiff(123456));
    }

    public static int maxDiff(int num) {
        String s1 = String.valueOf(num);
        String s2 = String.valueOf(num);
        return maxvalue(s1) - minvalue(s2);
    }

    public static int maxvalue(String s) {
        char temp = ' ';
        for (char c : s.toCharArray()) {
            if (c != '9') {
                temp = c;
                break;
            }
        }
        if (temp == ' ')
            return Integer.parseInt(s);
        String rep = s.replace(temp, '9');
        return Integer.parseInt(rep);
    }

    public static int minvalue(String s) {
        char temp = ' ';
        char replace = ' ';
        for (char c : s.toCharArray()) {
            if (c != '1' && c != '0') {
                temp = c;
                replace = s.charAt(0) == c ? '1' : '0';
                break;
            }
        }
        if (temp == ' ')
            return Integer.parseInt(s);
        String rep = s.replace(temp, replace);
        return Integer.parseInt(rep);
    }

}
