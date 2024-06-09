package Homework4;

import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {

        //1.
        Scanner scanner = new Scanner(System.in);

        // Ввод  целого числа с клавиатуры
        System.out.print("1. Введите значение для переменной balance: ");
        int balance = scanner.nextInt();

        // Проверяем, равно ли значение переменной balance 10
        if (balance == 10) {
            System.out.println("Десятка");
        } else System.out.println("Не десятка");


        //2.
        // Ввод  целого числа с клавиатуры
        System.out.print("2. Введите целое число: ");
        balance = scanner.nextInt();

        if ((balance % 2) == 0) {
            System.out.println("Четное число");
        } else if ((balance % 2) == 1) {
            System.out.println("Нечетное число");
        }


        //3.
        // Ввод  целого числа с клавиатуры
        System.out.print("3. Введите целое число: ");
        balance = scanner.nextInt();

        if ((balance % 2) == 0) {
            if ((balance % 4) == 0) {
                System.out.println("Четное число. Кратно четырем");
            } else System.out.println("Четное число");
        } else if ((balance % 3) == 0) {
            System.out.println("Нечетное число. Кратно трем");
        } else {
            System.out.println("Нечетное число");
        }


    }

}


