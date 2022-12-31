package DietelChapter7.TurtleGraphics;

public class SketchPad {
    private int[][] sketchPad;
    private String[][] graphicalSketchPad;

    public SketchPad(int row, int col){
        sketchPad = new int[row][col];
        graphicalSketchPad = new String[row][col];
    }

    public void addElements(int row, int col, int input) {
        sketchPad[row][col] = input;
    }

    public String[][] arrayGraphicInterpretation(){
        for (int rowIndex = 0; rowIndex != sketchPad.length; rowIndex++) {
            for (int colIndex = 0; colIndex !=sketchPad[rowIndex].length; colIndex++) {
                if (sketchPad[rowIndex][colIndex] == 0) {
                    graphicalSketchPad[rowIndex][colIndex] = " ";
                }
                else if (sketchPad[rowIndex][colIndex] == 1) {
                    graphicalSketchPad[rowIndex][colIndex] = "*";
                }
            }
        }
        return graphicalSketchPad;
    }
    public int[][] getSketchPad() {
        return sketchPad;
    }
}
