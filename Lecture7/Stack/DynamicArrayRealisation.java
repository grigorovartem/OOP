package Lecture7.Stack;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DynamicArrayRealisation<E> implements Stack<E> {

    private E[] elems;
    private int cursor;
    private int count;

    public DynamicArrayRealisation() {
        elems = (E[]) new Object[10];
        count = 0;
    }

    public DynamicArrayRealisation(E... elem) {
        elems = Arrays.copyOf(elem, elem.length);
        count = elem.length;
    }

    @Override
    public void push(E elem) {
        if (elems.length == count) {
            E[] temp = elems;
            elems = Arrays.copyOf(temp, temp.length + 10);
        }
        elems[count] = elem;
        count++;
    }

    @Override
    public E pop() {
        if (count == 0) {
            throw new NoSuchElementException();
        }
        E temp = elems[count - 1];
        elems[count - 1] = null;
        count--;
        return temp;
    }

    @Override
    public E peek() {
        if (count == 0) {
            throw new NoSuchElementException();
        }
        return elems[count - 1];
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
