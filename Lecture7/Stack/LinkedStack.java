package Lecture7.Stack;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedStack<E> implements Stack<E> {

    private int cursor;
    private int count;

    private Node<E> currentElement;

    private static class Node<E> {
        private E data;
        private Node<E> previous;

        public Node(E data) {
            this.data = data;
        }
    }

    public LinkedStack() {
        this.currentElement = null;
        this.count = 0;
    }

    public LinkedStack(E... elems) {
        if (elems.length == 1){currentElement = new Node<E>(elems[0]);}
        else {
            for (int i = 1; i < elems.length; i++) {
                currentElement = new Node<E>(elems[i]);
                currentElement.previous = new Node<E>(elems[i - 1]);
            }
        }
        count = elems.length;
    }

    @Override
    public void push(E elem) {
        Node<E> element = new Node<E>(elem);
        element.previous = currentElement;
        currentElement = element;
        count++;
    }

    @Override
    public E pop() {
        if (count == 0) {
            throw new NoSuchElementException();
        }
        Node<E> temp = currentElement;
        currentElement = temp.previous;
        count--;
        return temp.data;
    }

    @Override
    public E peek() {
        if (count == 0) {
            throw new NoSuchElementException();
        }
        return currentElement.data;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public Iterator iterator() {
        return new Iterator<E>() {
            @Override
            public boolean hasNext() {
                return cursor < size();
            }

            @Override
            public E next() {
                return next();
            }
        };
    }
}
