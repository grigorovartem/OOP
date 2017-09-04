package Lecture10;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Film implements Serializable{

    private String name;
    private int year;
    private List<String> actors;
    private List<Genre> genres;

    public Film(String name, int year) {
        this.name = name;
        this.year = year;
        actors = new ArrayList<>();
        genres = new ArrayList<>();
    }

    public Film(String name, int year, List<String> actors, List<Genre> genres) {
        this.name = name;
        this.year = year;
        this.actors = actors;
        this.genres = genres;
    }

    public Film addActor(String actor){
        actors.add(actor);
        return this;
    }

    public Film addGenre(Genre... genre){
        for (Genre name : genre) {
            genres.add(name);
        }
        return this;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' + "\t" +
                ", year=" + year + "\t" +
                ", actors=" + actors + "\t" +
                ", genres=" + genres +
                '}';
    }
}
