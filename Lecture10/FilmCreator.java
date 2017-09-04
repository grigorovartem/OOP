package Lecture10;

public class FilmCreator {

    public IOFilms create() {

        IOFilms films = new IOFilms();

        Film doctorStrange = new Film("Doctor Strange", 2016);
        doctorStrange.addActor("Benedict Cumberbatch")
                .addActor("Tilda Swinton")
                .addActor("Mads Mikkelsen");
        doctorStrange.addGenre(Genre.ADVENTURE, Genre.FICTION);

        Film transporteur = new Film("Le Transporteur", 2002);
        transporteur.addActor("Jason Statham")
                .addActor("Lín Lìhuì")
                .addActor("Matthew Schulz");
        transporteur.addGenre(Genre.THRILLER);

        Film constantine = new Film("Constantine", 2005);
        constantine.addActor("Keanu Reeves")
                .addActor("Rachel Weisz")
                .addActor("Shia LaBeouf");
        constantine.addGenre(Genre.DRAMA, Genre.THRILLER, Genre.HORROR);

        Film train = new Film("The Midnight Meat Train", 2008);
        train.addActor("Bradley Cooper")
                .addActor("Leslie Bibb")
                .addActor("Brooke Shields");
        train.addGenre(Genre.HORROR);

        films.add(doctorStrange)
                .add(transporteur)
                .add(constantine)
                .add(train);

        return films;
    }
}
