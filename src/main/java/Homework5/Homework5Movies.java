package Homework5;

import java.util.List;
import java.util.ArrayList;

public class Homework5Movies {
    public static void main(String[] args) {

        List<Movie> films = new ArrayList();
        films.add(new Movie("Я шагаю по Москве", 8, "Комедия", "Россия", false));
        films.add(new Movie("Ирония судьбы, или С лёгким паром!", 9, "Комедия", "Россия", false));
        films.add(new Movie("Москва слезам не верит", 7, "Мелодрама", "Россия", false));

        System.out.println(films.get(0));

    }
}
