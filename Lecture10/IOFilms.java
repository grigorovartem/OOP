package Lecture10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFilms {

    private List<Film> films = new ArrayList<>();

    public IOFilms add(Film film) {
        films.add(film);
        return this;
    }

    public IOFilms readFilmFromFile(String fileName) throws IOException{
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            readFilm(reader);
        }
        return this;
    }

    private void readFilm(BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            films.add(Parser.parseFilm(line));
        }
    }

    public void writeFilmToFile(String fileName) throws IOException{
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Film film : films) {
                writer.println(film);
            }
        }
    }

    public IOFilms readFromBinFile(String fileName) throws IOException{
        try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream(fileName))) {
            films = (List<Film>) reader.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return this;
    }

    public void writeToBinFile(String fileName) throws IOException {
        try (ObjectOutputStream writer = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {
            writer.writeObject(films);
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (Film film : films) {
            s += film.toString() + "\n";
        }
        return s;
    }
}
