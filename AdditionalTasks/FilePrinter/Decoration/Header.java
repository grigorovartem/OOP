package AdditionalTasks.FilePrinter.Decoration;

import AdditionalTasks.FilePrinter.FilePrinter;
import AdditionalTasks.FilePrinter.Format;

import java.io.*;

public class Header extends Decorator {

    private String header;

    public Header(Decoration decoration, String header) {
        super(decoration);
        this.header = header;
    }

    @Override
    public <T> void print(T product, String fileName, Format format) throws IOException {
        //String tmp = super.read(fileName);
       // try (PrintWriter writer = new PrintWriter(new FileWriter(new File(FilePrinter.FILE_PREFIX + fileName)))) {
            String temp = header + "\n\n" + product.toString();
            super.print(temp, fileName, format);
        //}
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }
}
