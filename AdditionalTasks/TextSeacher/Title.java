package AdditionalTasks.TextSeacher;

public class Title implements CriteriasVerification {

    private String titleText;

    public Title(String title) {
        this.titleText = title;
    }

    @Override
    public String getBody() {
        return titleText;
    }

    @Override
    public boolean verificate(String keyword) {
        boolean contains = false;
        String[] words = titleText.split(" ");
        for (String word : words) {
            if (word.toLowerCase().contains(keyword)) {
                contains = true;
                break;
            }
        }
        return contains;
    }
}
