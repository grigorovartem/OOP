package Lecture11;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;

public class FactorialUtils {

    private static String nameBuilder(String filename){
        return ("src/Lecture11/factorial" + filename + ".txt");
    }

    public static void printToFile(BigInteger factorial, String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nameBuilder(fileName)))) {
            writer.println(factorial);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
