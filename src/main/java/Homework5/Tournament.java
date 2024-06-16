package Homework5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tournament {
    private String tournamentName;
    private List<Players> playersList;

    public Tournament() {

        //для турнира инициализируем список игроков
        this.playersList = new ArrayList<>();

    }

    //метод добавления игрока в список турнира
    public void AddPlayer(Players player) {

        boolean isExistPlayer = false;
        for (Players playerInList : this.playersList) {
            if (playerInList.equals(player)) {
                System.out.println("Игрок " + player.toString() + " уже зарегистрирован в турнире");
                isExistPlayer = true;
            }
        }

        if (!isExistPlayer) {
            this.playersList.add(player);
            System.out.println("Игрок " + player.toString() + " добавлен в " + this.tournamentName);
        }


    }

    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public List<Players> getPlayersList() {
        return playersList;
    }

    public void setPlayersList(List<Players> playersList) {
        this.playersList = playersList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tournament that = (Tournament) o;
        return Objects.equals(tournamentName, that.tournamentName) && Objects.equals(playersList, that.playersList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tournamentName, playersList);
    }

    @Override
    public String toString() {
        return "Tournament{" +
                "tournamentName='" + tournamentName + '\'' +
                ", playersList=" + playersList +
                '}';
    }
}
