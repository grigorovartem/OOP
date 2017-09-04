package Lecture6.Task1Enum;

import java.util.ArrayList;
import java.util.List;

public class Films {

    private List<Film> films= new ArrayList<>();

    public void add(Film film){
        films.add(film);
    }

    public List<Film> filterByGenre(List<Genre> filterGenres){
        List<Film> filtered = new ArrayList<>();
        for (int i = 0; i < films.size(); i++) {
            if (films.get(i).getGenres().containsAll(filterGenres)){
                filtered.add(films.get(i));
            }
        }
        return filtered;
    }

    public List<Film> filterByYear(int startYear, int endYear){
        List<Film> filtered = new ArrayList<>();
        for (int i = 0; i < films.size(); i++) {
            if (films.get(i).getYear() >= startYear && films.get(i).getYear() <= endYear){
                filtered.add(films.get(i));
            }
        }
        return filtered;
    }

    public void printFilms(List<Film> films){
        for (int i = 0; i < films.size(); i++) {
            System.out.println(films.get(i).getName());
        }
    }
}
