package AdditionalTasks.TextSeacher;

import java.util.ArrayList;
import java.util.List;

public class Article extends TextItem {

    private List<String> authors = new ArrayList<>();
    private String journalName;
    private int year;
    private int N;

    public Article(Title title, MainText text) {
        super(title, text);
    }
}
