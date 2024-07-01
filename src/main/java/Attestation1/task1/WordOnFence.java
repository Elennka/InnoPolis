package Attestation1.task1;

import java.util.Scanner;

public class WordOnFence {
    public static void main(String[] args) {

        int numberOfLetters = 15;
        int numberOfSpaces = 3;
        int lengthOfSpace = 12;
        int lengthOfThreeletters = 62;
        int fenceLength;

        int lengthOfPhrase = numberOfSpaces * lengthOfSpace + numberOfLetters / 3 * lengthOfThreeletters;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите длину забора (Для выхода нажмите любую букву): ");
            if (!scanner.hasNextInt()){
                break;
            } else {
                fenceLength = scanner.nextInt();
            }

            if (fenceLength < lengthOfPhrase) {
                System.out.println("Фраза не уместится на заборе");
            } else {
                System.out.println("Фраза уместится на заборе");
            }

        } while (true);
        System.out.println("Работа программы завершена");

    }


}
