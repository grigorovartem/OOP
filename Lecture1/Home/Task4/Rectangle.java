package Lecture1.Home.Task4;

public class Rectangle {

    private double height;
    private double width;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double height, double width) {

        this.height = height;
        this.width = width;
    }

    public double square() {
        return height * width;
    }

    public double perimeter() {
        return 2 * (height + width);
    }
}
