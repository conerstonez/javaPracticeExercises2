package MylesBriggs;

public class UserProfile {

    private String firstName;
    private String lastName;
    private int age;
    private Type personalityType;

    Questionnaire questionnaire = new Questionnaire();

    public UserProfile(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (0 > age) throw new IllegalArgumentException("Invalid age");
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getName() {
        return firstName+" "+lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setPersonalityType(Type personalityType) {
        this.personalityType = personalityType;
    }

    public Type getPersonalityType() {
        return personalityType;
    }
}
