/*
 * 
 * 
 * 
 */
package SlowerSorts;

/**
 *
 * @param <T>
 */
public class InsertionSort<T extends Comparable<T>> {

    /**
     * Sorts an array using insertion sort. This method sorts the array
     * in-place, modifying the original array.
     * @param <T>
     * @param array 
     */
    public static <T extends Comparable<T>> void sort(T[] array) {

        for (int unsortedIndex = 1; unsortedIndex < array.length; unsortedIndex++) {
            T unsortedElement = array[unsortedIndex];
            int lowestSortedIndex = 0;
            int highestSortedIndex = unsortedIndex - 1;
            insertInOrder(unsortedElement, array, lowestSortedIndex, highestSortedIndex);
        }
    }

    /**
     * 
     * @param <T>
     * @param unsortedElement
     * @param array
     * @param lowestSortedIndex
     * @param highestSortedIndex 
     */
    private static <T extends Comparable<T>> void insertInOrder(T unsortedElement, T[] array, int lowestSortedIndex, int highestSortedIndex) {
        int index = highestSortedIndex;
        while (index >= lowestSortedIndex && unsortedElement.compareTo(array[index]) < 0) {
            array[index + 1] = array[index]; // make space
            index--;
        }
        array[index + 1] = unsortedElement;
    }

}
