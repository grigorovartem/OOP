package Lecture9;

import java.util.*;
import java.util.stream.Collectors;

public class AgeCategories {

    private Map<Person, Integer> personMap = new TreeMap<>(new PersonComparator<>());

    private class PersonComparator<T extends Person> implements Comparator<T> {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getAge() - o2.getAge();
        }
    }

    public AgeCategories() {
    }

    public AgeCategories(List<Person> persons) {
        for (Person person : persons) {
            this.personMap.put(person, person.getAge());
        }
    }

    public List<Person> getTeenagers() {
        return personMap.keySet().stream().filter((p) -> p.getAge() >= 12 &&
                p.getAge() <= 18).collect(Collectors.toList());
    }

    public List<Person> youngestAfterEighteen() {
        return personMap.keySet().stream().filter((p) -> p.getAge() > 18).limit(1).collect(Collectors.toList());
    }

    public List<Person> oldestBeforeEighteen() {
        return personMap.keySet().stream().sorted(Collections.reverseOrder(new PersonComparator<>()))
                .filter((p) -> p.getAge() < 18).limit(1).collect(Collectors.toList());
    }
}
