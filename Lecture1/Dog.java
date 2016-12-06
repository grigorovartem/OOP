package Lecture1;

public class Dog {

    private String name;
    private String ownerName;

    public Dog(String name, String ownerName) {
        this.name = name;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void barck(){
        System.out.println("GAV!");
    }
}
