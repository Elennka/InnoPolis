package Homework7;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class PlayerServiceJSON implements PlayerService {

    int i = 0;
    private Path filePath = Path.of("./test.xml");
    private List<Player> playerList = new ArrayList();

    @Override
    public int createPlayer(String nickname) throws IOException {
        Player newPlayer = new Player(i, nickname, 0, false);
        this.playerList.add(newPlayer);
        i++;
        return i;
    }

    @Override
    public Player getPlayerById(int id) throws IOException {
        List<Player> allPlayers = readPlayersFromFile();
        for (Player currentPlayer : allPlayers) {
            if (currentPlayer.getId() == id) {
                System.out.println("\nИгрок с id = " + id);
                System.out.println(currentPlayer);
                return currentPlayer;
            }
        }
        return null;
    }

    @Override
    public List<Player> getPlayers() throws IOException {
        return this.playerList;
    }

    @Override
    public Player deletePlayer(int playerId) throws IOException {
        List<Player> allPlayers = readPlayersFromFile();
        int idInList = 0;
        for (Player currentPlayer : allPlayers) {
            if (currentPlayer.getId() == playerId) {
                idInList = currentPlayer.getId();
            }
        }
        allPlayers.remove(allPlayers.get(idInList));
        writePlayersToFile(allPlayers);
        return null;
    }

    @Override
    public int addPoints(int playerId, int points) throws IOException {
        List<Player> allPlayers = readPlayersFromFile();
        for (Player currentPlayer : allPlayers) {
            if (currentPlayer.getId() == playerId) {
                currentPlayer.setPoints(points);
            }
        }
        writePlayersToFile(allPlayers);
        return 0;
    }

    public void writePlayersToFile(List<Player> players) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(filePath.toFile(), players);
    }

    public List<Player> readPlayersFromFile() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Player> playersFromFile = mapper.readValue(filePath.toFile(), new TypeReference<>() {});
        return playersFromFile;
    }

    public List<Player> printPlayersFromFile(List<Player> playersToPrint) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Player> playersFromFile = mapper.readValue(filePath.toFile(), new TypeReference<>() {});
        for (Player currentPlayer : playersFromFile) {
            System.out.println(currentPlayer);
        }
        return null;
    }
}
