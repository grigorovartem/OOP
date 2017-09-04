package Lecture2.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Books {

    private List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    public List<Book> findAuthor(String author) {
        return books
                .stream()
                .filter(
                        (p) -> p.getAuthor().equals(author)
                )
                .collect(Collectors.toList());
    }

    public List<Book> findPublshing(String publishing) {
        return books
                .stream()
                .filter(
                        (p) -> p.getPublishing().equals(publishing)
                )
                .collect(Collectors.toList());
    }

    public List<Book> findYear(int year) {
        return books
                .stream()
                .filter(
                        (p) -> p.getYear() > year
                )
                .collect(Collectors.toList());
    }

    public void printName(List<Book> books) {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getName());
        }
    }
}
