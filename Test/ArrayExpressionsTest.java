import DietelChapter7.ArrayExpressions;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayExpressionsTest {

    @Test
    void arraySumTest() {
        ArrayExpressions arrayExpressions = new ArrayExpressions();
        int elementSum = arrayExpressions.arraySumValue(new int[]{1, 2, 3, 4, 5});
        assertEquals(15, elementSum);
    }

    @Test
    void minimumArrayValueTest() {
        ArrayExpressions arrayExpressions = new ArrayExpressions();
        int minimum = arrayExpressions.minimumValue(new int[]{7, 5, 38, 87, 3, 98, 42, 65, 66});
        assertEquals(3, minimum);
    }

    @Test
    void maximumArrayValueTest() {
        ArrayExpressions arrayExpressions = new ArrayExpressions();
        int maximum = arrayExpressions.maximumValue(new int[]{2, 55, 98, 21, 6, 71, 7, 0, 23});
        assertEquals(98, maximum);
    }

    @Test
    void maximumValueAfterSummingArrayElementsTest(){
        ArrayExpressions arrayExpressions = new ArrayExpressions();
        int maximumAnswer = arrayExpressions.maximumSumValue(new int[]{5, 2, 3, 1, 4});
        assertEquals(14, maximumAnswer);
    }

    @Test
    void minimumValueAfterSummingArrayElementsTest(){
        ArrayExpressions arrayExpressions = new ArrayExpressions();
        int maximumAnswer = arrayExpressions.minimumSumValue(new int[]{5, 2, 3, 1, 4});
        assertEquals(10, maximumAnswer);
    }
}
