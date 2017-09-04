package AdditionalTasks.FilePrinter;

import AdditionalTasks.FilePrinter.Decoration.Decoration;

import java.io.*;

public class FilePrinter implements Decoration {

    public static final String FILE_PREFIX = "src/AdditionalTasks/FilePrinter/";

    private PrintStream printStream;

    public FilePrinter(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public <T> void print(T product, String fileName, Format format) throws IOException {
        try (PrintWriter writer = new PrintWriter(this.printStream)) {
            format.write(product, writer);
        }
    }
}
