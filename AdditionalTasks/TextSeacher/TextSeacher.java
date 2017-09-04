package AdditionalTasks.TextSeacher;

import java.util.ArrayList;
import java.util.List;

public class TextSeacher {

    private List<TextItem> items = new ArrayList<>();

    public TextSeacher add(TextItem item) {
        items.add(item);
        return this;
    }

    public List<CriteriasVerification> getTitle() {
        List<CriteriasVerification> titles = new ArrayList<>();
        for (TextItem item : items) {
            titles.add(item.getTitle());
        }
        return titles;
    }

    public List<CriteriasVerification> getText() {
        List<CriteriasVerification> texts = new ArrayList<>();
        for (TextItem item : items) {
            texts.add(item.getText());
        }
        return texts;
    }

    public int searchIn(String keyword, List<CriteriasVerification> criterias) {
        int count = 0;
        for (CriteriasVerification criteria : criterias) {
            if (criteria.verificate(keyword)) {
                count++;
            }
        }
        return count;
    }

    public int searchAnd(String searchWord, List<CriteriasVerification>... verifications) {
        int count = 0;
        for (int j = 0; j < verifications[0].size(); j++) {
            int tempCount = 0;
            for (int i = 0; i < verifications.length; i++) {
                if (!verifications[i].get(j).verificate(searchWord)) {
                    break;
                } else {
                    tempCount++;
                }
                if (tempCount == verifications.length) {
                    count++;
                }
            }
        }
        return count;
    }

    public int searchOr(String searchWord, List<CriteriasVerification>... verifications) {
        int count = 0;
        for (int j = 0; j < verifications[0].size(); j++) {
            for (int i = 0; i < verifications.length; i++) {
                if (verifications[i].get(j).verificate(searchWord)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
