package Attestation1.task4;

import java.io.IOException;

public class PlayTheGame {
    public static void main(String[] args) throws IOException {

        String userChar, computerChar;
        int userScore = 0, computerScore = 0;
        String roundResult;

        System.out.println("Игра \"Камень, ножницы, бумага\"!");

        for (int round = 1; round <= 5; round++) {
            System.out.println("\nРаунд " + round);
            System.out.println("Ваш ход: (К)амень, (Н)ожницы, (Б)умага");
            StonePaperScissors newRound = new StonePaperScissors();

            userChar = newRound.getUserChar();
            computerChar = newRound.getComputerChar();

            System.out.println("Вы выбрали: " + userChar);
            System.out.println("Компьютер выбрал: " + computerChar);

            roundResult = newRound.getRoundWinner(userChar, computerChar);

            switch (roundResult) {
                case "user": {
                    userScore = userScore + newRound.getScore(userChar);
                    break;}
                case "computer": {
                    computerScore = computerScore + newRound.getScore(computerChar);
                    break;
                }
                default:break;
            }
            System.out.println("Результат раунда: " + roundResult);
            System.out.println("У пользователя: " + userScore);
            System.out.println("У компьютера: " + computerScore);

        }

        // Выводим итоговый результат
        System.out.println("\nИтоговый счет:");
        System.out.println("Вы: " + userScore + " очков");
        System.out.println("Компьютер: " + computerScore + " очков");

        // Определяем общего победителя
        if (userScore > computerScore) {
            System.out.println("Вы победили в игре!");
        } else if (computerScore > userScore) {
            System.out.println("Вы проиграли в игре.");
        } else {
            System.out.println("Ничья!");
        }


    }
}
