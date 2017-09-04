package Lecture7.Stack;

import java.util.*;

public class LinkedListStack<E> implements Stack<E>{

    private LinkedList<E> list;

    public LinkedListStack() {
        this.list = new LinkedList<E>();
    }

    public LinkedListStack(E... elems) {
        this.list = new LinkedList<E>();
        for (int i = 0; i < elems.length; i++) {
            list.add(elems[i]);
        }
    }


    @Override
    public void push(E elem) {
        list.add(elem);
    }

    @Override
    public E pop() {
        if(list.size() == 0){
            throw new NoSuchElementException();
        }
        E lastElem = list.getLast();
        list.remove(list.getLast());
        return lastElem;
    }

    @Override
    public E peek() {
        if(list.size() == 0){
            throw new NoSuchElementException();
        }
        return list.getLast();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return list.iterator();
    }
}
