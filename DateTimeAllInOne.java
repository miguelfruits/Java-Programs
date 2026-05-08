import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeAllInOne {
    public static void main(String[] args) {

        // 1. Current Date
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);

        // 2. Current Time
        LocalTime nowTime = LocalTime.now();
        System.out.println("Current Time: " + nowTime);

        // 3. Current DateTime
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + nowDateTime);

        // 4. Specific Date
        LocalDate customDate = LocalDate.of(2020, 1, 1);
        System.out.println("Custom Date: " + customDate);

        // 5. Add / Subtract
        System.out.println("After 10 days: " + today.plusDays(10));
        System.out.println("10 days ago: " + today.minusDays(10));

        // 6. Formatting
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatted = nowDateTime.format(formatter);
        System.out.println("Formatted DateTime: " + formatted);

        // 7. Parsing
        String input = "15-04-2026 14:30:00";
        LocalDateTime parsed = LocalDateTime.parse(input, formatter);
        System.out.println("Parsed DateTime: " + parsed);

        // 8. Time Zones
        ZonedDateTime india = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime london = ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println("India Time: " + india);
        System.out.println("London Time: " + london);

        // 9. Period (Date difference)
        LocalDate birthDate = LocalDate.of(2000, 5, 15);
        Period age = Period.between(birthDate, today);
        System.out.println("Age: " + age.getYears() + " years");

        // 10. Duration (Time difference)
        LocalTime start = LocalTime.of(10, 0);
        LocalTime end = LocalTime.of(12, 30);
        Duration duration = Duration.between(start, end);
        System.out.println("Duration: " + duration.toHours() + " hours");
    }
}