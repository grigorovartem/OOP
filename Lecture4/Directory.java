package Lecture4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Directory implements FsObject {

    private List<FsObject> objects = new ArrayList<>();

    public Directory() {
    }

    public Directory(FsObject... object) {
        this.objects = Arrays.asList(object);
    }

    public Directory add(FsObject object) {
        if(object == this){
            System.out.println("Error! Can't add this Directory");
        }else {
        objects.add(object);}
        return this;
    }

    @Override
    public int getSize() {
        int sumSize = 0;
        for (int i = 0; i < objects.size(); i++) {
            sumSize += objects.get(i).getSize();
        }
        return sumSize;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "objects=" + objects +
                '}';
    }
}

