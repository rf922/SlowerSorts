/*
 * 
 * 
 * 
 */
package SlowerSorts;

/**
 * Factory class for creating instances of different sorting strategies.
 */
public class SortFactory {

    /**
     * Returns an instance of a sorting algorithm based on the type passed
     *
     * @param type The type of sorting algorithm
     * @return An instance of the algorithm
     * @throws IllegalArgumentException if an unknown sorting type is specified.
     */
    public static SlowerSorts<?> getSorter(SortType type) {
        switch (type) {
            case SELECTION_SORT -> { return new SelectionSort<>(); }
            case INSERTION_SORT -> { return new InsertionSort<>(); }
            case SHELL_SORT -> { return new ShellSort<>(); }
            default -> throw new IllegalArgumentException("Not Yet Implemented");
        }
    }

    /**
     * Enumeration of the different types of sorting algorithms available.
     */
    public enum SortType {
        SELECTION_SORT,
        INSERTION_SORT,
        SHELL_SORT
    }
}
