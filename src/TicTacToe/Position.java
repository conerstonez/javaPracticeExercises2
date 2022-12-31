package TicTacToe;

import java.util.Objects;

public class Position {

    private static int xCoordinate;
    private static int yCoordinate;

    public Position(int position) {
        setPlayPosition(position);
    }

    private static void setPlayPosition(int position) {
        if (Objects.equals(position, 1)) {
            xCoordinate = 0;
            yCoordinate = 0;
        } else if (Objects.equals(position, 2)) {
            xCoordinate = 0;
            yCoordinate = 1;
        } else if (Objects.equals(position, 3)) {
            xCoordinate = 0;
            yCoordinate = 2;
        } else if (Objects.equals(position, 4)) {
            xCoordinate = 1;
            yCoordinate = 0;
        } else if (Objects.equals(position, 5)) {
            xCoordinate = 1;
            yCoordinate = 1;
        } else if (Objects.equals(position, 6)) {
            xCoordinate = 1;
            yCoordinate = 2;
        } else if (Objects.equals(position, 7)) {
            xCoordinate = 2;
            yCoordinate = 0;
        } else if (Objects.equals(position, 8)) {
            xCoordinate = 2;
            yCoordinate = 1;
        } else if (Objects.equals(position, 9)) {
            xCoordinate = 2;
            yCoordinate = 2;
        }
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

}
