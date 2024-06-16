package Homework6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest {
    public static void main(String[] args) {


        LocalDateTime currentDateTime = LocalDateTime.now();

        int days = 0;
        int hours = 0;
        int minutes = 101;

        LocalDateTime timestamp = currentDateTime.minusDays(days)
                .minusHours(hours)
                .minusMinutes(minutes);


        PostTimestamp postTimestamp = new PostTimestamp();
        String timestampString = postTimestamp.getTimestamp(timestamp);
        System.out.println(timestampString);


    }
}
