package Lecture7.Queue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DynamicArrayQueue<E> implements Queue<E> {

    private E[] elems;
    private int cursor;
    private int count;

    public DynamicArrayQueue() {
        elems = (E[]) new Object[10];
        count = 0;
    }

    public DynamicArrayQueue(E... elem) {
        elems = Arrays.copyOf(elem, elem.length);
        count = elem.length;
    }

    @Override
    public void offer(E elem) {
        if (elems.length == count) {
            E[] temp = elems;
            elems = Arrays.copyOf(temp, temp.length + 10);
        }
        elems[count] = elem;
        count++;
    }

    @Override
    public E remove() {
        if (count == 0) {
            throw new NoSuchElementException();
        }
        E temp = elems[0];
        E[] tempElems = elems;
        elems = Arrays.copyOfRange(tempElems, 1, tempElems.length - 1);
        count--;
        return temp;
    }

    @Override
    public E poll() {
        if (count == 0) {
            return null;
        }
        return remove();
    }

    @Override
    public E element() {
        if (count == 0) {
            throw new NoSuchElementException();
        }
        return elems[0];
    }

    @Override
    public E peek() {
        if (count == 0) {
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
        if (count == 0){return contains;}
        for (int i = 0; i < count; i++) {
            if(elems[i].equals(elem)){
                contains = true;
            }
        }
        return contains;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            @Override
            public boolean hasNext() {
                return cursor < size();
            }

            @Override
            public E next() {
                int i = cursor;
                E next = elems[i];
                cursor = i + 1;
                return next;
            }
        };
    }
}

