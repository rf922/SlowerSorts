/*
 * 
 * 
 * 
 */
package SlowerSorts;

/**
 * A functional interface for the various sorting algorithms to be used
 *
 * @param <T> Slower sorts for comparable elements
 */
@FunctionalInterface
public interface SlowerSorts<T extends Comparable<T>> {

    /**
     * Sorting method
     *
     * @param array to be sorted
     */
    void sort(T[] array);

}
