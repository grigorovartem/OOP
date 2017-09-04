package AdditionalTasks.FilePrinter.Entities;

public enum Delimiter {

    COMMA(","),
    SEMICOLON(";"),
    TAB("\t");

    private String name;

    Delimiter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
