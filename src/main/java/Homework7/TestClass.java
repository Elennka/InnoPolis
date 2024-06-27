package Homework7;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestClass {
    public static void main(String[] args) throws IOException, JAXBException {

        int playerId;
        List<String>  myListPlayers = List.of("Антон","Павел","Семен","Егор","Петр", "Максим");
        PlayerService serviceJson = new PlayerServiceJSON();

        for(String nickname:myListPlayers){
            serviceJson.createPlayer(nickname);
        }
        serviceJson.writePlayersToFile(serviceJson.getPlayers());
        System.out.print("Начальный список игроков из json файла: \n");
        serviceJson.printPlayersFromFile(serviceJson.getPlayers());

        //удаление игрока по его id
        playerId = 1;
        serviceJson.deletePlayer(playerId);
        System.out.println("\nИгрок с id = " + playerId + " удален");

        //добавление очков по id игрока
        playerId = 3;
        serviceJson.addPoints(playerId, 5);
        System.out.println("\nИгроку с id = " + playerId + " добавлены очки");

        //получение игрока по его id
        playerId = 2;
        serviceJson.getPlayerById(playerId);
        System.out.print("\nИтоговый список игроков из json файла: \n");
        serviceJson.printPlayersFromFile(serviceJson.getPlayers());

//////////////////////////////////////////////////////////////////////////////////

        PlayerService serviceXml = new PlayerServiceXML();

        for(String nickname:myListPlayers){
            serviceXml.createPlayer(nickname);
        }
        serviceXml.writePlayersToFile(serviceXml.getPlayers());
        System.out.print("\n\nНачальный список игроков из xml файла: \n");
        serviceXml.printPlayersFromFile(serviceXml.getPlayers());

        //удаление игрока по его id
        playerId = 2;
        serviceXml.deletePlayer(playerId);

        //получение игрока по его id;
        playerId = 1;
        serviceXml.getPlayerById(playerId);

       //добавление очков по id игрока
        playerId = 4;
        serviceXml.addPoints(playerId, 5);
        System.out.println("\nИгроку с id = " + playerId + " добавлены очки");
        System.out.print("\nИтоговый список игроков из xml файла: \n");
        serviceXml.printPlayersFromFile(serviceXml.getPlayers());


    }
}
