package Day7;

public class DAySeven {
    public static void main(String[] args) {
        System.out.println(minMaxDifference(11891));
    }

    public static int minMaxDifference(int num) {
        String s = String.valueOf(num);
        return max(s) - min(s);
    }

    public static int max(String s) {
        char target = ' ';
        for (char ch : s.toCharArray()) {
            if (ch != '9') {
                target = ch;
                break;
            }
        }
        if (target == ' ')
            return Integer.parseInt(s);
        String rep = s.replace(target, '9');
        return Integer.parseInt(rep);
    }

    public static int min(String s) {
        char target = ' ';
        for (char ch : s.toCharArray()) {
            if (ch > '0') {
                target = ch;
                break;
            }
        }
        if (target == ' ')
            return Integer.parseInt(s);
        String rep = s.replace(target, '0');
        return Integer.parseInt(rep);
    }
}
