import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SortingAndShufflingTest {

    @Test
    void arrayAscendingSortingTest(){
        int[] arr = {5, 4, 7, 6, 1, 8};
        int[] arrangedArray = SortingAndShuffling.ascendingOrderSorting(arr);
        assertArrayEquals(new int[]{1, 4, 5, 6, 7, 8}, arrangedArray);
    }

    @Test
    void arrayDescendingSortingTest(){
        int[] arr = {5, 4, 7, 6, 1, 8};
        int[] arrangedArray = SortingAndShuffling.descendingOrderSorting(arr);
        assertArrayEquals(new int[]{8, 7, 6, 5, 4, 1}, arrangedArray);
    }

    @Test
    void arrayReverseArrangementTest(){
        int[] arr = {3, 5, 6, 7, 1, 9};
        int[] reverseArray = SortingAndShuffling.reverseSorting(arr);
        assertArrayEquals(new int[]{9, 1, 7, 6, 5, 3}, reverseArray);
    }

    @Test
    void stringReverseArrangementTest(){
        String input = "Peter";
        String output = SortingAndShuffling.reverseSorting(input);
        assertEquals("reteP", output);
    }

    @Test
    void arrayOverhandShuffleTest(){
        int[] arr = {6, 8, 2, 9, 3, 0, 3, 1, 7, 5};
        assertNotEquals(arr, SortingAndShuffling.overhandShuffle(arr));
    }
}
