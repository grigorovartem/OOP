package Lecture4.Train;

import java.util.Random;

public class LinkedTrain implements Train {

    private class Node {

        private boolean light;
        private Node previous;
        private Node next;

        public Node(boolean light) {
            this.light = light;
            this.previous = null;
            this.next = null;
        }
    }

    private int size;
    private Node head;
    private Node tail;

    public LinkedTrain() {
        this.size = 0;
        this.head = new Node(isLightOn());
        this.tail = this.head;
    }

    public int size(){return size;}

    @Override
    public void turnLeft() {
        Node temp = tail;
        tail = new Node(isLightOn());
        tail.previous = temp;
        tail.next = null;
        size++;
    }

    @Override
    public void turnRight() {
        Node temp = tail;
        tail = temp.previous;
        tail.next = null;
        size--;
    }

    @Override
    public void lightOn() {
        tail.light = true;
    }

    @Override
    public void lightOff() {
        tail.light = false;
    }

    @Override
    public boolean isLightOn() {
        Random random = new Random();
        return random.nextBoolean();
    }

    @Override
    public boolean isLength(int expectedLength) {
        while (!tail.equals(head)) {
            turnRight();
        }
        return !tail.light;
    }
}
