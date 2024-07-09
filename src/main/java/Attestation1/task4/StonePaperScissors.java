package Attestation1.task4;

import java.io.IOException;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StonePaperScissors {

    private String userChar;
    private String computerChar;

    public StonePaperScissors() {
    }

    public int getScore(String input) {
        int x = 0;
        if (input.equals("К")) x = 1;
        else if (input.equals("Н")) x = 2;
        else x = 5;
        return x;
    }


    public String getRoundWinner(String userChar, String computerChar) {

        this.userChar = userChar;
        this.computerChar = computerChar;

        if (this.userChar.equals(computerChar)) {
            return "nobody";
        } else if ((this.userChar.equals("К") && this.computerChar.equals("Н") ||
                this.userChar.equals("Н") && this.computerChar.equals("Б") ||
                this.userChar.equals("Б") && this.computerChar.equals("К"))) {
            return "user";
        } else {
            return "computer";
        }
    }


    public String getUserChar() throws IOException {
        boolean hasRightLetter = false;


        do {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String pattern = "[КНБ]"; // Паттерн для строки чисел, разделенных пробелами

            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(input);

            if (m.matches()) {
                hasRightLetter = true;
                this.userChar = input;
            } else {
                System.out.println("Вы ввели неправильную букву, попробуйде еще раз:");
            }
        } while (!hasRightLetter);


        return this.userChar;
    }

    public void setUserChar(String userChar) {
        this.userChar = userChar;
    }

    public String getComputerChar() {
        Random random = new Random();
        char[] symbols = {'К', 'Н', 'Б'};
        int randomIndex = random.nextInt(symbols.length);
        this.computerChar = String.valueOf(symbols[randomIndex]);

        return computerChar;
    }

    public void setComputerChar(String computerChar) {
        this.computerChar = computerChar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StonePaperScissors that = (StonePaperScissors) o;
        return userChar == that.userChar && computerChar == that.computerChar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userChar, computerChar);
    }

    @Override
    public String toString() {
        return "stonePaperScissors{" +
                "userLetter=" + userChar +
                ", computerLetter=" + computerChar +
                '}';
    }
}
