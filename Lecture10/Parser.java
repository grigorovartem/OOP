package Lecture10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parser {

    public static Film parseFilm(String s) {
        String[] token = s.split(";");
        String name = token[0].trim();
        int year = Integer.parseInt(token[1].trim());
        List<String> actors = parseActors(token[2]);
        List<Genre> genres = parseGenre(token[3]);
        return new Film(name, year, actors, genres);
    }

    private static List<String> parseActors(String s) {
        String[] token = s.split(",");
        List<String> actors = Arrays.asList(token);
        return actors;
    }

    private static List<Genre> parseGenre(String s) {
        List<Genre> genres = new ArrayList<>();
        String[] token = s.split(",");
        for (String genre : token) {
            String line = genre.trim();
            if (Genre.isGenre(line)) {
                genres.add(Genre.valueOf(line));
            }
        }
        return genres;
    }
}
