package Homework4MaskingCard;

import java.util.Scanner;

public class Card {
    private String cardNumber;
    private String expireDate;
    private String cvv;
    private String pinCode;

    public Card(String cardNumber, String expireDate, String cvv, String pinCode) {
        this.cardNumber = cardNumber;
        this.expireDate = expireDate;
        this.cvv = cvv;
        this.pinCode = pinCode;
        System.out.println("Новая карта создана");
    }

    ////метод ввода номера карты
    public static String enterCardNumber() {
        Scanner scanner = new Scanner(System.in);

        // Ввод номера карты с клавиатуры
        System.out.print("Введите номер карты: ");
        String cardNumber = scanner.nextLine();

        // Возвращаем введенный номер карты
        return cardNumber;
    }

    //метод ввода пин-кода
    public static String enterPinNumber() {
        Scanner scanner = new Scanner(System.in);

        // Ввод номера карты с клавиатуры
        System.out.print("Введите пин-код карты: ");
        String pinNumber = scanner.nextLine();

        // Возвращаем введенный пинкод
        return pinNumber;
    }

    //метод ввода cvv
    public static String enterCvv() {
        Scanner scanner = new Scanner(System.in);

        // Ввод cvv
        System.out.print("Введите cvv: ");
        String cvv = scanner.nextLine();

        // Возвращаем введенный cvv
        return cvv;
    }

    //метод ввода ExpireDate
    public static String enterExpireDate() {
        Scanner scanner = new Scanner(System.in);

        // Ввод номера карты с клавиатуры
        System.out.print("Введите срок действия карты: ");
        String expireDate = scanner.nextLine();

        // Возвращаем введеный срок действия карты
        return expireDate;
    }

    public void printCardMask() {
        String maskPart = "**** **** **** ";

        //Получаем последние 4 цифры карты
        String lastDigits = this.cardNumber.substring(this.cardNumber.length() - 4);

        //Формируем номер карты с маской
        String maskedCard = maskPart + lastDigits;
        System.out.println("Номер карты с маскировкой: " + maskedCard);
    }

    //печать карты без маски
    public void printCardWithoutMask(String pinCode) {

        if (pinCode.equals(this.pinCode)) {
            System.out.println("Номер карты без маскировки: " + this.cardNumber);
        } else{
            System.out.println("Введен неправильный пин-код");
        }
    }
}
