package Lecture4.Train;

public interface Train {

    void turnLeft();
    void turnRight();
    void lightOn();
    void lightOff();
    boolean isLightOn();

    boolean isLength(int expectedLength);

    //int getCount();
    //void setCount(int count);
}
