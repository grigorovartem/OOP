package Lecture4.Train;

public class TaskTrain implements Train {

    private boolean light;
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void turnLeft() {
        count--;
    }

    @Override
    public void turnRight() {
        count++;
    }

    @Override
    public void lightOn() {
        light = true;
    }

    @Override
    public void lightOff() {
        light = false;
    }

    @Override
    public boolean isLightOn() {
        return light;
    }

    @Override
    public boolean isLength(int expectedLength) {
        for (int i = 0; i < expectedLength; i++) {
            this.turnLeft();
        }
        return !light;
    }
}
