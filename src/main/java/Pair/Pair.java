package Pair;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair<E extends Comparable> {

    E one;
    E two;

    public Pair(E v, E v1) {
        this.one = v;
        this.two = v1;
    }

    public E getFirst() {
        return one;

    }

    public E getSecond() {
        return two;
    }

    public E min() {

       return one.compareTo(two) < 0 ?  one :  two;

    }

    public E max() {

        return one.compareTo(two) < 0 ? two : one;
    }
}
