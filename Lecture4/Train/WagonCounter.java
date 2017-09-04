package Lecture4.Train;

public class WagonCounter {

    public static int findLenght(TaskTrain train) {

        if (!train.isLightOn()) {
            train.lightOn();
        }
        train.turnRight();
        train.setCount(train.getCount()+1);

        while (!train.isLength(train.getCount())) {
            if (!train.isLightOn()) {
                train.turnRight();
            } else {
                train.lightOff();
            }
            train.setCount(train.getCount()+1);
        }
        return train.getCount()+1;
    }

    public static void main(String[] args) {

        TaskTrain train = new TaskTrain();
        int trainLenght = findLenght(train);
    }
}
