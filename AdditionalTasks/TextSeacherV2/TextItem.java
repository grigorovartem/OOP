package AdditionalTasks.TextSeacherV2;

public abstract class TextItem {

    private String title;
    private String text;

    public TextItem(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getTitle() {
        return title;
    }

}
