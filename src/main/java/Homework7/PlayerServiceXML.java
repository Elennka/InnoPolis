package Homework7;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class PlayerServiceXML implements PlayerService {
    private int i;
    private Path filePath = Path.of("./test.xml");
    private List<Player> playerList = new ArrayList();

    @Override
    public Player getPlayerById(int id) throws IOException, JAXBException {
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
        return  this.playerList;
    }

    @Override
    public int createPlayer(String nickname) throws IOException {
        Player newPlayer = new Player(i, nickname, 0, false);
        this.playerList.add(newPlayer);
        i++;
        return i;
    }

    @Override
    public Player deletePlayer(int playerId) throws IOException, JAXBException {
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
    public int addPoints(int playerId, int points) throws IOException, JAXBException {
        List<Player> allPlayers = readPlayersFromFile();
        for (Player currentPlayer : allPlayers) {
            if (currentPlayer.getId() == playerId) {
                currentPlayer.setPoints(points);
            }
        }
        writePlayersToFile(allPlayers);
        return 0;
    }

    @Override
    public void writePlayersToFile(List<Player> player) throws IOException, JAXBException {
        Players myPlayers = new Players(player);
        JAXBContext context = JAXBContext.newInstance(Player.class, Players.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(myPlayers, filePath.toFile());
    }

    @Override
    public List<Player> readPlayersFromFile() throws IOException, JAXBException {
        JAXBContext context = JAXBContext.newInstance(Player.class, Players.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Players unmarshalPlayers = (Players) unmarshaller.unmarshal(filePath.toFile());
        return unmarshalPlayers.getPlayerList();
    }

    @Override
    public List<Player> printPlayersFromFile(List<Player> playersToPrint) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Player.class, Players.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Players unmarshalPlayers = (Players) unmarshaller.unmarshal(filePath.toFile());
        for (Player currentplayer:unmarshalPlayers.getPlayerList()){
            System.out.println(currentplayer);
        }
        return null;
    }
}
