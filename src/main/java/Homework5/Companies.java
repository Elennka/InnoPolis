package Homework5;

import java.util.List;
import java.util.Objects;

public class Companies {
    private String name;
    private int foundationYear;
    List<Movie> films;



    public Companies(String name, int foundationYear, List<Movie> films) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.films = films;
    }


    public String getName() {
        return name;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public List<Movie> getFilms() {
        return films;
    }

    @Override
    public String toString() {
        return "Companies{" +
                "name='" + name + '\'' +
                ", foundationYear=" + foundationYear +
                ", films=" + films +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Companies companies = (Companies) o;
        return foundationYear == companies.foundationYear && Objects.equals(name, companies.name) && Objects.equals(films, companies.films);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, foundationYear, films);
    }
}
