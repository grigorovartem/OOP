package AdditionalTasks.FilePrinter.Decoration;

import AdditionalTasks.FilePrinter.FilePrinter;
import AdditionalTasks.FilePrinter.Format;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Prefix extends Decorator{

    private String prefix;

    public Prefix(Decoration decoration, String prefix) {
        super(decoration);
        this.prefix = prefix;
    }

    @Override
    public <T> void print(T product, String fileName, Format format) throws IOException {
        //try (PrintWriter writer = new PrintWriter(new FileWriter(new File(FilePrinter.FILE_PREFIX + fileName)))) {
            String temp = prefix + ":" + product.toString();
            super.print(temp, fileName, format);
        //}
    }
}
