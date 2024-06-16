package Homework5;

import java.util.Objects;

public class Movie {
    String movieName;
    double rating;
    String genre;
    String country;
    boolean hasOskar;

    public Movie(String movieName, double rating, String genre, String country, boolean hasOskar) {
        this.movieName = movieName;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.hasOskar = hasOskar;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setHasOskar(boolean hasOskar) {
        this.hasOskar = hasOskar;
    }

    public String getMovieName() {
        return movieName;
    }

    public double getRating() {
        return rating;
    }

    public String getGenre() {
        return genre;
    }

    public String getCountry() {
        return country;
    }

    public boolean isHasOskar() {
        return hasOskar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Double.compare(movie.rating, rating) == 0 && hasOskar == movie.hasOskar && Objects.equals(movieName, movie.movieName) && Objects.equals(genre, movie.genre) && Objects.equals(country, movie.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieName, rating, genre, country, hasOskar);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                ", country='" + country + '\'' +
                ", hasOskar=" + hasOskar +
                '}';
    }
}
