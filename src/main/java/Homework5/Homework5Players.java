package Homework5;

public class Homework5Players {
    public static void main(String[] args) {
        Players player1 = new Players(1, "Slava", true);
        Players player2 = new Players(1, "Slava", true);

        System.out.println((player1 == player2) ? "true" : "false");
        System.out.println((player1.equals(player2)) ? "true" : "false");



    }
}
