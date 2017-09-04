package AdditionalTasks.TextSeacherV2;

public class TxtSearcher {

    public static Predicate<String> inTitle(String keyword) {
        return new Predicate<String>() {
            @Override
            public boolean verify(TextItem item) {
                boolean contains = false;
                String[] words = item.getTitle().split(" ");
                for (String word : words) {
                    if (word.toLowerCase().contains(keyword)) {
                        contains = true;
                        break;
                    }
                }
                return contains;
            }
        };
    }

    public static Predicate<String> inBody(String keyword) {
        return new Predicate<String>() {
            @Override
            public boolean verify(TextItem item) {
                boolean contains = false;
                String[] words = item.getText().split(" ");
                for (String word : words) {
                    if (word.toLowerCase().contains(keyword)) {
                        contains = true;
                        break;
                    }
                }
                return contains;
            }
        };
    }
}
