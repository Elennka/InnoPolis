package Homework2_3;


public class Item {

    String itemName;
    String articleNumber;
    double price;
    int quantity;
    String color;
    int size;

    public Item(String itemName, String articleNumber, double price, int quantity, String color, int size) {
        this.itemName = itemName;
        this.articleNumber = articleNumber;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.size = size;


    }

    public void printInfo() {
        System.out.println(articleNumber + " - " + itemName + " - " + price + " - " + quantity + " - " + color + " - " + size);

    }
}
