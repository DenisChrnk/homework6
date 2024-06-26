package homework6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task1 {
    public static void main(String[] args) {

        LocalDate publishDate = LocalDate.now().minusDays(1);
        LocalTime publishTime = LocalTime.now().minusHours(23);
        LocalDateTime timestamp = LocalDateTime.of(publishDate, publishTime);

        HumanReadableTimestamp res = new CountTime();
        System.out.println(res.getTimestamp(timestamp));

    }
}
