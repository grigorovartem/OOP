package Lecture2.Task3;

public class Puppy extends Dog {
    public static void main(String[] args) {

        Puppy puppy = new Puppy();
        puppy.setName("Rex");
        puppy.printName();
        puppy.voice();
        puppy.run();
        puppy.jump();
        puppy.bite();
    }
}
