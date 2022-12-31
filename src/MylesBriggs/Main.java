package MylesBriggs;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First Name: ");
        String firstName = sc.next();
        System.out.print("Last Name: ");
        String lastName = sc.next();
        System.out.print("Age: ");
        int age = sc.nextInt();
        UserProfile userProfile = new UserProfile(firstName, lastName, age);
        Questions questions = new Questions();
        Questionnaire questionnaire = new Questionnaire();
        for (int index = 0; index != 5; index++) {
            System.out.println(Arrays.toString(questions.extroversion[index]));
            String answer = sc.next();
            if (Objects.equals(answer, "a")) questionnaire.setExtroverted(1);
            else if (Objects.equals(answer,"b")) questionnaire.setIntroverted(1);
        }
        for (int index = 0; index != 5; index++) {
            System.out.println(Arrays.toString(questions.sensing[index]));
            String answer = sc.next();
            if (Objects.equals(answer, "a")) questionnaire.setSensing(1);
            else if (Objects.equals(answer,"b")) questionnaire.setIntuitive(1);
        }
        for (int index = 0; index != 5; index++) {
            System.out.println(Arrays.toString(questions.thinking[index]));
            String answer = sc.next();
            if (Objects.equals(answer, "a")) questionnaire.setThinker(1);
            else if (Objects.equals(answer,"b")) questionnaire.setFeelings(1);
        }
        for (int index = 0; index != 5; index++) {
            System.out.println(Arrays.toString(questions.judging[index]));
            String answer = sc.next();
            if (Objects.equals(answer, "a")) questionnaire.setJudging(1);
            else if (Objects.equals(answer,"b")) questionnaire.setPerceiving(1);
        }
        questionnaire.extroversion();
        questionnaire.sensitivity();
        questionnaire.thinking();
        questionnaire.judging();

        System.out.printf("NAME: %s     AGE: %d       PERSONALITY TYPE: %s%n",userProfile.getName(), userProfile.getAge(), questionnaire.getPersonalityType());
        System.out.println(userProfile.getPersonalityType());
    }
}
