package Lecture2.Task1;

public final class Line {

    private final Point pointStart;
    private final Point pointEnd;

    public Line(Point pointStart, Point pointEnd) {
        this.pointStart = pointStart;
        this.pointEnd = pointEnd;
    }

    public double getLength(){
        double legth = Math.sqrt(Math.pow((pointStart.getX()-pointEnd.getX()), 2)+
                Math.pow((pointStart.getY()-pointEnd.getY()), 2));
        return legth;
    }
}
