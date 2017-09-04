package AdditionalTasks.TextSeacherV2;

import static AdditionalTasks.TextSeacherV2.MultiSeacher.*;
import static AdditionalTasks.TextSeacherV2.TxtSearcher.*;

public class SearchRunner {
    public static void main(String[] args) {

        TextSeacher textSeacher = new TextSeacher();
        String bookText = "В языках программирования и теории типов полиморфизмом называется способность " +
                "функции обрабатывать данные разных типов[1][2][3].\n";
        String articleText = "Существует несколько разновидностей полиморфизма. Две наиболее различных из них были описаны " +
                "Кристофером Стрэчи[en] в 1967 году: это ad hoc полиморфизм и параметрический полиморфизм.\n";
        String wikiText = "Параметрический полиморфизм подразумевает исполнение одного и того же кода для всех допустимых " +
                "типов аргументов, тогда как ad hoc полиморфизм подразумевает исполнение потенциально разного кода " +
                "для каждого типа или подтипа аргумента.";
        String bookTitle = "Полиморфизм (информатика)";
        String articleTitle = "Полиморфизм";
        String wikiTitle = "(информатика)";

        textSeacher.add(new BookDescrption(bookText, bookTitle));
        textSeacher.add(new Article(articleTitle, articleText));
        textSeacher.add(new WikiArticle(wikiTitle, wikiText));

        System.out.println("Ключевое слово встречается в Title у " +
                textSeacher.search(inTitle("полиморфизм")) + " объектов");
        System.out.println("Ключевое слово встречается в Text у " +
                textSeacher.search(inBody("полиморфизм")) + " объектов");
        System.out.println("Ключевое слово встречается в Title и Text у " +
                textSeacher.search(andSearching(inTitle("полиморфизм"),
                        inBody("полиморфизм"))) + " объектов");
        System.out.println("Ключевое слово встречается в Title или Text у " +
                textSeacher.search(orSearching(inTitle("полиморфизм"), inBody("полиморфизм"))) + " объектов");
    }
}
