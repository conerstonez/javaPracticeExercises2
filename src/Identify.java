public class Identify {
    int digitCounter = 0;
    public int checkDataType(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))){
               digitCounter += 1;
            }
        }
        return digitCounter;
    }

}
