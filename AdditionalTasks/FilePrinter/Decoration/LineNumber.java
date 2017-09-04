package AdditionalTasks.FilePrinter.Decoration;

import AdditionalTasks.FilePrinter.FilePrinter;
import AdditionalTasks.FilePrinter.Format;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LineNumber extends Decorator{

    private int number;

    public LineNumber(Decoration decoration) {
        super(decoration);
        this.number = 0;
    }

    @Override
    public <T> void print(T product, String fileName, Format format) throws IOException {
        //try (PrintWriter writer = new PrintWriter(new FileWriter(new File(FilePrinter.FILE_PREFIX + fileName)))) {
            String temp = ++number + "." + product.toString();
            super.print(temp, fileName, format);
        //}
    }
}
