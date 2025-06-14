package Day3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ValidDateChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date (dd-MM-yyyy): ");
        String date = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            LocalDate ldate = LocalDate.parse(date, formatter);
            System.out.println("Valid date: " + ldate);
            System.out.println("Day of Week: " + ldate.getDayOfWeek());
        } catch (Exception e) {
            System.out.println("Invalid date");
        }
        sc.close();
    }
}
