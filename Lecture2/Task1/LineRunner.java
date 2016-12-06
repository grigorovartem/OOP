package Lecture2.Task1;

public class LineRunner {
    public static void main(String[] args) {
        Point start1 = new Point(2, 5);
        Point end1 = new Point(7, 9);

        Point start2 = new Point(2, 3);
        Point end2 = new Point(6, 7);

        Point start3 = new Point(3, 4);
        Point end3 = new Point(8, 9);

        Line line1 = new Line(start1, end1);
        Line line2 = new Line(start2, end2);
        Line line3 = new Line(start3, end3);

        System.out.println(line1.getLength());
        System.out.println(line2.getLength());
        System.out.println(line3.getLength());

        Lines lines = new Lines();
        lines.addLine(line1);
        lines.addLine(line2);
        lines.addLine(line3);
        System.out.println(lines.sumLength());
        System.out.println(lines.longestLine().getLength());
    }
}
