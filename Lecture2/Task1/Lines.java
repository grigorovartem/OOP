package Lecture2.Task1;

import java.util.ArrayList;
import java.util.List;

public class Lines {

    private List<Line> lines = new ArrayList<>();

    public void addLine(Line line){
        lines.add(line);
    }

    public double sumLength(){
        double sum = 0;
        for (int i = 0; i < lines.size(); i++) {
            sum+=lines.get(i).getLength();
        }
        return sum;
    }

    public Line longestLine(){
        Line longest = lines.get(0);
        for (int i = 0; i < lines.size()-1; i++) {
            if(lines.get(i).getLength()<lines.get(i+1).getLength()){
                longest = lines.get(i+1);
            }
        }
        return longest;
    }

}
