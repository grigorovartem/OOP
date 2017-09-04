package Lecture7.Range;

public class Range<T extends Number & Comparable<T>> {

    private final T lowerBound;
    private final T upperBound;

    public Range(T lowerBound, T upperBound) {
        if(lowerBound.compareTo(upperBound) > 0){
            throw new IllegalArgumentException();
        }
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public T getLowerBound() {
        return lowerBound;
    }

    public T getUpperBound() {
        return upperBound;
    }

    @Override
    public String toString() {
        return "Range{" +
                "lowerBound=" + lowerBound +
                ", upperBound=" + upperBound +
                '}';
    }
}
