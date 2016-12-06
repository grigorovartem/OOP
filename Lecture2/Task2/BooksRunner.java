package Lecture2.Task2;

public class BooksRunner {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setAuthor("Adams");
        book1.setName("The Hitchhiker's Guide to the Galaxy");
        book1.setPublishing("ACT");
        book1.setYear(1979);

        Book book2 = new Book();
        book2.setAuthor("Guin");
        book2.setName("Rocannon's World");
        book2.setPublishing("Eksmo");
        book2.setYear(1966);

        Book book3 = new Book();
        book3.setAuthor("Guin");
        book3.setName("Semley’s Necklace");
        book3.setPublishing("ACT");
        book3.setYear(2001);

        Books books = new Books();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        books.printName(books.findAuthor("Guin"));
        books.printName(books.findPublshing("Eksmo"));
        books.printName(books.findYear(1970));
    }
}
