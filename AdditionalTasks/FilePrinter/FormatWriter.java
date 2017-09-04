package AdditionalTasks.FilePrinter;

import AdditionalTasks.FilePrinter.Entities.Delimiter;
import com.google.gson.Gson;

import java.io.PrintWriter;

public class FormatWriter {

    public static Format withDelimiter(Delimiter delimiter){
        return new Format() {
            @Override
            public <T> void write(T entity, PrintWriter writer) {
                writer.println(entity.toString().replaceAll(" ", delimiter.getName()));
            }
        };
    }

    public static Format withJson(){
        return new Format() {
            @Override
            public <T> void write(T entity, PrintWriter writer) {
                Gson gson = new Gson();
                writer.println(gson.toJson(entity));
            }
        };
    }
}
