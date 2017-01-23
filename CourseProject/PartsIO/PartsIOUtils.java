package CourseProject.PartsIO;

import CourseProject.Entity.Brand;
import CourseProject.Entity.SparePart;

import java.io.*;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Map;

public class PartsIOUtils {

    public static Map<SparePart, Integer> readFromFile(String filename) {
        Map<SparePart, Integer> storage = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            while (reader.readLine() != null) {
                SparePart part = parsePart(reader.readLine());
                Integer count = parseCount(reader.readLine());
                storage.put(part, count);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return storage;
    }

    public static void writeToFile(String filename, Map<SparePart, Integer> storage) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println(storage.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SparePart parsePart(String line) {
        SparePart sparePart = null;
        String[] expression = line.split(",");
        try {
            String name = expression[0].trim();
            Brand brand = parseBrand(expression[1]);
            double price = Double.parseDouble(expression[2]);
            sparePart = new SparePart(name, brand, price);
        } catch (IllegalFormatException e) {
            e.printStackTrace();
        }
       return sparePart;
}

    public static Integer parseCount(String line) {
        String[] expression = line.split(",");
        return Integer.parseInt(expression[3]);
    }

    public static Brand parseBrand(String brand) {
        brand.trim();
        if (!Brand.isBrand(brand)) {
            throw new IllegalArgumentException("It's not a Brand");
        }
        return Brand.valueOf(brand);
    }
}
