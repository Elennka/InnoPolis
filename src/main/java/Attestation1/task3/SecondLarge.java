package Attestation1.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondLarge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String pattern = "\\d+(\\s\\d+)*"; // Паттерн для строки чисел, разделенных пробелами


        System.out.print("Введите строку чисел через пробел: ");
        String input = scanner.nextLine();

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);

        if(!m.matches()) {
           System.out.println("Строка НЕ соответствует паттерну.");
           System.exit(0);
        }


        String[] numberCharsArray = input.split(" ");

        int[] numbers = new int[numberCharsArray.length];
        try {
            for (int i = 0; i < numberCharsArray.length; i++) {   //перемещаем массив строк в массив чисел
                numbers[i] = Integer.parseInt(numberCharsArray[i]);
            }
        } catch (NumberFormatException n) {
            System.out.println("Введена неккоректная строка");
        }
        int largest = 0;
        int preLargest = 0;

        for (int number : numbers) {
            if (number > largest) {
                preLargest = largest;
                largest = number;
            } else if (number > preLargest && number != largest) {
                preLargest = number;
            }
        }

        System.out.println("Второй по величине элемент массива: " + preLargest);

        scanner.close();
    }
}
