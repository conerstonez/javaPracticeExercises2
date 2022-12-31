import java.security.SecureRandom;
import java.util.Arrays;


public class SudokuGame {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int n = random.nextInt(9);
        int[][] array = new int[9][9];
        for (int row = 0; row != array.length; row++){
            for (int column = 0; column != array.length; column++){
                int digit = row + column +1;
                if (digit > array.length){
                    digit %= array.length;
                }
                array[row][column] = digit;
            }
        }
//        for (int[] rows : array) System.out.println(Arrays.toString(rows));
        for (int index = 0; index != array.length; index++){
            for (int x = 0; x != array.length; x++){
                System.out.print(array[index][x] + "   ");
            }
            System.out.println(" ");
        }
    }
}
