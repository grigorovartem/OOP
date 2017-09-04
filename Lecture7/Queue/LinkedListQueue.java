package Lecture7.Queue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedListQueue<E> implements Queue<E> {

    private LinkedList<E> list;

    public LinkedListQueue() {
        list = new LinkedList<E>();
    }

    public LinkedListQueue(E... elems){
        this.list = new LinkedList<E>();
        for (int i = 0; i < elems.length; i++) {
            list.add(elems[i]);
        }
    }

    @Override
    public void offer(E e) {
        list.add(e);
    }

    @Override
    public E remove() {
        if (list.isEmpty()){
            throw new NoSuchElementException();
        }
        E temp = list.getFirst();
        list.remove(list.getFirst());
        return temp;
    }

    @Override
    public E poll() {
        if (list.isEmpty()){
            return null;
        }
        return remove();
    }

    @Override
    public E element() {
        if (list.isEmpty()){
            throw new NoSuchElementException();
        }
        return list.getFirst();
    }

    @Override
    public E peek() {
        if (list.isEmpty()){
            return null;
        }
        return element();
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
    public boolean contains(E elem) {
        return list.contains(elem);
    }

    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }

    public void print(Queue<E> queue){
        for (E elem : queue){
            System.out.print(elem + " ");
        }
        System.out.println(" ");
    }
}
