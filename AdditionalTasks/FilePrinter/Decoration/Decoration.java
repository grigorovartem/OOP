package AdditionalTasks.FilePrinter.Decoration;

import AdditionalTasks.FilePrinter.Format;

import java.io.IOException;

public interface Decoration {

    <T> void print(T product, String fileName, Format format) throws IOException;
}
