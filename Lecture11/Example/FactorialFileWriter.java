package Lecture11.Example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.math.BigInteger;
import java.nio.charset.Charset;

/**
 * Created by Артем on 25.01.17.
 */
public class FactorialFileWriter {
    private final int name;

    public FactorialFileWriter(int name) {
        this.name = name;
    }

    public void writeToFile(BigInteger factorial) {

        Writer out = null;
        try {
            out = new OutputStreamWriter(
                    new FileOutputStream("src/Lecture11/Example" + name + ".txt"), Charset.defaultCharset());
            out.write(String.valueOf(factorial));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
