import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTimeExample {
    public static void main(String[] args) {

        System.out.println("\n_________________TIME API_______________\n");
        LocalTime localTime = LocalTime.now();
        System.out.println("Current time : " + localTime);
        System.out.println("Hours : Minutes " + localTime.getHour() + ":" + localTime.getMinute());
        System.out.println("MIDNIGHT : " + LocalTime.MIDNIGHT);
        System.out.println("NOON : " + LocalTime.NOON);

        System.out.println("MIN  : " + LocalTime.MIN);
        System.out.println("MAX  : " + LocalTime.MAX);

        System.out.println("After 4 hour  : " + localTime.plusHours(4L));
        System.out.println("Before 2 hours : " + localTime.minusHours(2L));

        System.out.println("After 45 minutes  : " + localTime.plusMinutes(45));
        System.out.println("Before 31 minutes : " + localTime.minusMinutes(31));

        System.out.println("Custom Time :" + LocalTime.of(22, 59, 59));
        System.out.println("Is " + LocalTime.of(22, 59, 59) + " after " + LocalTime.now() + "? :"
                + localTime.isAfter(LocalTime.now()));
        System.out.println("Is " + LocalTime.of(22, 59, 59) + " before " + LocalTime.now() + "? :"
                + localTime.isBefore(LocalTime.now()));

        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        ZoneId kolkata = ZoneId.of("Asia/Kolkata");

        System.out.println("Zone Asia/Tokyo : " + LocalTime.now(tokyo));

        System.out.println("Zone Asia/Kolkata : " + LocalTime.now(kolkata));

        System.out.println("\n_________________DATE API_______________\n");
        LocalDate localDate = LocalDate.now();
        System.out.println("Current date : " + localDate.toString());

        System.out.println("Tomorrow : " + localDate.plusDays(1l));
        System.out.println("Day of week  : " + localDate.getDayOfWeek());
        System.out.println("Day of month : " + localDate.getDayOfMonth());
        System.out.println("Day of year : " + localDate.getDayOfYear());
        System.out.println("Is leap year? : " + localDate.isLeapYear());
        System.out.println("Subtract 28 days : " + localDate.minusDays(28l));

        System.out.println("MIN  : " + LocalDate.MIN);
        System.out.println("MAX  : " + LocalDate.MAX);

    }
}
