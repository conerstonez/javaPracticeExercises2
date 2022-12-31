package DietelChapter7.SevenSegmant;

import java.util.Arrays;
import java.util.Objects;

public class SevenSegment {

    private boolean isOn;
    private final int[] numbers;
    private final String[] binaryAnnotations;
    private static String[][] sevenSegmentDisplay;
    private String binaryAnnotation;

    public SevenSegment() {
        this.isOn = false;
        numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        binaryAnnotations = new String[]{"0000110", "1101101", "1111001", "0110011", "1011011"
                , "1011111", "1110000", "1111111", "1110011", "1111110"};
        sevenSegmentDisplay = new String[5][4];
        arrayFill(sevenSegmentDisplay);
    }
    private static void arrayFill(String[][] array) {
        for(int i = 0; i != array.length; i++) {
            Arrays.fill(array[i], " ");
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public void powerOn() {
        isOn = true;
    }

    public void powerOff() {
        isOn = false;
    }

    public String getBinaryAnnotation() {
        return binaryAnnotation;
    }

    public void userInput(int userInput) {
        for (int i = 0; i != numbers.length; i++) {
            if (Objects.equals(numbers[i], userInput)) binaryAnnotation =  binaryAnnotations[i];
        }
        if (isOn()) write(binaryAnnotation);
    }

    private static void write(String input) {
        if (Objects.equals(input.charAt(0), '1')) {
            sevenSegmentDisplay[0][0] = "#";
            sevenSegmentDisplay[0][1] = "#";
            sevenSegmentDisplay[0][2] = "#";
            sevenSegmentDisplay[0][3] = "#";
        }
        if (Objects.equals(input.charAt(1), '1')) {
            sevenSegmentDisplay[1][3] = "#";
        }
        if (Objects.equals(input.charAt(2), '1')) {
            sevenSegmentDisplay[3][3] = "#";
        }
        if (Objects.equals(input.charAt(3), '1')) {
            sevenSegmentDisplay[4][0] = "#";
            sevenSegmentDisplay[4][1] = "#";
            sevenSegmentDisplay[4][2] = "#";
            sevenSegmentDisplay[4][3] = "#";
        }
        if (Objects.equals(input.charAt(4), '1')) {
            sevenSegmentDisplay[3][0] = "#";
        }
        if (Objects.equals(input.charAt(5), '1')) {
            sevenSegmentDisplay[1][0] = "#";
        }
        if (Objects.equals(input.charAt(6), '1')) {
            sevenSegmentDisplay[2][0] = "#";
            sevenSegmentDisplay[2][1] = "#";
            sevenSegmentDisplay[2][2] = "#";
            sevenSegmentDisplay[2][3] = "#";
        }
    }

    public String[][] display() {
        return sevenSegmentDisplay;
    }
}