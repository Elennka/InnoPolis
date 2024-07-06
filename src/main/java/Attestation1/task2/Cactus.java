package Attestation1.task2;

import java.time.LocalDate;
import java.util.Objects;

public class Cactus implements Plants {

    String KindOfCactus;

    public Cactus(String kindOfCactus) {
        KindOfCactus = kindOfCactus;
    }

    public Cactus() {
    }

    public String getKindOfCactus() {
        return KindOfCactus;
    }

    public void setKindOfCactus(String kindOfCactus) {
        KindOfCactus = kindOfCactus;
    }

    @Override
    public LocalDate waterPlants(LocalDate lastWaterDate) {

        LocalDate waterDate;
        int month = lastWaterDate.getMonthValue();
        int days = lastWaterDate.getDayOfMonth();
        int daysInMonth = lastWaterDate.lengthOfMonth();


        switch (month) {
            case 12, 1: //если декабрь, январь
                return lastWaterDate.plusMonths(1);
            case 2: //февраль
                if (days < 7) return lastWaterDate.plusMonths(1); // если дата меньше 7 февраля, то прибавляем месяц
                else return lastWaterDate.plusDays(daysInMonth - days + 7); //если >= 7 февраля, делаем полив на конец первой недели следующего месяца (уже весна)
            case 3, 4, 9, 10,11:
                return lastWaterDate.plusWeeks(1); //март, апрель, сентябрь, октябрь, ноябрь
            case 5: //май
                if (days > 24) return lastWaterDate.plusDays(daysInMonth - days + 1); // поливать в первый день лета
                else return lastWaterDate.plusWeeks(1);// если <= 24 поливать через неделю
            case 6, 7, 8:
                int humidity = Sensor.Sensor(); //рассчитываем влажность
                if (humidity < 30) return lastWaterDate.plusDays(1);
                else return lastWaterDate.plusDays(2);
            default:
                break;
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cactus cactus = (Cactus) o;
        return Objects.equals(KindOfCactus, cactus.KindOfCactus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(KindOfCactus);
    }

    @Override
    public String toString() {
        return "Cactus{" +
                "KindOfCactus='" + KindOfCactus + '\'' +
                '}';
    }
}
