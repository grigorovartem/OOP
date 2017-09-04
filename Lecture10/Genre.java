package Lecture10;

public enum Genre {
    HORROR,
    THRILLER,
    DOCUMENTARY,
    COMEDY,
    DRAMA,
    ADVENTURE,
    FICTION;

    public static boolean isGenre(String s){
        for (Genre genre : Genre.values()) {
            if (genre.name().equals(s)){
                return true;
            }
        }
        return false;
    }
}
