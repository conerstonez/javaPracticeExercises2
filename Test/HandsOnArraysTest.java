import DietelChapter7.HandsOnArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HandsOnArraysTest {

    @Test
    void fillingAnArrayWithElements(){
        int[] arr = new int[10];
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, HandsOnArray.arrayFll(arr));
        char[] charArray = new char[3];
        assertArrayEquals(new char[]{'X', 'O', 'X'}, HandsOnArray.arrayFillWithChar(charArray));
    }

    @Test
    void multiArrayTest(){
        char [][] arrays = new char[3][];
    }
}
