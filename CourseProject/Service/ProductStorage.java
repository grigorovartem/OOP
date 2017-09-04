package CourseProject.Service;

import CourseProject.Entity.SparePart;
import CourseProject.Filtration.Filterable;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ProductStorage {

    private static ProductStorage productStorage;
    private Map<SparePart, Integer> products = new HashMap<>();

    public static ProductStorage getInctance() {
        if (productStorage == null) {
            productStorage = new ProductStorage();
        }
        return productStorage;
    }

    public ProductStorage add(SparePart part, int count) {
        products.put(part, products.get(part) == null ? count : products.get(part) + count);
        return this;
    }

    public int getCountByID(long id) {
        int productQuantity = 0;
        for (Map.Entry<SparePart, Integer> entry : products.entrySet()) {
            if (entry.getKey().getId() == id) {
                productQuantity = entry.getValue();
            }
        }
        return productQuantity;
    }

    public ProductStorage sort(Comparator comparator) {
        Map<SparePart, Integer> sorted = new TreeMap<>(comparator);
        sorted.putAll(products);
        products = sorted;
        return this;
    }

    public ProductStorage filter(Filterable<SparePart> condition) {
        Map<SparePart, Integer> filtered = new HashMap<>();
        for (Map.Entry<SparePart, Integer> entry : products.entrySet()){
            if (condition.verify(entry.getKey())){
                filtered.put(entry.getKey(), entry.getValue());
            }
        }
        ProductStorage filteredStorage = this;
        filteredStorage.products.putAll(filtered);
        return filteredStorage;
    }

    @Override
    public String toString() {
        String description = "";
        for (Map.Entry<SparePart, Integer> entry : products.entrySet()) {
            SparePart part = entry.getKey();
            int count = entry.getValue();
            description += part.getName() + ", " + part.getPrice() + ", " + part.getBrand() + ", " + count + "\n";
        }
        return description;
    }

}
