package AdditionalTasks.FilePrinter;

import AdditionalTasks.FilePrinter.Decoration.*;
import AdditionalTasks.FilePrinter.Entities.Delimiter;
import AdditionalTasks.FilePrinter.Entities.Product;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) {

        String header = "HEADER";
        String footer = "FOOTER";
        String prefix = "PREFIX";

//        Decoration printer = new FilePrinter();
//        Decoration printer = new Header(new FilePrinter(), header);
//        Decoration printer = new Footer(new FilePrinter(), footer);
//        Decoration printer = new Prefix(new FilePrinter(), prefix);
//        Decoration printer = new LineNumber(new FilePrinter());
        Decoration printer = new Footer(new Prefix(new LineNumber(new Header(new FilePrinter(System.out), header)), prefix), footer);
//        Decoration printer = new Header(new Footer(new FilePrinter(), footer), header);
        try {
            //printer.print(new Product("jhgf", "hrdhjt", 6.), "Product", FormatWriter.withDelimiter(Delimiter.COMMA));
            //printer.print(new Product("jhgf", "hrdhjt", 6.), "Product", FormatWriter.withJson());
            //printer.print(new Product("jhgf", "hrdhjt", 6.), "Product", FormatWriter.withDelimiter(Delimiter.COMMA));
            printer.print(new Product("jhgf", "hrdhjt", 6.), "Product", FormatWriter.withDelimiter(Delimiter.COMMA));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}
