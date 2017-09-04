package Lecture6.Task1Enum;

import java.util.ArrayList;
import java.util.List;

public class Film {

    private String name;
    private int year;
    private List<Actor> actors = new ArrayList<>();
    private List<Genre> genres = new ArrayList<>();

    public Film(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void addActor(Actor... actor) {
        for (int i = 0; i < actor.length; i++) {
            this.actors.add(actor[i]);
        }
    }

    public void addGenres(Genre... genre) {
        for (int i = 0; i < genre.length; i++) {
            this.genres.add(genre[i]);
        }
    }

    public String getName() {
        return name;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public int getYear() {
        return year;
    }
}
