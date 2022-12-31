package DietelChapter7.TurtleGraphics;

public class Turtle {
    private Pen pen;
    private Direction direction;
    private Position position;
    private SketchPad sketchPad;

    public Turtle(int xCoordinate, int yCoordinate, int sketchPadRow, int sketchPadColumn) {
        pen = Pen.UP;
        direction = Direction.EAST;
        position = new Position(xCoordinate, yCoordinate);
        sketchPad = new SketchPad(sketchPadRow, sketchPadColumn);
    }

    public void turnRight() {
        switch (direction) {
            case EAST -> face(Direction.SOUTH);
            case SOUTH -> face(Direction.WEST);
            case WEST -> face(Direction.NORTH);
            case NORTH -> face(Direction.EAST);
        }
    }

    public void turnLeft() {
        switch (direction) {
            case EAST -> face(Direction.NORTH);
            case SOUTH -> face(Direction.EAST);
            case WEST -> face(Direction.SOUTH);
            case NORTH -> face(Direction.WEST);
        }
    }

    private void face(Direction direction) {
        this.direction = direction;
    }

    public void move(int numberOfSteps) {
        switch (getCurrentDirection()) {
            case EAST -> {
                if (getSketchPad().length < getCurrentPosition().getColumn() + numberOfSteps)
                    throw new IndexOutOfBoundsException("Invalid move");
                if (getPenPosition().equals(Pen.DOWN)) {
                    write(numberOfSteps);
                }
                else position.setColumn(getCurrentPosition().getColumn() + numberOfSteps);
            }

            case SOUTH -> {
                if (getSketchPad().length < getCurrentPosition().getRow() + numberOfSteps)
                    throw new IndexOutOfBoundsException("Invalid move");
                if (getPenPosition().equals(Pen.DOWN)) {
                    write(numberOfSteps);
                }
                else position.setRow(getCurrentPosition().getRow() + numberOfSteps);
            }

            case WEST -> {
                if (getCurrentPosition().getColumn() - numberOfSteps < 0)
                    throw new IndexOutOfBoundsException("Invalid move");
                if (getPenPosition().equals(Pen.DOWN)) {
                    write(numberOfSteps);
                }
                else position.setColumn(getCurrentPosition().getColumn() - numberOfSteps);
            }

            case NORTH -> {
                if (getCurrentPosition().getRow() - numberOfSteps < 0)
                    throw new IndexOutOfBoundsException("Invalid move");
                if (getPenPosition().equals(Pen.DOWN)) {
                    write(numberOfSteps);
                }
                else position.setRow(getCurrentPosition().getRow() - numberOfSteps);
            }
        }
    }

    private void write(int numberOfSteps) {
        switch (getCurrentDirection()) {
            case EAST -> {
                for (int i = 0; i != numberOfSteps; i++) {
                    sketchPad.addElements(getCurrentPosition().getRow(), getCurrentPosition().getColumn(), 1);
                    getCurrentPosition().setColumn(getCurrentPosition().getColumn() + 1);
                }
            }

            case SOUTH -> {
                for (int i = 0; i != numberOfSteps; i++) {
                    sketchPad.addElements(getCurrentPosition().getRow(), getCurrentPosition().getColumn(), 1);
                    getCurrentPosition().setRow(getCurrentPosition().getRow() + 1);
                }
            }

            case WEST -> {
                for (int i = 0; i != numberOfSteps; i++) {
                    sketchPad.addElements(getCurrentPosition().getRow(), getCurrentPosition().getColumn(), 1);
                    getCurrentPosition().setColumn(getCurrentPosition().getColumn() - 1);
                }
            }

            case NORTH -> {
                for (int i = 0; i != numberOfSteps; i++) {
                    sketchPad.addElements(getCurrentPosition().getRow(), getCurrentPosition().getColumn(), 1);
                    getCurrentPosition().setRow(getCurrentPosition().getRow() - 1);
                }
            }
        }
    }

    public void createSketchPad(SketchPad sketchPad) {
        this.sketchPad = sketchPad;
    }

    public  void setPenPosition(Pen penPosition) {
        pen = penPosition;
    }
    public Pen getPenPosition() {
        return pen;
    }
    public Direction getCurrentDirection() {
        return direction;
    }

    public Position getCurrentPosition() {
        return position;
    }

    public String[][] getSketchPad() {
        return sketchPad.arrayGraphicInterpretation();
    }

}
