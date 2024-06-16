package Homework5;

import java.util.*;

public class HomeWork5TournamentTable {
    public static void main(String[] args) {
        Map<Players, Integer> points = new HashMap<>();

       //добавляем игроков в хэш-меп
        points.put(new Players(1, "Slava", true), 0);
        points.put(new Players(2, "Slava", true), 0);
        points.put(new Players(3, "Slava", true), 0);
        points.put(new Players(4, "Slava", true), 0);
        points.put(new Players(5, "Slava", true), 0);
        points.put(new Players(6, "Slava", true), 0);
        points.put(new Players(7, "Slava", true), 0);
        points.put(new Players(8, "Slava", true), 0);
        points.put(new Players(9, "Slava", true), 0);
        points.put(new Players(10, "Slava", true), 0);

        //ищем игроков с id=4,7,8,9,10 и присваиваем им очки
        for (Map.Entry<Players, Integer> entry : points.entrySet()) {
            Players player = entry.getKey();
            if (player.getId() == 4) {
                points.put(player, 10);
            }
            if (player.getId() == 7) {
                points.put(player, 12);
            }
            if (player.getId() == 8) {
                points.put(player, 11);
            }
            if (player.getId() == 9) {
                points.put(player, 13);
            }
            if (player.getId() == 10) {
                points.put(player, 5);
            }
        }

        //создаем список для сортировки значений
        List<Map.Entry<Players, Integer>> sortedList = new ArrayList<>(points.entrySet());
        sortedList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        System.out.println("Топ 3 игроков по очкам:");
        int count = 1;
        for (Map.Entry<Players, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + " " + entry.getValue());

            if (count == 3) {
                break;
            }// Вывели топ 3 игроков
            count++;
        }

    }
}
