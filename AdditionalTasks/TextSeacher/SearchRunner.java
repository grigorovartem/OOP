package AdditionalTasks.TextSeacher;

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

        textSeacher.add(new BookDescrption(new Title(bookText), new MainText(bookTitle)));
        textSeacher.add(new Article(new Title(articleTitle), new MainText(articleText)));
        textSeacher.add(new WikiArticle(new Title(wikiTitle), new MainText(wikiText)));

        System.out.println("Ключевое слово встречается в Title у " +
                textSeacher.searchIn("полиморфизм", textSeacher.getTitle()) + " объектов");
        System.out.println("Ключевое слово встречается в Text у " +
                textSeacher.searchIn("полиморфизм", textSeacher.getText()) + " объектов");
        System.out.println("Ключевое слово встречается в Title и Text у " +
                textSeacher.searchAnd("полиморфизм", textSeacher.getTitle(), textSeacher.getText()) + " объектов");
        System.out.println("Ключевое слово встречается в Title или Text у " +
                textSeacher.searchOr("полиморфизм", textSeacher.getTitle(), textSeacher.getText()) + " объектов");
    }
}
