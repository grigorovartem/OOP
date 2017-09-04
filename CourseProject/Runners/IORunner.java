package CourseProject.Runners;

import CourseProject.PartsIO.PartsIOUtils;
import CourseProject.Service.ProductStorage;
import Kursovoj.Utils;

import java.io.IOException;

public class IORunner {

    public static final String INPUT_FILE = "src/CourseProject/input.txt";
    public static final String OUTPUT_FILE = "";

    public static void main(String[] args) {

        try {
            PartsIOUtils.writeToFile(OUTPUT_FILE, ProductStorage.getInctance());
            System.out.println(PartsIOUtils.readFromFile(INPUT_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
