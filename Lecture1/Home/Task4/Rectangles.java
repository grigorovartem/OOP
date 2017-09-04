package Lecture1.Home.Task4;

import java.util.ArrayList;
import java.util.List;

public class Rectangles {

    private List<Rectangle> rectangles = new ArrayList<>();

    public void add(Rectangle rectangle){
        rectangles.add(rectangle);
    }

    public double sumSquare(){
        double sum = 0;
        for (int i = 0; i < rectangles.size(); i++) {
            sum+=rectangles.get(i).square();
        }
        return sum;
    }
}
