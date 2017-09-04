package AdditionalTasks.FilePrinter.Decoration;

import AdditionalTasks.FilePrinter.FilePrinter;
import AdditionalTasks.FilePrinter.Format;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Footer extends Decorator {

    private String footer;

    public Footer(Decoration decoration, String footer) {
        super(decoration);
        this.footer = footer;
    }

    @Override
    public <T> void print(T product, String fileName, Format format) throws IOException {
        //try (PrintWriter writer = new PrintWriter(new FileWriter(new File(FilePrinter.FILE_PREFIX + fileName)))) {
            String temp = product.toString() + "\n\n" + footer;
            super.print(temp, fileName, format);
       // }
    }
}
