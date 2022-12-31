package DietelChapter7;

public class HandsOnArray {
    public static int[] arrayFll(int[] arr) {
        for(int index = 0; index < arr.length; index++){
            arr[index] = index + 1;
            System.out.print(arr[index] + ", ");
        }
        return arr;
//        Arrays.stream(arr).parallel().forEach(index-> System.out.println(arr + ", "));
    }

    public static char[] arrayFillWithChar(char[] arr) {
        for(int index = 0; index < arr.length; index++){
            if(index % 2 != 1){arr[index] = 'X';}
            else{arr[index] = 'O';}
        }
        return arr;
    }
//    static SecureRandom randomIndex = new SecureRandom();
}
