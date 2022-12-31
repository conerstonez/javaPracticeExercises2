package TicTacToe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static TicTacToe.PlayConstants.*;
import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {

    private TicTacToeGame ticTacToe;
    private Gameboard gameboard;

    @BeforeEach
    void setUp() {
        ticTacToe = new TicTacToeGame();
        gameboard = new Gameboard();
    }

    @Test
    void ticTacToeObjectExist() {
        assertNotNull(ticTacToe);
    }

    @Test
    void ticTacToeGameHasPlayers() {
        ticTacToe.addPlayer(new Player("shae"), 1);
        ticTacToe.addPlayer(new Player("kule"), 2);
        assertEquals(2, ticTacToe.getPlayers().length);
    }

    @Test
    void gameCanBePlayed() {
        Player p = new Player("Kunle");
        ticTacToe.addPlayer(p, 1);
        ticTacToe.play(p, 5);
        assertEquals(X, gameboard.getGameBoard()[1][1]);
    }

    @Test
    void playerOnePlaysXAndPlayerTwoPlaysO() {
        Player player1 = new Player("Player1");
        Player pLayer2 = new Player("Player2");
        ticTacToe.addPlayer(player1, 1);
        ticTacToe.addPlayer(pLayer2, 2);
        ticTacToe.play(player1, 3);
        assertEquals(X, gameboard.getGameBoard()[0][2]);
        ticTacToe.play(pLayer2, 5);
        assertEquals(O, gameboard.getGameBoard()[1][1]);
    }

    @Test
    void playerMustPlayOnEmptySquare() {
        Player p = new Player("Lola");
        Player j = new Player("Yaounde");
        ticTacToe.play(p, 4);
//        ticTacToe.play(j, 4, O);
//        assertEquals(X, Gameboard.getGameBoard()[1][0]);
        assertThrows(IllegalArgumentException.class, () -> ticTacToe.play(j, 4));
    }

    @Test
    void playerCannotEnterAPositionGreaterThanNineOrLesserThanZero() {
        Player p = new Player("Lola");
        assertThrows(IndexOutOfBoundsException.class, () -> ticTacToe.play(p, 10));
    }

    @Test
    void threeConstantsInARowWinsTheGame() {
        Player p = new Player("PP");
        ticTacToe.addPlayer(p, 1);
        ticTacToe.play(p, 1);ticTacToe.play(p, 2);ticTacToe.play(p, 3);
        assertTrue(ticTacToe.win());
    }
}
