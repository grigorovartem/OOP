package Lecture7.Pair;

import Lecture7.Pair.Pair;

public class PairRunner {

    public static void main(String[] args) {

        Pair<Double, Integer> pair1 = new Pair<>(.7865, 8);
        Pair<String, Double> pair2 = new Pair<>("String", 1.98);

        System.out.println(pair1.toString());
        System.out.println(pair2.toString());

    }
}
