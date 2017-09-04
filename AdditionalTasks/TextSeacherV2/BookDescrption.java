package AdditionalTasks.TextSeacherV2;

import java.util.ArrayList;
import java.util.List;

public class BookDescrption extends TextItem {

    private List<String> authors = new ArrayList<>();
    private String publisher;
    private String annotation;

    public BookDescrption(String title, String text) {
        super(title, text);
    }
}
