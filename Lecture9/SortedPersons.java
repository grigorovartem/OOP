package Lecture9;

import java.util.*;

public class SortedPersons {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 26));
        persons.add(new Person("Bob", 13));
        persons.add(new Person("Jack", 15));
        persons.add(new Person("William", 18));
        persons.add(new Person("Jack",17));
        persons.add(new Person("Arnold", 23));

        Set<Person> personSet = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        personSet.addAll(persons);
        System.out.println(personSet);

        AgeCategories ageCategories = new AgeCategories(persons);
        System.out.println(ageCategories.getTeenagers());
        System.out.println(ageCategories.youngestAfterEighteen());
        System.out.println(ageCategories.oldestBeforeEighteen());
    }
}
