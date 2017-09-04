package Lecture7.Queue;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedQueue<E> implements Queue<E> {

    private static class Node<E> {

        private E data;
        private Node<E> next;
        private Node<E> previous;

        public Node(E data) {
            this.data = data;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int count;

    public LinkedQueue() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    @Override
    public void offer(E e) {
        if (head == null) {
            head = new Node<E>(e);
            tail = head;
        } else {
            Node<E> element = new Node<E>(e);
            tail.next = element;
            tail = element;
        }
        count++;
    }

    @Override
    public E remove() {
        if (count == 0){
            throw new NoSuchElementException();
        }
        E temp = head.data;
        head = head.next;
        count--;
        return temp;
    }

    @Override
    public E poll() {
        if(count == 0){
            return null;
        }
        return remove();
    }

    @Override
    public E element() {
        if (count == 0){
            throw new NoSuchElementException();
        }
        return head.data;
    }

    @Override
    public E peek() {
        if(count == 0){
            return null;
        }
        return element();
    }

    @Override
    public int size() {
        if (count > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public boolean contains(E elem) {
        boolean contains = false;
        for (int i = 0; i < count; i++) {
            if (iterator().next().equals(elem) || tail.data.equals(elem)){
                contains = true;
            }
        }
        return contains;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            Node<E> currentElement = head;

            @Override
            public boolean hasNext() {
                return currentElement.next != null;
            }

            @Override
            public E next() {
                E value = currentElement.data;
                currentElement = currentElement.next;
                return value;
            }
        };
    }

    public void print(LinkedQueue<E> queue) {
        for (E elem : queue) {
            System.out.print(elem + " ");
        }
        System.out.println(queue.tail.data);

    }
}

