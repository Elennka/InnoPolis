package Homework5;

import java.util.ArrayList;
import java.util.List;

public class Homework5Companies {
    public static void main(String[] args) {

        List<Movie> films1 = new ArrayList<>();
        films1.add(new Movie("Я шагаю по Москве", 8, "Комедия", "Россия", false));
        films1.add(new Movie("Ирония судьбы, или С лёгким паром!", 9, "Комедия", "Россия", false));
        films1.add(new Movie("Москва слезам не верит", 7, "Мелодрама", "Россия", false));


        List<Movie> films2 = new ArrayList<>();
        films2.add(new Movie("La vita è bella", 6, "Комедия", "Италия", true));
        films2.add(new Movie("Bicycle Thieves!", 9, "Драма", "Италия", true));
        films2.add(new Movie("El secreto de sus ojos", 7, "Детектив", "Аргентина", true));

        List<Movie> films3 = new ArrayList<>();
        films3.add(new Movie("Брат", 9, "Драма", "Россия", false));
        films3.add(new Movie("All About My Mothe", 5, "Драма", "Испания", true));
        films3.add(new Movie("Volver a empezar", 7, "Драма", "Испания", true));

        List<Companies> myCompanies = new ArrayList<>();
        myCompanies.add(new Companies("ООО \"Централ Партнершип\"", 2010, films1));
        myCompanies.add(new Companies("Paramount Pictures", 1912, films2));
        myCompanies.add(new Companies("Brazzers", 2005, films2));

        for (Companies company : myCompanies) {

            for (Movie movie : company.getFilms()) {
                System.out.print(company.getName()+" : ");
                System.out.println(movie.getMovieName());
            }

        }


    }
}
