package StackArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 *
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;


    public GenericStack() {
        this.elements = (E[]) new Object[0];
    }

    public boolean isEmpty() {

        return elements.length == 0;
    }

    public void push(E thing) {

        E[] newArr = (E[]) new Object[elements.length + 1];

        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        newArr[elements.length] = thing;
        elements = newArr;

    }

    public E pop() {

        E element = elements[elements.length - 1];
        E[] newArr = (E[]) new Object[elements.length - 1];

        for (int i = 0; i < elements.length - 1; i++) {
            newArr[i] = elements[i];
        }

        elements = newArr;

        return element;
    }
}
