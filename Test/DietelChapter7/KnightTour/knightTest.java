package DietelChapter7.KnightTour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class knightTest {

    private Knight knight;

    @BeforeEach
    void setUp() {
        knight = new Knight();
    }

    @Test
    void knightObjectExists() {
        assertNotNull(knight);
    }

    @Test
    void KnightPosition() {
        knight.setCurrentRow(3);
        knight.setCurrentColumn(4);
        assertEquals(3, knight.getCurrentRow());
        assertEquals(4, knight.getCurrentColumn());
    }

    @Test
    void knightMovement() {
        knight.move(4);
        assertEquals(2, knight.getCurrentRow());
        assertEquals(1, knight.getCurrentColumn());
    }

    @Test
    void knightPossibleMovementChoice() {
        knight.move(3);
        assertEquals(2, knight.getCurrentColumn());
        assertEquals(1, knight.getCurrentRow());
    }

}
