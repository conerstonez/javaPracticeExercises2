package DietelChapter7.TurtleGraphics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static DietelChapter7.TurtleGraphics.Direction.*;
import static DietelChapter7.TurtleGraphics.Pen.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleGraphicsTest {
    Turtle ijapa;

    @BeforeEach
    void setUp() {
        ijapa = new Turtle(0,0,20, 20);
    }

    @Test
    public void turtleExistsTest() {
        assertNotNull(ijapa);
    }

    @Test
    void turtleCanMovePenUpTest() {
        ijapa.setPenPosition(UP);
        assertEquals(UP, ijapa.getPenPosition());
    }

    @Test
    void turleCanMovePenDown() {
        ijapa.setPenPosition(DOWN);
        assertEquals(DOWN, ijapa.getPenPosition());
    }

    @Test
    void turtleTurnRightWhileFacingEastTest() {
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightWhileFacingSouthTest() {
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightWhileFacingWestTest() {
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightWhileFacingNorthTest() {
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertEquals(EAST, ijapa.getCurrentDirection());
    }

    @Test
    void turtleTurnLeftWhileFacingEastTest() {
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingNorthTest() {
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingWestTest() {
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingSouthTest() {
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertEquals(EAST, ijapa.getCurrentDirection());
    }

    @Test
    void forwardMovementFacingEastTest() {
        Assertions.assertEquals(new Position(0, 0), ijapa.getCurrentPosition());
        ijapa.move(5);
        assertEquals(new Position(0, 5), ijapa.getCurrentPosition());
    }

    @Test
    void forwardMovementFacingSouthTest() {
        ijapa.turnRight();
        ijapa.move(10);
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        assertEquals(new Position(10, 0), ijapa.getCurrentPosition());
    }

    @Test
    void forwardMovementFacingNorthTest() {
        ijapa.turnRight();
        ijapa.move(10);
        ijapa.turnRight(); ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.move(5);
        assertEquals(new Position(5, 0), ijapa.getCurrentPosition());
    }

    @Test
    void forwardMovementFacingWestTest() {
        ijapa.move(7);
        assertEquals(new Position(0, 7), ijapa.getCurrentPosition());
        ijapa.turnRight(); ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.move(5);
        assertEquals(new Position(0, 2), ijapa.getCurrentPosition());
    }

    @Test
    void arrayFloorSketchPadTest() {
        ijapa.createSketchPad(new SketchPad(2,2));
        assertArrayEquals(new String[][]{{" "," "}, {" "," "}}, ijapa.getSketchPad());
    }

    @Test
    void turtleShouldNotWriteWhenPenIsUpWhileMovingTest() {
        ijapa.createSketchPad(new SketchPad(5,5));
        ijapa.move(3);
        assertEquals(new Position(0,3), ijapa.getCurrentPosition());
        assertArrayEquals(new String[][]{{" "," "," "," "," "}, {" "," "," "," "," "}, {" "," "," "," "," "},
                {" "," "," "," "," "}, {" "," "," "," "," "}}, ijapa.getSketchPad());
    }

    @Test
    void turtleWritesWhenPenIsDownWhileMovingTest() {
        ijapa.createSketchPad(new SketchPad(5,5));
        ijapa.setPenPosition(DOWN);
        ijapa.move(3);
        assertEquals(new Position(0,3), ijapa.getCurrentPosition());
        assertArrayEquals(new String[][]{{"*","*","*"," "," "}, {" "," "," "," "," "}, {" "," "," "," "," "},
                {" "," "," "," "," "}, {" "," "," "," "," "}}, ijapa.getSketchPad());
    }

    @Test
    void turtleWritesWhenPenIsDownWhileMovingAcrossColumnTest() {
        ijapa.createSketchPad(new SketchPad(5,5));
        ijapa.setPenPosition(DOWN);
        ijapa.turnRight();
        ijapa.move(3);
        assertEquals(new Position(3,0), ijapa.getCurrentPosition());
        assertArrayEquals(new String[][]{{"*"," "," "," "," "}, {"*"," "," "," "," "}, {"*"," "," "," "," "},
                {" "," "," "," "," "}, {" "," "," "," "," "}}, ijapa.getSketchPad());
    }

    @Test
    void turtleDoesNotMoveWhenNumberOfStepsIsOutOfRowBoundTest() {
        ijapa.createSketchPad(new SketchPad(5, 5));
        ijapa.setPenPosition(DOWN);
        ijapa.move(3);
        assertEquals(new Position(0, 3), ijapa.getCurrentPosition());
        assertArrayEquals(new String[][]{{"*", "*", "*", " ", " "}, {" ", " ", " ", " ", " "}, {" ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " "}, {" ", " ", " ", " ", " "}}, ijapa.getSketchPad());
        ijapa.setPenPosition(UP);
        ijapa.move(2);
        assertEquals(new Position(0, 5), ijapa.getCurrentPosition());
        assertArrayEquals(new String[][]{{"*", "*", "*", " ", " "}, {" ", " ", " ", " ", " "}, {" ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " "}, {" ", " ", " ", " ", " "}}, ijapa.getSketchPad());
    }

    @Test
    void turtleDoesNotMoveWhenNumberOfStepsIsOutOfColumnBoundTest() {
        ijapa.createSketchPad(new SketchPad(20,20));
        ijapa.move(15);
        assertEquals(new Position(0, 15), ijapa.getCurrentPosition());
        ijapa.move(3);
        assertEquals(new Position(0, 18), ijapa.getCurrentPosition());

    }

    @Test
    void turtleWorks() {
        ijapa.setPenPosition(DOWN);
        ijapa.move(12);
        assertEquals(new Position(0, 12), ijapa.getCurrentPosition());
        ijapa.turnRight();
        ijapa.move(12);
        assertEquals(new Position(12, 12), ijapa.getCurrentPosition());
        ijapa.turnRight();
        ijapa.move(12);
        assertEquals(new Position(12, 0), ijapa.getCurrentPosition());
        ijapa.turnRight();
        ijapa.move(12);
        assertEquals(new Position(0, 0), ijapa.getCurrentPosition());

        for (int i = 0; i != ijapa.getSketchPad().length; i++) {
            for (int j = 0; j != ijapa.getSketchPad().length; j++) {
                System.out.print(ijapa.getSketchPad()[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
