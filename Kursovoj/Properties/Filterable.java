package Kursovoj.Properties;

public interface Filterable<T> extends Comparable {

    boolean satisfies(T topBound, T bottomBound);
    boolean contains(T parameter);
    T get();
}
