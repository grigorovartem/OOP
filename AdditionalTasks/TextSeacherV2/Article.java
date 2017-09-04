package AdditionalTasks.TextSeacherV2;

import java.util.ArrayList;
import java.util.List;

public class Article extends TextItem {

    private List<String> authors = new ArrayList<>();
    private String journalName;
    private int year;
    private int N;

    public Article(String title, String text) {
        super(title, text);
    }
}
