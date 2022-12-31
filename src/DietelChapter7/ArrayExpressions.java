package DietelChapter7;

public class ArrayExpressions {
    private int arraySum;
    private int minimum;
    private  int maximum;

    public int arraySumValue(int[] arr) {
        int index = 0;
        while(index < arr.length){
            arraySum += arr[index];
            index++;
        }
        return arraySum;
    }

    public int minimumValue(int[] arr) {
        int index = 1;
        int minimum = arr[0];
        while(index < arr.length){
            if(arr[index] < minimum){
               minimum = arr[index];
               this.minimum = minimum;
            }
            index++;
        }
        return this.minimum;
    }

    public int maximumValue(int[] arr) {
        int index = 1;
        int maximum = arr[0];
        while (index < arr.length){
            if(arr[index] > maximum){
                maximum = arr[index];
                this.maximum = maximum;
            }
            index++;
        }
        return this.maximum;
    }

    public int maximumSumValue(int[] arr) {
        int skippedIndex = 0;
        int sum = 0;
        int maximumAnswer = 0;
        while(skippedIndex < arr.length) {
            for (int index = 0; index < arr.length; index++) {
                if (index == skippedIndex) {
                    continue;
                }
                sum += arr[index];
            }
            if (sum > maximumAnswer) {
                maximumAnswer = sum;
            }
            sum = 0;
            skippedIndex++;
        }
            return maximumAnswer;
//        return arraySumValue(arr) - minimumSumValue(arr);
        }

    public int minimumSumValue(int[] arr) {
        int skippedIndex = 0;
        int sum = 0;
        int minimumAnswer = 1000;
        while(skippedIndex < arr.length) {
            for (int index = 0; index < arr.length; index++) {
                if (index == skippedIndex) {
                    continue;
                }
                sum += arr[index];
            }
            if (sum < minimumAnswer) {
                minimumAnswer = sum;
            }
            sum = 0;
            skippedIndex++;
        }
        return minimumAnswer;
//        return arraySumValue(arr) - maximumSumValue(arr);
    }
}
