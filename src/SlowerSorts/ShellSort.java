/*
 * 
 * 
 * 
 */
package SlowerSorts;

/**
 * A class for a generic implementation of the shell sort algorithm.
 * @param <T>
 */
public class ShellSort<T extends Comparable<T>> {

    /**
     * Shell sort, a variant of insertion sort that looks to all its entries a
     * given space / gap from eachother and sorts the elements among eachother
     * reducing the space and repating until the result is sorted.
     *
     * @param <T>
     * @param array
     */
    public static <T extends Comparable<T>> void sort(T[] array) {
        int space = array.length / 2;
        while (space > 0) {
            if (space % 2 == 0) {
                space++;
            }
            for (int begin = 0; begin < space; begin++) {
                incrementalInsertionSort(array, begin, array.length - 1, space);

            }
            space = space / 2;
        }
    }

    /**
     * Compare this to insertion sort to find it is essetially the same when it
     * happens that space ==1
     *
     * @param <T>
     * @param array
     * @param first
     * @param last
     * @param space
     */
    private static <T extends Comparable<T>> void incrementalInsertionSort(T[] array, int first, int last, int space) {
        for (int unsortedIndex = first + space; unsortedIndex <= last; unsortedIndex = unsortedIndex + space) {
            T nextToInsert = array[unsortedIndex];
            int index = unsortedIndex - space;

            while ((index >= first) && (nextToInsert.compareTo(array[index]) < 0)) {
                array[index + space] = array[index];
                index = index - space;
            }

            array[index + space] = nextToInsert;
        }
    }

}
