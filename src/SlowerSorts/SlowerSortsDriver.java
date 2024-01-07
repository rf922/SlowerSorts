/*
 * 
 * 
 * 
 */
package SlowerSorts;

import java.util.Random;
import java.util.stream.IntStream;
import SlowerSorts.SortFactory;
import java.util.Arrays;

/**
 * The driver for demoing each of the sorting algorithm
 *
 */
public class SlowerSortsDriver {

    /**
     * The main driver for demoing the algorithms included, generates an array
     * of random elements to be sorted.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arraySize = 10000;
        Random rand = new Random();
        Integer[] numberArray = IntStream.generate(() -> rand.nextInt(arraySize))
            .limit(arraySize)
            .boxed()
            .toArray(Integer[]::new);
        Integer[] numberArray2 = numberArray.clone(); 

        /* Selection Sort */
        SlowerSorts<Integer> slowSort = SortFactory.getSorter(SortFactory.SortType.SELECTION_SORT);
        long startTime = System.currentTimeMillis();
        slowSort.sort(numberArray);
        long endTime = System.currentTimeMillis();
        long selectionSortTime = endTime - startTime;

        /* Insertion Sort */
        slowSort = SortFactory.getSorter(SortFactory.SortType.INSERTION_SORT);
        startTime = System.currentTimeMillis();
        slowSort.sort(numberArray2);
        endTime = System.currentTimeMillis();
        long insertionSortTime = endTime - startTime;

        // System.out.println(Arrays.toString(numberArray));
        // System.out.println(Arrays.toString(numberArray2));

        // Displaying the runtimes in a table format
        System.out.println("Sort Method    | Runtime (ms)");
        System.out.println("-----------------------------");
        System.out.printf("Selection Sort | %12d\n", selectionSortTime);
        System.out.printf("Insertion Sort | %12d\n", insertionSortTime);
    }

}
