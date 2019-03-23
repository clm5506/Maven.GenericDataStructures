package StackArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList<E> elements;

    public Stack() {

        elements = new ArrayList();

    }

    public boolean isEmpty(){

        return elements.isEmpty();
    }

    public void push(E thing) {

        elements.add(thing);
    }


    public E pop() {

        E element = elements.get(elements.size()-1);
        elements.remove(elements.size()-1);

        return element;
    }
}
