public class Main {
    public String[] reverse(String userInput) {

        int backwardCounter = userInput.length() - 1;
        int forwardCounter = 0;
        String[] output = new String[userInput.length()];
        while(backwardCounter != -1){
            output[forwardCounter] = String.valueOf(userInput.charAt(backwardCounter));
        }
        return output;
    }
}