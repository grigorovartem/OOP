package Lecture7.PersonFiltering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonSorter {

    private List<Person> persons;

    public PersonSorter(List<Person> persons) {
        this.persons = persons;
    }

    public PersonSorter add(Person person){
        this.persons.add(person);
        return this;
    }

    public PersonSorter getTeenagers() {
        List<Person> teenagers = new ArrayList<>();
        for (Person person : this.persons) {
            if (person.getAge() >= 12 && person.getAge() <= 17) {
                teenagers.add(person);
            }
        }
        return new PersonSorter(teenagers);
    }

    public PersonSorter sortPersons() {
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                if (person1.getAge() == person2.getAge()) {
                    return person1.getName().compareTo(person2.getName());
                }
                return person1.getAge() - person2.getAge();
            }
        });
        return this;
    }

    @Override
    public String toString() {
        String result = "";
        for(Person person : persons){
            result += "\n" + person.toString();
        }
        return result;
    }
}
