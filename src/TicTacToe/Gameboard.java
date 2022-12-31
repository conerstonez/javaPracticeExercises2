package TicTacToe;

import java.util.Arrays;
import java.util.Objects;

import static TicTacToe.PlayConstants.*;

public class Gameboard {

    private PlayConstants[][] gameBoard;

    public Gameboard() {
        gameBoard = new PlayConstants[3][3];
        fill(gameBoard);
    }

    public PlayConstants[][] getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(PlayConstants[][] gameBoard) {gameBoard = gameBoard;
    }

    private static void fill(PlayConstants[][] array) {
        for (int i = 0; i != array.length; i++) {
            Arrays.fill(array[i], EMPTY);
        }
    }

}
