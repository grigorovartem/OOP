package AdditionalTasks.TextSeacherV2;

public class MultiSeacher {

    public static <T> Predicate<T> andSearching(Predicate<T>... predicates) {
        return new Predicate<T>() {
            @Override
            public boolean verify(TextItem item) {
                for (Predicate<T> predicate : predicates) {
                    if (!predicate.verify(item)) {
                        return false;
                    }
                }
                return true;
            }
        };
    }

    public static <T> Predicate<T> orSearching(Predicate<T>... predicates) {
        return new Predicate<T>() {
            @Override
            public boolean verify(TextItem item) {
                for (Predicate<T> predicate : predicates) {
                    if (predicate.verify(item)) {
                        return true;
                    }
                }
                return true;
            }
        };
    }
}
