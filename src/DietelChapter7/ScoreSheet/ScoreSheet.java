package DietelChapter7.ScoreSheet;

import java.util.Arrays;
import java.util.Iterator;

public class ScoreSheet {
    private double[] average;
    private final int[] positions;
    private String[] names;
    private String[] subject;
    private int[][] scores;


    public ScoreSheet(int NumberOfStudents, int NumberOfSubjects){
        names = new String[NumberOfStudents];
        subject = new String[NumberOfSubjects];
        scores = new int[NumberOfStudents][NumberOfSubjects];
        average = new double[NumberOfStudents];
        positions = new int[NumberOfStudents];
    }

    public String[] getName() {
        return names;
    }

    public void addStudentName(int index, String name) {
        this.names[index] = name;
    }

    public void addSubjectTitle(int index, String subject) {
        this.subject[index] = subject;
    }

    public String[] getSubject() {
        return subject;
    }

    public void inputScore(int row, int col, int score) {
        if (0 > score || score > 100) throw new IllegalArgumentException("Invalid Score");
        this.scores[row][col] = score;
    }

    public int[][] getScores() {
        return scores;
    }

    public double[] average() {
        for (int rowIndex = 0; rowIndex != scores.length; rowIndex++){
            int sum = 0;
            for (int score : scores[rowIndex]){
                sum += score;
                average[rowIndex] = (double) sum / scores[rowIndex].length;
            }
        }
        return average;
    }

    public int[] position(double[] array) {
        for (int index = 0; index != array.length; index++) {
            for (double element : array) {
                if (element >= array[index]) {
                    positions[index] += 1;
                }
            }
        }
        return positions;
    }
}