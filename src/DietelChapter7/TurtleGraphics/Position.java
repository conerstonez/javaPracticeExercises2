package DietelChapter7.TurtleGraphics;

public class Position {
    private int column;
    private int row;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public String toString() {
        return "Position{" +
                "column=" + column +
                ", row=" + row +
                '}';
    }
    @Override
    public boolean equals(Object position) {
//        Position compared = (Position) position;
//        return compared.row == this.row && compared.column == this.column;

        if (this == position) return true;
        if (!(position instanceof Position turtlePosition)) return false;
        return getRow() == turtlePosition.getRow() && getColumn() == turtlePosition.getColumn();
     }
}
