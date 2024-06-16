package Homework5;

public class Homework5Tournament {

    public static void main(String[] args) {

        //создаем игроков
        Players player1 = new Players(1, "Slava", true);
        Players player2 = new Players(2, "Ivan", true);
        Players player3 = new Players(3, "Petr", true);
        Players player4 = new Players(4, "Vova", true);
        Players player5 = new Players(5, "Sergey", false);
        Players player6 = new Players(6, "Alexei", true);
        Players player7 = new Players(7, "Vlad", true);
        Players player8 = new Players(8, "Vadim", false);
        Players player9 = new Players(9, "Nikita", true);
        Players player10 = new Players(10, "Maxim", true);


        //создаем турнир
        Tournament tournament1 = new Tournament();
        tournament1.setTournamentName("Турнир1");  //задаем название
        //Добавляем в турнир игроков
        tournament1.AddPlayer(player1);
        tournament1.AddPlayer(player2);
        tournament1.AddPlayer(player3);
        tournament1.AddPlayer(player4);
        tournament1.AddPlayer(player5);
        tournament1.AddPlayer(player6);
        tournament1.AddPlayer(player7);
        tournament1.AddPlayer(player8);
        tournament1.AddPlayer(player9);
        tournament1.AddPlayer(player10);
        tournament1.AddPlayer(player5);

    }








}
