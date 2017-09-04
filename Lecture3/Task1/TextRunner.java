package Lecture3.Task1;

public class TextRunner {
    public static void main(String[] args) {

        Text text = new Text("body", "HEADER");

        text.getSentence().setSentenceText("Sentence");

        text.complete(text.getWord());
        text.complete(text.getSentence());
        text.print();
        text.printHeader();
    }
}
