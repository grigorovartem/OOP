package Lecture7.NamesComparing;

import java.util.*;
import java.util.stream.Collectors;

public class Names {

    private List<String> names = new ArrayList<>();

    public Names(String... names) {
        for (int i = 0; i < names.length; i++) {
            this.names.add(names[i]);
        }
    }

    public Names sortByAlphabet() {
        names.stream().sorted().collect(Collectors.toList());
        return this;
    }

    public Names reverseSort() {
        names.stream().sorted((o1, o2) -> -o1.compareTo(o2)).collect(Collectors.toList());
        return this;
    }

    public String min() {
        return names.stream().min(String::compareTo).get();
    }

    public Names sort(Comparator comparator) {
        Collections.sort(names, comparator);
        return this;
    }

    public Names countAndAlphabetSort() {
        names.stream().sorted((o1, o2) ->
                o1.toCharArray().length != o2.toCharArray().length ?
                        (o1.toCharArray().length).compareTo(o2.toCharArray().length) :
                        o1.compareTo(o2)).collect(Collectors.toList());
        return this;
    }

    public Names letterCountSort(){
        names.stream().mapToInt((p) -> p.toCharArray().length).sorted((o1, o2) -> o1.compareTo(o2));
        return this;
    }

//    private int getLength(String name){
//        return name.toCharArray().length;
//    }

    public Comparator<String> countAndAlphabetComparator =
            new Comparator<String>() {
                @Override
                public int compare(String name1, String name2) {
                    int nameLength1 = name1.toCharArray().length;
                    int nameLenght2 = name2.toCharArray().length;
                    if ((nameLength1 - nameLenght2 == 0)) {
                        return name1.compareTo(name2);
                    }
                    return nameLength1 - nameLenght2;
                }
            };

    public Comparator<String> letterCountComparator =
            new Comparator<String>() {
                @Override
                public int compare(String name1, String name2) {
                    int nameLength1 = name1.toCharArray().length;
                    int nameLength2 = name2.toCharArray().length;
                    return nameLength1 - nameLength2;
                }
            };

    public void print() {
        for (String name : this.names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}
