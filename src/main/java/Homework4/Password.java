package Homework4;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        //4. Ввод и проверка пароля

        Scanner scanner = new Scanner(System.in);
        System.out.print("4. Введите пароль: ");
        String password = scanner.nextLine();


        if (password.length() < 8) {
            System.out.println("В пароле должно быть 8 и более символов");
        }

        boolean hasDigit = false;
        //переводим строку в массив символов и проверяем является ли символ цифрой
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            System.out.println("Пароль должен содержать хотя бы одну цифру");
        }

        boolean hasSpecialChars = false;
        String specialCharacters = "!@#$%^&*№";
        //проверяем строку на наличие спецсимволов. Переводим ее в массив символов и каждый символ сравниваем со специальным
        for (char c : password.toCharArray()) {
            if (specialCharacters.indexOf(c) != -1) {
                hasSpecialChars = true;
                break;
            }
        }
        if (!hasSpecialChars) {
            System.out.println("Пароль должен содержать хотя бы один спецсимвол");
        }

        // пароль удовлетворяет всем условиям
        if (password.length() > 8 && (hasDigit) && hasSpecialChars) {
            System.out.println("Пароль принят");
        }

    }
}
