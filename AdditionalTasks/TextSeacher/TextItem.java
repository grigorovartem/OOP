package AdditionalTasks.TextSeacher;

public abstract class TextItem {

    private Title title;
    private MainText text;

    public TextItem(Title title, MainText text) {
        this.title = title;
        this.text = text;
    }

    public MainText getText() {
        return text;
    }

    public Title getTitle() {
        return title;
    }

}
