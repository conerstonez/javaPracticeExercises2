package DietelChapter7.KnightTour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class chessBoardTest {

    public ChessBoard chessBoard;

    @BeforeEach
    void setUp() {
        chessBoard = new ChessBoard(2,2);
    }

    @Test
    void chessBoardObjectExists() {
        assertNotNull(chessBoard);
    }


}
