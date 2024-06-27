package Homework7;

import jakarta.xml.bind.JAXBException;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

public interface PlayerService {
    // получить игрока по id
    Player getPlayerById(int id) throws IOException, JAXBException;

    // получить список игроков
    List<Player> getPlayers() throws IOException;

    // создать игрока (возвращает id нового игрока)
    int createPlayer(String nickname) throws IOException;


    void writePlayersToFile(List<Player> players) throws IOException, JAXBException;

    List<Player> readPlayersFromFile() throws IOException, JAXBException;

    // удалить игрока по id'шнику, вернет удаленного игрока
    Player deletePlayer(int id) throws IOException, JAXBException;

    // добавить очков игроку. Возвращает обновленный счет
    int addPoints(int playerId, int points) throws IOException, JAXBException;

    List <Player> printPlayersFromFile (List<Player> playersToPrint) throws IOException, JAXBException;
}
