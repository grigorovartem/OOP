package Lecture2.Task2;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<Book> books = new ArrayList<>();

    public void add(Book book){
        books.add(book);
    }

    public List<Book> findAuthor(String author){
        List<Book> authorSort = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if(author.equals(books.get(i).getAuthor())){
                authorSort.add(books.get(i));
            }
        }
        return authorSort;
    }

    public List<Book> findPublshing(String publishing){
        List<Book> publishingSort = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if(publishing.equals(books.get(i).getPublishing())){
                publishingSort.add(books.get(i));
            }
        }
        return publishingSort;
    }

    public List<Book> findYear(int year){
        List<Book> yearSort = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if(year<(books.get(i).getYear())){
                yearSort.add(books.get(i));
            }
        }
        return yearSort;
    }

    public void printName(List<Book> books) {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getName());
        }
    }
}
