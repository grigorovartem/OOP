package Lecture7.PersonFiltering;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (age < 0){throw  new IllegalArgumentException();}
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
