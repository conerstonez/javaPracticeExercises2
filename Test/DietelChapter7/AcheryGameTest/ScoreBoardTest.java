package DietelChapter7.AcheryGameTest;

import DietelChapter7.AcheryGame.ArcheryGame;
import DietelChapter7.AcheryGame.Player;
import DietelChapter7.AcheryGame.ScoreBoard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ScoreBoardTest {

    ArcheryGame ofa;
    ScoreBoard scoreBoard;
    @BeforeEach
    void setUp() {
        ofa = new ArcheryGame("Kunle", 3);
        ofa.addPlayers(new Player("Vera"));
        ofa.addPlayers(new Player("Binuyo"));
        scoreBoard = new ScoreBoard(ofa.getScore().length, ofa.getPlayers().size());
    }

    @Test
    void scoreBoardObjectExistTest() {
        assertNotNull(scoreBoard);
    }

    @Test
    void storesGameScores() {
        scoreBoard.setScores(0, ofa.getPlayers().indexOf(ofa.getPlayers().get(0)), ofa.getPlayers().get(0).play());
        scoreBoard.setScores(0, ofa.getPlayers().indexOf(ofa.getPlayers().get(1)), ofa.getPlayers().get(1).play());
        scoreBoard.setScores(0, ofa.getPlayers().indexOf(ofa.getPlayers().get(2)), ofa.getPlayers().get(2).play());
        scoreBoard.setScores(1, ofa.getPlayers().indexOf(ofa.getPlayers().get(0)), ofa.getPlayers().get(0).play());
        scoreBoard.setScores(1, ofa.getPlayers().indexOf(ofa.getPlayers().get(1)), ofa.getPlayers().get(1).play());
        scoreBoard.setScores(1, ofa.getPlayers().indexOf(ofa.getPlayers().get(2)), ofa.getPlayers().get(2).play());
        ofa.play(ofa.getPlayers().get(0), 1, 1);
        System.out.println((scoreBoard.getScores().length));
        System.out.println(Arrays.deepToString(ofa.getScore()));
        assertTrue(ofa.getScore()[0][0] > 0);
    }
}
