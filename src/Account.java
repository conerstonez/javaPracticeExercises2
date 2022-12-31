public class Account {

    private String name;

    public void setName(String oruko) {
        name = oruko;
    }

    public String getName() {
        return name;
    }

    public String reverseName() {
        StringBuilder reversedName = new StringBuilder();
        int backwardCounter = name.length() - 1;
        while(backwardCounter != -1){
            reversedName.append(name.charAt(backwardCounter--));
        }
        return reversedName.toString();
    }
    
}
