package Day3;

import java.time.LocalTime;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalTime a = LocalTime.now();
        System.out.println(a);
        if (a.getHour() < 12) {
            System.out.println("Good morning");
        } else if (a.getHour() < 17) {
            System.out.println("Good afternoon");
        } else {
            System.out.println("Good evening");
        }
        sc.close();
    }
}
