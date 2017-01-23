package CourseProject.Runners;

import CourseProject.PartsIO.PartsIOUtils;
import CourseProject.Service.ProductStorage;
import Kursovoj.Utils;

public class IORunner {

    public static final String INPUT_FILE = "input.txt";
    public static final String OUTPUT_FILE = "";

    public static void main(String[] args) {

        //PartsIOUtils.writeToFile(OUTPUT_FILE, ProductStorage.getInctance().getProducts());
        Utils.print(PartsIOUtils.readFromFile(INPUT_FILE));
    }
}
