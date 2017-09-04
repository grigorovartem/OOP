package Kursovoj;

import Kursovoj.Properties.Filterable;

import java.util.*;

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

    public Map<SparePart, Filterable> getPrices() {
        Map<SparePart, Filterable> prices = new HashMap<>();
        for (Map.Entry<SparePart, Integer> entry : products.entrySet()) {
            prices.put(entry.getKey(), entry.getKey().getPrice());
        }
        return prices;
    }

    public Map<SparePart, Filterable> getNames() {
        Map<SparePart, Filterable> names = new HashMap<>();
        for (Map.Entry<SparePart, Integer> entry : products.entrySet()) {
            names.put(entry.getKey(), entry.getKey().getName());
        }
        return names;
    }

    public <T> Map<SparePart, Integer> filter(Map<SparePart, Filterable> properties, T param1, T param2) {
        Map<SparePart, Integer> filtered = new TreeMap<>(StorageComparators.byName());
        for (Map.Entry<SparePart, Filterable> entry : properties.entrySet()) {
            if (entry.getValue().satisfies(param1, param2)) {
                filtered.put(entry.getKey(), products.get(entry.getKey()));
            }
        }
        return filtered;
    }

    public <T> Map<SparePart, Integer> search(Map<SparePart, Filterable> properties, T param) {
        Map<SparePart, Integer> filtered = new TreeMap<>(StorageComparators.byName());
        for (Map.Entry<SparePart, Filterable> entry : properties.entrySet()) {
            if (entry.getValue().contains(param)) {
                filtered.put(entry.getKey(), products.get(entry.getKey()));
            }
        }
        return filtered;
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
