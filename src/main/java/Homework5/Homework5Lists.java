package Homework5;

import java.util.List;
import java.util.ArrayList;

public class Homework5Lists {
    public static void main(String[] args) {

        List<String> todoList =new ArrayList();
        todoList.add("Сходить в магазин");
        todoList.add("Дочитать книгу");
        todoList.add("Прослушать лекцию");
        todoList.add("Убраться дома");

        for(String listItem:todoList)
        {
            System.out.println(listItem);
        }


    }
}
