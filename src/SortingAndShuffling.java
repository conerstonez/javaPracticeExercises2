import java.util.Arrays;
import java.util.Random;

public class SortingAndShuffling {

    public static int[] ascendingOrderSorting(int[] arr) {
        int index = 0;
        int temp = 0;
        while(index < arr.length){
            for(int sortingIndex = 0; sortingIndex < arr.length; sortingIndex++){
                if(arr[index] < arr[sortingIndex]){
                    temp = arr[index];
                    arr[index] = arr[sortingIndex];
                    arr[sortingIndex] = temp;
                }
            }
            index++;
        }
        return arr;
    }

    public static int[] descendingOrderSorting(int[] arr) {
        int index = 0;
        int temp = 0;
        while(index < arr.length){
            for(int sortingIndex = 0; sortingIndex < arr.length; sortingIndex++){
                if(arr[index] > arr[sortingIndex]){
                    temp = arr[index];
                    arr[index] = arr[sortingIndex];
                    arr[sortingIndex] = temp;
                }
            }
            index++;
        }
        return arr;
    }

    public static int[] reverseSorting(int[] arr) {
        int index = 0;
        int sortingIndex = arr.length - 1;
        int[] reverseArray = new int[arr.length];
        while(index < arr.length){
            reverseArray[sortingIndex--] = arr[index++];
        }
        return reverseArray;
    }

    public static String reverseSorting(String userInput) {
        StringBuilder reverseString = new StringBuilder();
        int sortingIndex = userInput.length() - 1;
        int index = 0;
        while(index < userInput.length()){
            reverseString.append(userInput.charAt(sortingIndex--));
            index++;
        }
        return reverseString.toString();
    }

    public static int[] overhandShuffle(int[] arr) {
        Random random = new Random();
        int index = 0;
        int[] shufflledArray = new int[arr.length];
        for (int shufflingRounds = random.nextInt(10); shufflingRounds >= 0; shufflingRounds--){
            int shuffleIndex = random.nextInt(arr.length - 1);
//            for(int index = 0; index < arr.length; index++) {
                shufflledArray[index++] = arr[shuffleIndex];
//            }
        }
        System.out.println(Arrays.toString(shufflledArray));
        return shufflledArray;
    }
}
