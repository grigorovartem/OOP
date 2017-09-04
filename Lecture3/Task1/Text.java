package Lecture3.Task1;

public class Text {

    private Word word;
    private Sentence sentence;
    private String textBody;
    private String header;

    public Text(String textBody, String header) {
        this.textBody = textBody;
        this.header = header;
        this.word = new Word("    Word   ");
        this.sentence = new Sentence();
    }

    public void printHeader() {
        System.out.println(header);
    }

    public void print() {
        System.out.println(header);
        System.out.println(textBody);
    }

    public void complete(Sentence sentence ) {
        textBody+=sentence.getSentenceText();
    }

    public void complete(Word word) {
        textBody+=word.getWordString();
    }

    public Word getWord() {
        return word;
    }

    public Sentence getSentence() {
        return sentence;
    }

    public String getTextBody() {
        return textBody;
    }

    public void setTextBody(String textBody) {
        this.textBody = textBody;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }
}
