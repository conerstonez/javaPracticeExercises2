package DietelChapter7.TurtleGraphics;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SketchPadTest {

    @Test
    void sketchpadCreationTest() {
        SketchPad sp = new SketchPad(2,2);
        assertArrayEquals(new int[][]{{0,0}, {0,0}}, sp.getSketchPad());
    }

    @Test
    void addElementsIntoSketchPad() {
        SketchPad sp = new SketchPad(3, 3);
        sp.addElements(0, 2, 1);
        sp.addElements(1, 0, 1);
        sp.addElements(2, 2, 1);
        assertArrayEquals(new int[][]{{0,0,1},{1,0,0},{0,0,1}}, sp.getSketchPad());
    }

    @Test
    void graphicalDisplayTest() {
        SketchPad sp = new SketchPad(3, 3);
        sp.addElements(0, 2, 1);
        sp.addElements(1, 0, 1);
        sp.addElements(2, 2, 1);
        System.out.println(Arrays.deepToString(sp.arrayGraphicInterpretation()));
        assertArrayEquals(new String[][]{{" "," ","*"},{"*"," "," "},{" "," ","*"}}, sp.arrayGraphicInterpretation());
    }
}