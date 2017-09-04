package Lecture10;

import java.io.IOException;

public class FilmIORunner {

    private static final String INPUT_CHAR_FILE = "src/Lecture10/charinput.txt";
    private static final String OUTPUT_CHAR_FILE = "src/Lecture10/charoutput.dat";
    private static final String BIN_FILE = "src/Lecture10/binFile.dat";

    public static void main(String[] args) {

        IOFilms films = new FilmCreator().create();

        try {
            films.writeFilmToFile(OUTPUT_CHAR_FILE);
            films.readFilmFromFile(INPUT_CHAR_FILE);
            films.writeToBinFile(BIN_FILE);
            films.readFromBinFile(BIN_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
