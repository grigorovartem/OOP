package Lecture1;

import Lecture1.Dog;

public class DogRunner {

    public static void main(String[] args) {
        Dog dog = new Dog("John", "Bob");
        Owner owner = new Owner(dog);
        owner.giveCommand(4);
    }
}
