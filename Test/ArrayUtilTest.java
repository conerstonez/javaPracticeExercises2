import DietelChapter7.ArrayUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilTest {

    @Test
    void returnsArrayMaximumElementTest(){
        int[] array = {1, 2, 3, 9, 5, 6, 7};
        assertEquals(9, ArrayUtil.maximum(array));
    }

    @Test
    void returnsReversedArrayTest() {
        int[] array = {1, 2, 4, 5, 6, 7, 8};
        assertArrayEquals(new int[]{8, 7, 6, 5, 4, 2, 1}, ArrayUtil.reverse(array));
    }

    @Test
    void checksExistenceOfStringElementInArray(){
        String[] array = {"Food", "Greece", "Flood", "Car"};
        assertTrue(ArrayUtil.hasElements(array, "Food"));
    }

    @Test
    void checksExistenceOfIntegerElementInArray(){
        int[] integerArray = {1, 10, 6, 73, 65, 29};
        assertTrue(ArrayUtil.hasElements(integerArray, 65));
    }

    @Test
    void returnsElementsOnOddIndexes(){
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(new int[]{2, 4, 6}, ArrayUtil.oddIndex(array));
    }

    @Test
    void returnsElementsOnEvenIndexes(){
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(new int[]{1, 3, 5, 7}, ArrayUtil.evenIndex(array));
    }

    @Test
    void returnsElementsSumInAnArray(){
        int[] array = {1, 2, 4, 5};
        assertEquals(12, ArrayUtil.sum(array));
    }
    
    @Test
    void checkIfInputIspalindrome(){
        String user_input = "Level";
        assertTrue(ArrayUtil.isPalindrome(user_input));
    }

    @Test
    void returnsConcatenatedArray(){
        Object[] array1 = {"a", "b", "c", "d"};
        Object[] array2 = {1, 2, 3, 4, 5};
        assertArrayEquals(new Object[]{"a", "b", "c", "d", 1, 2, 3, 4, 5}, ArrayUtil.concatenation(array1, array2));
    }

    @Test
    void returnsAlternativelyCombinedArray(){
        Object[] array1 = {"a", "b", "c", "d"};
        Object[] array2 = {1, 2, 3, 4};
        assertArrayEquals(new Object[]{"a", 1, "b", 2, "c", 3, "d", 4}, ArrayUtil.arrayCombination(array1, array2));
    }

    @Test
    void convertsNumberToArray(){
        int number = 234254;
        assertArrayEquals(new int[]{2, 3, 4, 2, 5, 4}, ArrayUtil.numberToArray(number));
    }

    @Test
    void returnsSwappedArray(){
        int[] array = {1, 5, 4, 7};
        assertArrayEquals(new int[] {5, 1, 7, 4}, ArrayUtil.swap(array));
    }

    @Test
    void sumOfTwoArrayLargestNumbers(){
        int[] array = {1, 10, 6, 73, 65, 29};
        assertEquals(138, ArrayUtil.largeElementsSum(array));
    }
}
