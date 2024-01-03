/*
 * 
 * 
 * 
 */
package SlowerSorts;

import java.util.Random;
import java.util.stream.IntStream;
import SlowerSorts.SlowerSorts;
import SlowerSorts.SelectionSort;
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
        System.out.println(Arrays.toString(numberArray));
        SlowerSorts selectionSort = new SelectionSort();
        selectionSort.sort(numberArray);
        System.out.println(Arrays.toString(numberArray));

    }

}
