package Attestation1.task2;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class TimeToWater {
    public static void main(String[] args) {


        System.out.println("Введите дату последнего полива в формате dd.MM.yyyy: ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        boolean isData = false;

        Scanner scanner = new Scanner(System.in);
        LocalDate lastWaterDate = null;

        do { //ввод даты, пока не получим ее в нужном формате
            try {
                String inputDate = scanner.nextLine();
                lastWaterDate = LocalDate.parse(inputDate, formatter);
                isData = true;
            } catch (DateTimeParseException e) {
                System.out.println("Пожалуйста, введите дату в формате dd.MM.yyyy");
            }
        } while (!isData);

        Plants myCactus = new Cactus("Кактус обыкновенный");
        LocalDate nextWaterDate = myCactus.waterPlants(lastWaterDate);
        System.out.println(nextWaterDate.format(formatter)+" - Дата следующего полива");
    }
}

