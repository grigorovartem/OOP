package AdditionalTasks.FilePrinter;

import java.io.PrintWriter;

public interface Format {

    <T> void write(T entity, PrintWriter writer);
}
