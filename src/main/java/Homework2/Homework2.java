package Homework2;

public class Homework2 {
    public static void main(String[] args) {
        String cardNumber = "1234 5678 9012 3456";
        String maskPart="**** **** **** ";

        //Удаляем из номера карты все пробелы
        cardNumber=cardNumber.replace("\s","");

        //Проверяем, что длина карты равна 16 цифрам, если нет, то выходим из программы с ошибкой
        if (cardNumber.length() != 16) {
            throw new IllegalArgumentException("Номер карты должен содержать 16 цифр.");
        }

        //Получаем последние 4 цифры карты
        String lastDigits = cardNumber.substring(12);

        //Формируем номер карты с маской
        String maskedCard=maskPart+lastDigits;
        System.out.println(maskedCard);

    }

}
