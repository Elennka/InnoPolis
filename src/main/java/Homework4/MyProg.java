package Homework4;

import java.util.Scanner;

public class MyProg {
    public static void main(String[] args) {
        String cardNumber = Card.enterCardNumber();
        String pinNumber = Card.enterPinNumber();
        String cvv = Card.enterCvv();
        String expireDate = Card.enterExpireDate();

        Card newCard = new Card(cardNumber, expireDate, cvv, pinNumber);

        newCard.printCardMask(); //печать карты с маской

        Scanner scanner = new Scanner(System.in);
        System.out.print("Для печати номера карты без маски введите ее пин-код пин-код: ");
        String pinCode = scanner.nextLine();

        newCard.printCardWithoutMask(pinCode); //печать карты без маски

    }
}
