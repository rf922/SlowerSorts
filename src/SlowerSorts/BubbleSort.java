/*
 * 
 * 
 * 
 */
package SlowerSorts;

/**
 * Implementation of the bubble sort algorithm.
 *
 * @param <T> Type elements to be sorted must implement comparable
 */
public class BubbleSort<T extends Comparable<T>> {

    /**
     * Sorts an array in-place using bubble sort.
     *
     * @param <T>
     * @param array
     */
    public static <T extends Comparable<T>> void sort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (!bubbleSortPass(array, array.length - i - 1)) {
                break; // Array is sorted
            }

        }
    }

    /**
     * Performs one pass of the bubble sort algorithm on the array comparing adjacent elements
     * and performing a swap when an element is greater than the next element following it.
     *
     * @param <T> The type of elements in the array.
     * @param array The array to sort.
     * @param lastUnsortedIndex The index of the last unsorted element.
     * @return true if any swaps were made, indicating that the array may still
     * be unsorted.
     */
    private static <T extends Comparable<T>> boolean bubbleSortPass(T[] array, int lastUnsortedIndex) {
        boolean swapped = false;
        for (int j = 0; j < lastUnsortedIndex; j++) {
            if (array[j].compareTo(array[j + 1]) > 0) {
                // Swap 
                T temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                swapped = true;
            }
        }
        return swapped;
    }

}
