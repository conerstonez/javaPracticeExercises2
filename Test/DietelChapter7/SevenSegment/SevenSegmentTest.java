package DietelChapter7.SevenSegment;

import DietelChapter7.SevenSegmant.SevenSegment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SevenSegmentTest {

    private SevenSegment sevenSegment;

    @BeforeEach
    void setUp() {
        sevenSegment = new SevenSegment();
    }

    @Test
    void digitalDisplayIsOff() {
        assertFalse(sevenSegment.isOn());
    }

    @Test
    void digitalDisplayCanBeTurnedOn() {
        sevenSegment.powerOn();
        assertTrue(sevenSegment.isOn());
    }

    @Test
    void digitalDisplayCanBeTurnedOff() {
        sevenSegment.powerOff();
        assertFalse(sevenSegment.isOn());
    }

    @Test
    void digitalDisplayTakesInADigitAndReturnsABinaryAnnotation() {
        sevenSegment.userInput(2);
        assertEquals("1101101", sevenSegment.getBinaryAnnotation());
    }

    @Test
    void digitalDisplayDisplaysNumber() {
        sevenSegment.powerOn();
        sevenSegment.userInput(3);
        assertEquals("1111001", sevenSegment.getBinaryAnnotation());
        assertArrayEquals(new String[][]{{"#", "#", "#", "#"}, {" ", " ", " ", "#"},
                {"#", "#", "#", "#"}, {" ", " ", " ", "#"}, {"#", "#", "#", "#"}},
                sevenSegment.display());
    }

    @Test
    void digitalDisplayDoesNotWorkWhenPowerIsOff() {
        sevenSegment.userInput(5);
        assertArrayEquals(new String[][]{{" ", " ", " ", " "}, {" ", " ", " ", " "},
                {" ", " ", " ", " "}, {" ", " ", " ", " "}, {" ", " ", " ", " "}},
                sevenSegment.display());
        sevenSegment.powerOn();
        sevenSegment.userInput(5);
        assertArrayEquals(new String[][]{{"#", "#", "#", "#"}, {"#", " ", " ", " "},
                        {"#", "#", "#", "#"}, {" ", " ", " ", "#"}, {"#", "#", "#", "#"}},
                sevenSegment.display());
    }

    @Test
    void printCorrectly() {
        sevenSegment.powerOn();
        sevenSegment.userInput(7);
        for (int i = 0; i != sevenSegment.display().length; i++) {
            for (int j = 0; j != sevenSegment.display()[i].length; j++) {
                System.out.print(sevenSegment.display()[i][j] + "  ");
            }
            System.out.println();
        }
    }


}
