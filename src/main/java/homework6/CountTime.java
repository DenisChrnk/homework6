package homework6;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CountTime implements HumanReadableTimestamp {

    public String getTimestamp(LocalDateTime eventTimestamp) {
        LocalDateTime timeNow = LocalDateTime.now();
        Duration duration = Duration.between(eventTimestamp, timeNow);
        Long period2 = ChronoUnit.DAYS.between(eventTimestamp.toLocalDate(), timeNow.toLocalDate());
        if (duration.toMinutes() < 60) {
            if (duration.toMinutes() % 10 == 1 && duration.toMinutes() != 11) {
                return "Опубликовано " + duration.toMinutes() + " минуту назад";
            } else if (duration.toMinutes() % 10 == 2 || duration.toMinutes() % 10 == 3 || duration.toMinutes() % 10 == 4) {
                return "Опубликовано " + duration.toMinutes() + " минуты назад";
            } else {
                return "Опубликовано " + duration.toMinutes() + " минут назад";
            }
        }
        if (duration.toHours() < 24) {
            if (duration.toHours() % 10 == 1 && duration.toHours() != 11) {
                return "Опубликовано " + duration.toHours() + " час назад";
            } else if (duration.toHours() % 10 == 2 || duration.toHours() % 10 == 3 || duration.toHours() % 10 == 4) {
                return "Опубликовано " + duration.toHours() + " часа назад";
            } else {
                return "Опубликовано " + duration.toHours() + " часов назад";
            }

        }
        if (period2 == 1) {
            return "Опубликовано вчера";
        } else if (period2 % 10 == 1 && period2 != 11 && period2 != 111) {
            return "Опубликовано " + period2 + " день назад";
        } else if (period2 % 10 == 2 || period2 % 10 == 3 || period2 % 10 == 4) {
            return "Опубликовано " + period2 + " дня назад";
        } else {
            return "Опубликовано " + period2 + " дней назад";
        }
    }
}
