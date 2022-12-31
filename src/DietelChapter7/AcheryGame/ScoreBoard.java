package DietelChapter7.AcheryGame;

import java.util.ArrayList;

public class ScoreBoard {
    private int[][] scores;

    public ScoreBoard(int row, int col) {
        this.scores = new int[row][col];
    }

    public void setScores(int round, int playerIndex, int score) {
        scores[round][playerIndex] = score;
    }

    public int[][] getScores() {
        return scores;
    }

    public int[] playersTotal() {

        return null;
    }
}
