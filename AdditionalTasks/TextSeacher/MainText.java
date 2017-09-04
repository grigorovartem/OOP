package AdditionalTasks.TextSeacher;

public class MainText implements CriteriasVerification {

    private String textBody;

    public MainText(String textBody) {
        this.textBody = textBody;
    }

    @Override
    public String getBody() {
       return textBody;
    }

    @Override
    public boolean verificate(String keyword) {
        boolean contains = false;
        String[] words = textBody.split(" ");
        for (String word : words) {
            if (word.toLowerCase().contains(keyword)) {
                contains = true;
                break;
            }
        }
        return contains;
    }
}
