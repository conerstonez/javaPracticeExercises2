package DietelChapter7.AcheryGameTest;

import DietelChapter7.AcheryGame.ArcheryGame;
import DietelChapter7.AcheryGame.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    ArcheryGame ofa;

    @BeforeEach
    void setUp() {
        ofa = new ArcheryGame("Player 1", 3);
    }

    @Test
    void playersCanBeAddedToGame() {
        ofa.addPlayers(new Player("Yemi"));
        System.out.println(ofa.getScore().length);
        assertEquals(2, ofa.getPlayers().size());

    }

    @Test
    void gamePlay() {
        ofa.play(ofa.getPlayers().get(0), 0, 0);
        assertTrue(ofa.getScore()[0][0] > 0);
    }

    @Test
    void getPlayerName() {
        assertEquals("Player 1", ofa.getPlayers().get(0).getPlayerName());
    }


}
