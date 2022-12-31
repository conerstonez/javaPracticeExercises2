package MylesBriggs;

public class Questionnaire {
    private int extroverted;
    private int introverted;
    private int sensing;
    private int intuitive;
    private int thinker;
    private int feelings;
    private int judging;
    private int perceiving;
    private final StringBuilder personalityType = new StringBuilder();

    public void setExtroverted(int extroverted) {
        this.extroverted += extroverted;
    }

    public void setIntroverted(int introverted) {
        this.introverted += introverted;
    }

    public void setSensing(int sensing) {
        this.sensing += sensing;
    }

    public void setIntuitive(int intuitive) {
        this.intuitive += intuitive;
    }

    public void setThinker(int thinker) {
        this.thinker += thinker;
    }

    public void setFeelings(int feelings) {
        this.feelings += feelings;
    }

    public void setJudging(int judging) {
        this.judging += judging;
    }

    public void setPerceiving(int perceiving) {
        this.perceiving += perceiving;
    }
    public void extroversion() {
        if (extroverted > introverted) personalityType.append("E");
        else personalityType.append("I");
    }

    public void sensitivity() {
        if (sensing > intuitive) personalityType.append("S");
        else personalityType.append("N");
    }

    public void thinking() {
        if (thinker > feelings) personalityType.append("T");
        else personalityType.append("F");
    }

    public void judging() {
        if (judging > perceiving) personalityType.append("J");
        else personalityType.append("P");
    }
    public StringBuilder getPersonalityType(){
        return personalityType;
    }
}
