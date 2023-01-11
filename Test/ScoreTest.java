import DietelChapter7.ScoreSheet.ScoreSheet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ScoreTest {

    @Test
    void addStudentNameTest() {
        ScoreSheet scores = new ScoreSheet(2, 0);
        scores.addStudentName(0, "Gina");
        scores.addStudentName(1, "Tina");
        assertArrayEquals(new String[]{"Gina", "Tina"}, scores.getName());
    }

    @Test
    void addSubjectTitleTest(){
        ScoreSheet scores = new ScoreSheet(0, 3);
        scores.addSubjectTitle(0, "Chemistry");
        scores.addSubjectTitle(1, "History");
        scores.addSubjectTitle(2, "Ecology");
        assertArrayEquals(new String[]{"Chemistry","History","Ecology"}, scores.getSubject());
    }

    @Test
    void inputScoreTest(){
        ScoreSheet scores = new ScoreSheet(2, 2);
        scores.inputScore(0, 0, 45);
        scores.inputScore(0,1,67);
        scores.inputScore(1, 0, 76);
        scores.inputScore(1, 1, 88);
        assertArrayEquals(new int[][]{{45, 67},{76, 88}},scores.getScores());
    }

    @Test
    void studentAverageTest(){
        ScoreSheet scores = new ScoreSheet(2, 3);
        scores.inputScore(0, 0, 60);
        scores.inputScore(0,1,40);
        scores.inputScore(0, 2, 50);
        scores.inputScore(1, 0, 10);
        scores.inputScore(1, 1, 10);
        scores.inputScore(1, 2, 10);
        assertArrayEquals(new double[]{50.0, 10.0} , scores.average());
    }

    @Test
    void studentPositionTest(){
        ScoreSheet scores = new ScoreSheet(5, 3);
        scores.inputScore(0, 0, 10);
        scores.inputScore(0, 1, 10);
        scores.inputScore(0, 2, 10);
        scores.inputScore(1, 0, 60);
        scores.inputScore(1, 1, 60);
        scores.inputScore(1, 2, 60);
        scores.inputScore(2, 0, 75);
        scores.inputScore(2, 1, 75);
        scores.inputScore(2, 2, 75);
        scores.inputScore(3, 0, 40);
        scores.inputScore(3, 1, 40);
        scores.inputScore(3, 2, 40);
        scores.inputScore(4, 0, 87);
        scores.inputScore(4, 1, 87);
        scores.inputScore(4, 2, 87);
        assertArrayEquals(new int[]{5, 3, 2, 4, 1}, scores.position(scores.average()));
    }
}
