package Lecture6.Task1Enum;

import java.util.Arrays;
import java.util.List;

public class FilmRunner {

    public static void main(String[] args) {

        Films films = new Films();
        List<Genre> filterGenres = Arrays.asList(Genre.HORROR, Genre.THRILLER);

        Film doctorStrange = new Film("Doctor Strange", 2016);
        doctorStrange.addActor(new Actor("Benedict Cumberbatch"),
                new Actor("Tilda Swinton"),
                new Actor("Mads Mikkelsen"));
        doctorStrange.addGenres(Genre.ADVENTURE, Genre.FICTION);

        Film transporteur = new Film("Le Transporteur", 2002);
        transporteur.addActor(new Actor("Jason Statham"),
                new Actor("Lín Lìhuì"),
                new Actor("Matthew Schulz"));
        transporteur.addGenres(Genre.THRILLER);

        Film constantine = new Film("Constantine", 2005);
        constantine.addActor(new Actor("Keanu Reeves"),
                new Actor("Rachel Weisz"),
                new Actor("Shia LaBeouf"));
        constantine.addGenres(Genre.DRAMA, Genre.THRILLER, Genre.HORROR);

        Film train = new Film("The Midnight Meat Train", 2008);
        train.addActor(new Actor("Bradley Cooper"),
                new Actor("Leslie Bibb"),
                new Actor("Brooke Shields"));
        train.addGenres(Genre.HORROR);

        films.add(doctorStrange);
        films.add(transporteur);
        films.add(constantine);
        films.add(train);

        films.printFilms(films.filterByGenre(filterGenres));
        films.printFilms(films.filterByYear(2000, 2005));


    }
}
