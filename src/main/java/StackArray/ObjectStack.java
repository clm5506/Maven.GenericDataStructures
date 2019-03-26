package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;

    public ObjectStack() {
        this.elements = new Object[0];

    }

    public boolean isEmpty() {

        return elements.length == 0;
    }

    public void push(Object thing) {

        Object[] newArr =  new Object[elements.length + 1];

        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        newArr[elements.length] = thing;
        elements = newArr;

    }

    public Object pop() {

        Object element = elements[elements.length - 1];
        Object[] newArr = new Object[elements.length - 1];

        for (int i = 0; i < elements.length - 1; i++) {
            newArr[i] = elements[i];
        }

        elements = newArr;

        return element;
    }
}
