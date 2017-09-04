package Lecture4.Train;

public class LinkedCounter {

    public static int findLength(LinkedTrain train){

        while (!train.isLength(train.size())){
            train.turnLeft();
            train.lightOff();
        }
        return train.size();
    }

    public static void main(String[] args) {

        LinkedTrain linkedTrain = new LinkedTrain();
        int lenght = findLength(linkedTrain);
    }
}
