package Lecture1.Home.Task4;

public class RectangleRun {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2.0, 3.0);
        Rectangle rectangle2 = new Rectangle(4.0, 5.0);
        Rectangle rectangle3 = new Rectangle(2.0, 4.0);

        System.out.println(rectangle1.square());
        System.out.println(rectangle2.perimeter());

        Rectangles rectangles = new Rectangles();
        rectangles.add(rectangle1);
        rectangles.add(rectangle2);
        rectangles.add(rectangle3);
        System.out.println(rectangles.sumSquare());
    }
}
