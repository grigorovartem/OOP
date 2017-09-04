package AdditionalTasks.FilePrinter.Entities;

import java.math.BigDecimal;

public class Product {

    private String name;
    private String description;
    private BigDecimal price;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = BigDecimal.valueOf(price);
    }

    @Override
    public String toString() {
        return (name + " " + description + " " + price);
    }
}
