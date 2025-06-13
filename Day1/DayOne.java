package Day1;

public class DayOne {
    public static void main(String[] args) {
        System.out.println("Hi");
        for (String a : args) {
            System.out.print(a + " ");
        }
        int x = Integer.parseInt(args[0]);
        System.out.println(x + 10);
    }
}