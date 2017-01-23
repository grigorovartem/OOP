package CourseProject.Filtration;

import CourseProject.Entity.SparePart;

import java.math.BigDecimal;

public class PartVerificator<T> {

    public static Filterable<SparePart> nameContains(String keyWord){
        return new Filterable<SparePart>() {
            @Override
            public boolean verify(SparePart product) {
                return product.getName().toLowerCase().contains(keyWord.toLowerCase());
            }
        };
    }

    public static Filterable<SparePart> priceBetween(double priceFrom, double priceTo){
        BigDecimal from = new BigDecimal(priceFrom);
        BigDecimal to = new BigDecimal(priceTo);
        return new Filterable<SparePart>() {
            @Override
            public boolean verify(SparePart product) {
                return (product.getPrice().compareTo(from) >= 0 && product.getPrice().compareTo(to) <= 0);
            }
        };
    }

    public static Filterable<SparePart> nameStartsWith(String charSequence){
        return new Filterable<SparePart>() {
            @Override
            public boolean verify(SparePart product) {
                return product.getName().toLowerCase().startsWith(charSequence.toLowerCase());
            }
        };
    }
}
