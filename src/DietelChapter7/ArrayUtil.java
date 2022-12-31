package DietelChapter7;

import java.util.Objects;

public class ArrayUtil {

    public static int maximum(int[] array) {
        int maximum = 0;
        for (int element : array) {
            maximum = Math.max(maximum, element);
        }
        return maximum;
    }

    public static int[] reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        int sortingIndex = array.length - 1;
        for (int index = 0; index != array.length; index++) {
            reversedArray[index] = array[sortingIndex];
            sortingIndex--;
        }
        return reversedArray;
    }

    public static boolean hasElements(Object[] array, Object word) {
        boolean check = false;
        for(Object element : array){
            if (Objects.equals(element, word)) {
                check = true;
                break;
            }
        }
        return check;
    }

    public static boolean hasElements(int[] array, int number) {
        boolean check = false;
        for(int element : array){
            if (element == number) {
                check = true;
                break;
            }
        }
        return check;
    }

    public static int[] oddIndex(int[] array) {
        int[] oddIndexArray = new int[array.length / 2];
        int index = 0;
        int newIndex = 0;
        while(index < array.length){
            if(index % 2 != 0) {
                oddIndexArray[newIndex++] = array[index++];
            }
            index++;
        }
        return oddIndexArray;
    }

    public static int[] evenIndex(int[] array) {
        int newArrayLength;
        if (array.length % 2 != 0){
            newArrayLength = (array.length / 2) + 1;
        }
        else newArrayLength = array.length / 2;
        int[] evenIndexArray = new int[newArrayLength];
        int index = 0;
        int newIndex = 0;
        while (index != array.length){
            if (index % 2 == 0){
                evenIndexArray[newIndex++] = array[index];
            }
            index++;
        }
        return evenIndexArray;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int index = 0; index != array.length; index++){
            sum += array[index];
        }
        return sum;
    }

    public static boolean isPalindrome(String user_input) {
        StringBuilder reversedString = new StringBuilder();
        for(int index = user_input.length() - 1; index >= 0; index--){
            reversedString.append(user_input.charAt(index));
        }
        return reversedString.toString().equalsIgnoreCase(user_input);
    }


    public static Object[] concatenation(Object[] array1, Object[] array2) {
        Object[] concatenatedArray = new Object[array1.length + array2.length];
        int index = 0;
        for (Object element : array1){
            concatenatedArray[index] = element;
            index++;
        }
        for (Object element : array2){
            concatenatedArray[index] = element;
            index++;
        }
        return concatenatedArray;
    }

    public static Object[] arrayCombination(Object[] array1, Object[] array2) {
        Object[] combinedArray = new Object[array1.length + array2.length];
        int sortingIndex = 0;
        for (int index = 0; index != array1.length; index++){
            combinedArray[sortingIndex++] = array1[index];
            combinedArray[sortingIndex++] = array2[index];
        }
        return combinedArray;
    }

    public static int[] numberToArray(int user_input) {
        int arrayLength = String.valueOf(user_input).length();
        int[] array = new int[arrayLength];
        int index = 0;
        int power = arrayLength - 1;
        while (index != arrayLength){
            array[index] = (int) (user_input / Math.pow(10, power));
            user_input = (int) (user_input - (array[index] * Math.pow(10, power)));;
            index++;
            power--;
        }
        return array;
    }

    public static int[] swap(int[] array) {
        int[] swappedArray = new int[array.length];
        int index = 0;
        int swapIndex = 1;
        while(index != array.length){
            swappedArray[index] = array[swapIndex];
            swappedArray[swapIndex] = array[index];
            index += 2;
            swapIndex += 2;
        }
        return swappedArray;
    }

    public static int largeElementsSum(int[] array) {
        int secondLargestNumber = 0;
        for (int number : array){
            if (number != maximum(array)){
                secondLargestNumber = Math.max(secondLargestNumber, number);
            }
        }
        return maximum(array) + secondLargestNumber;
    }
}
