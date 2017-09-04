package Kursovoj.Properties;

public class Name implements Filterable {

    private String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    public boolean satisfies(Object topBound, Object bottomBound) {
        boolean satisfies = false;
        if (name.compareTo((String) topBound) > 0 && name.compareTo((String) bottomBound) < 0) {
            satisfies = true;
        }
        return satisfies;
    }

    @Override
    public boolean contains(Object parameter) {
        boolean contains = false;
        String searched = (String) parameter;
        if (name.toLowerCase().startsWith(searched.toLowerCase())) {
            contains = true;
        }
        return contains;
    }

    @Override
    public Object get() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        return name.compareTo(((Name) o).name);
    }

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                '}';
    }
}
