package Attestation1.task2;

import java.util.Random;

public  class Sensor {

    static int Sensor() {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("Влажность: "+ randomNumber);
        return randomNumber;
    }

    @Override
    public String toString() {
        return "Sensor{}";
    }
}
