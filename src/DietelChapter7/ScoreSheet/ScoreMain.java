package DietelChapter7.ScoreSheet;

import java.util.Scanner;

public class ScoreMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many students do you have?");
        int students = sc.nextInt();
        System.out.println("How many subjects do they offer?");
        int subjects = sc.nextInt();
        ScoreSheet scoreSheet = new ScoreSheet(students, subjects);
        System.out.println(saving());

        for (int index = 0; index != scoreSheet.getName().length; index++) {
            System.out.print("Enter name of student" + (index + 1) + ": ");
            scoreSheet.addStudentName(index, sc.next());
        }
        System.out.println(saving());

        for (int index = 0; index != scoreSheet.getSubject().length; index++) {
            System.out.print("Enter subject" + (index + 1) + ": ");
            scoreSheet.addSubjectTitle(index, sc.next());
        }
        System.out.println(saving());

        for (int index = 0; index != scoreSheet.getName().length; index++) {
            for (int subjectIndex = 0; subjectIndex != scoreSheet.getSubject().length; subjectIndex++) {
                System.out.printf("Entering score for %s%nEnter score for %s%n",
                        scoreSheet.getName()[index], scoreSheet.getSubject()[subjectIndex]);
                scoreSheet.inputScore(index, subjectIndex, sc.nextInt());
                System.out.println(saving());
            }
        }

        System.out.print("==========================================================");
        System.out.printf("%n%-7s","SUBJECT");
        for (int index = 0; index != scoreSheet.getSubject().length; index++) {
            System.out.printf("%-15s", scoreSheet.getSubject()[index]);
        }
        System.out.printf("%-15s%-15s%n", "AVG", "POS");
        System.out.print("==========================================================");
        for (int index = 0; index != scoreSheet.getName().length; index++) {
            System.out.printf("%n%s",scoreSheet.getName()[index]);
            for (int subjectIndex = 0; subjectIndex != scoreSheet.getScores()[index].length; subjectIndex++) {
                System.out.printf("%-12s", scoreSheet.getScores()[index][subjectIndex]);
            }
            System.out.printf("%15.2f",scoreSheet.average()[index]);
            System.out.printf("%15d%n",scoreSheet.position(scoreSheet.average())[index]);
        }
        System.out.print("==========================================================\n");
        System.out.println("SUBJECT SUMMARY");


    }
    public static String saving() {
        return """
                Saving  >>>>>>>>>>>>>>>>>>>
                Saved successfully

                """;
    }
}
