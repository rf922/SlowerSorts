/*
 * 
 * 
 * 
 */
package SlowerSorts;

/**
 * An interface for the various sorting algorithms to be used
 *
 * @param <T> Slower sorts for comparable elements
 */
public interface SlowerSorts<T extends Comparable<T>> {

    /**
     * Sorting method
     *
     * @param array to be sorted
     */
    void sort(T[] array);

    /**
     * utility for swapping the position of two elements in an array
     * @param array
     * @param i the first element 
     * @param j the second element
     */
    default void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
