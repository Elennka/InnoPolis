package Homework2_3;

import static java.time.chrono.JapaneseEra.values;

public class task3 {
    public static void main(String[] args) {

        Item item1 = new Item("Белая блузка", "65788999", 1000.50, 100, "white", 42);
        Item item2 = new Item("Черные штаны", "65788988", 800.50, 150, "white", 42);
        Item item3 = new Item("Футболка", "65788912", 700.20, 1000, "white", 52);
        Item item4 = new Item("Шорты", "65788934", 300.30, 1005, "white", 48);
        Item item5 = new Item("Майка", "65788954", 150.50, 10007, "white", 128);


        item1.printInfo();
        item2.printInfo();
        item3.printInfo();
        item4.printInfo();
        item5.printInfo();




    }
}
