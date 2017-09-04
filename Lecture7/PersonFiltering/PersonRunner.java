package Lecture7.PersonFiltering;

import java.util.Arrays;

public class PersonRunner {
    public static void main(String[] args) {

        PersonSorter persons = new PersonSorter(Arrays.asList(new Person("John", 25),
                new Person("Jack", 16),
                new Person("Bob", 16),
                new Person("William", 13)));
        PersonSorter teenagers = persons.getTeenagers();
        System.out.println(teenagers.sortPersons().toString());
    }
}
