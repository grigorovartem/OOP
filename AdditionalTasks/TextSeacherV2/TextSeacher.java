package AdditionalTasks.TextSeacherV2;

import java.util.ArrayList;
import java.util.List;

public class TextSeacher {

    private List<TextItem> items = new ArrayList<>();

    public TextSeacher add(TextItem item) {
        items.add(item);
        return this;
    }

    public int search(Predicate criteria) {
        int count = 0;
        for (TextItem item : items) {
            if (criteria.verify(item)) {
                count++;
            }
        }
        return count;
    }
}
