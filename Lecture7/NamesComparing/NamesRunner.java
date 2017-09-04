package Lecture7.NamesComparing;

public class NamesRunner {
    public static void main(String[] args) {

        Names names = new Names("Fill", "John", "William", "Jack", "Bob");

        names.sortByAlphabet().print();
        names.reverseSort().print();
        System.out.println(names.min());
        names.sort(names.letterCountComparator).print();
        names.sort(names.countAndAlphabetComparator).print();
    }
}
