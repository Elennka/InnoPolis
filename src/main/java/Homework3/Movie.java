package Homework3;

public class Movie {
    String movieName;
    double rating;
    String genre;
    boolean hasOskar;

    public Movie(String movieName, double rating, String genre, boolean hasOskar) {
        this.movieName = movieName;
        this.rating = rating;
        this.genre = genre;
        this.hasOskar = hasOskar;
    }
    public void printInfo() {
        System.out.println(movieName + " - " + rating + " - " + genre + " - " + hasOskar);

    }
}
