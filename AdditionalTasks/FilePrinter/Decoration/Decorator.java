package AdditionalTasks.FilePrinter.Decoration;

import AdditionalTasks.FilePrinter.FilePrinter;
import AdditionalTasks.FilePrinter.Format;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class Decorator implements Decoration {

    private Decoration decoration;

    public Decorator(Decoration decoration) {
        this.decoration = decoration;
    }

    public <T> void print(T product, String fileName, Format format) throws IOException {
        decoration.print(product, fileName, format);
    }
}
