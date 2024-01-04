/*
 * 
 * 
 * 
 */
package SlowerSorts;

/**
 * Selection Sort algorithm
 *
 * @param <T>
 */
public class SelectionSort<T extends Comparable<T>>{

    /**
     * Sorts an array using selection sort. This method sorts the array
     * in-place, modifying the original array.
     *
     * @param <T>
     * @param array the array to be sorted.
     */
    public static <T extends Comparable<T>> void sort(T[] array) {
        for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {//for each element
            int minIndex = getIndexOfSmallest(array, currentIndex, array.length); //retrieve minimum element
            T temp = array[currentIndex];
            array[currentIndex] = array[minIndex];
            array[minIndex] = temp;        }
    }


    /**
     * Helper method for selection sort. This method finds the index of the
     * smallest element in a given portion of an array
     *
     * @param <T> the type elements of the array, must be comparable
     * @param array the non null array
     * @param firstPosition the lower bound of the array
     * @param lastPosition the upper bound of the array
     * @return the index of the smallest element of the array
     */
    private static <T extends Comparable<T>> int getIndexOfSmallest(T[] array, int firstPosition, int lastPosition) {
        T min = array[firstPosition];
        int indexOfMin = firstPosition;
        for (int index = firstPosition + 1; index < lastPosition; index++) {
            if (array[index].compareTo(min) < 0) {
                min = array[index];
                indexOfMin = index;
            }
        }
        return indexOfMin;
    }
}
