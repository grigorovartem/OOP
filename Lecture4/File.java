package Lecture4;

public class File implements FsObject {

    private int size;

    public File() {
    }

    public File(int size) {
        this.size = size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}
