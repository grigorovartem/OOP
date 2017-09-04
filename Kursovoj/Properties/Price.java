package Kursovoj.Properties;

import java.math.BigDecimal;

public class Price<T> implements Filterable {

    private BigDecimal price;

    public Price(double price) {
        this.price = new BigDecimal(price);
    }

    @Override
    public boolean satisfies(Object topBound, Object bottomBound) {
        BigDecimal top = new BigDecimal((double) topBound);
        BigDecimal bottom = new BigDecimal((double) bottomBound);
        boolean satisfies = false;
        if (price.compareTo(top) > 0 && price.compareTo(bottom) < 0) {
            satisfies = true;
        }
        return satisfies;
    }

    @Override
    public boolean contains(Object parameter) {
        return price.equals(new BigDecimal((double) parameter));
    }

    @Override
    public BigDecimal get() {
        return price;
    }

    @Override
    public int compareTo(Object o) {
        return price.compareTo(((Price) o).price);
    }

    @Override
    public String toString() {
        return "Price{" +
                "price=" + price +
                '}';
    }
}
