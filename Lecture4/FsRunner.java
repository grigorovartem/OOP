package Lecture4;

public class FsRunner {
    public static void main(String[] args) {

        Directory root = new Directory();

        Directory dir1 = new Directory(new File(10), new File(20));
        Directory dir2 = new Directory(new Directory(
                new File(30)), new File(40));

        root.add(dir1)
                .add(dir2)
                .add(new File(50))
                .add(root);

        System.out.println("Size of directory: " + root.getSize() + "B");
    }
}
