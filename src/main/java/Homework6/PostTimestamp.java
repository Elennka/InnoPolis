package Homework6;

import java.time.Duration;
import java.time.LocalDateTime;

public class PostTimestamp implements HumanReadableTimestamp {


    public String getTimestamp(LocalDateTime eventTimestamp) {
        Duration duration = Duration.between(eventTimestamp, LocalDateTime.now());


        long seconds = duration.getSeconds();
        long minutes = duration.toMinutes();
        long hours = duration.toHours();
        long days = duration.toDays();

        if (seconds < 3600) { //если меньше часа
            if (minutes == 1 || (minutes % 10 == 1 && minutes != 11)) {
                return "Опубликовано " + minutes + " минуту назад";
            } else if (minutes == 2 || minutes == 3 || minutes == 4 || (minutes >= 22 && minutes % 10 >= 2 && minutes % 10 <= 4)) {
                return "Опубликовано " + minutes + " минуты назад";
            } else {
                return "Опубликовано " + minutes + " минут назад";
            }
        } else if (duration.toHours() < 24) {   //если меньше суток
            if (hours == 1 || (hours % 10 == 1 && hours != 11)) {
                return "Опубликовано " + hours + " час назад";
            } else if (hours == 2 || hours == 3 || hours == 4 || (hours >= 22 && hours % 10 >= 2 && hours % 10 <= 4)) {
                return "Опубликовано " + hours + " часа назад";
            } else {
                return "Опубликовано " + hours + " часов назад";
            }

        } else if (duration.toHours() >= 24 && duration.toHours() < 48) {
            return "Опубликовано вчера";

        } else { // более одного дня

            if (days == 1 || days == 21 || days == 31 || days == 101)
                return "Опубликовано " + days + " день назад";
            else if (days == 2 || days == 3 || days == 4 || (days >= 22 && days % 10 >= 2 && days % 10 <= 4))
                return "Опубликовано " + days + " дня назад";
            else
                return "Опубликовано " + days + " дней назад";
        }


    }


}
