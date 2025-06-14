package Day3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

public class newPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me your DOB - (dd-mm-yyy): ");
        String str = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthday = LocalDate.parse(str, formatter);
        LocalDate today = LocalDate.now();
        LocalDate nextBirtday = birthday.withYear(today.getYear());
        if (nextBirtday.isBefore(today) || nextBirtday.equals(today)) {
            nextBirtday = nextBirtday.plusYears(1);
        }
        Period years = Period.between(today, nextBirtday);
        long totalDays = ChronoUnit.DAYS.between(today, nextBirtday);
        long totalHours = ChronoUnit.HOURS.between(LocalDateTime.now(), nextBirtday.atTime(LocalTime.MIDNIGHT));
        System.out.println("Hey! Your next birthday is on " + nextBirtday.format(formatter));
        System.out.println("It comes in " + years.getMonths() + " months and in " + totalDays + " Days and in "
                + totalHours + " Hours ");
        sc.close();
    }
}
