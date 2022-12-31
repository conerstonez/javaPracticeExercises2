package TicTacToe;

import static TicTacToe.PlayConstants.*;

public class Player {

    private int playerId;
    private final String name;
    private static Gameboard gameboard = new Gameboard();

    public Player (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void play(PlayConstants playConstants, int position) throws IllegalArgumentException {
        write(playConstants, position);
    }

    private static void write(PlayConstants playConstants, int position) {
        Position p = ValidatePosition(position);
        gameboard.getGameBoard()[p.getxCoordinate()][p.getyCoordinate()] = playConstants;
    }

    private static Position ValidatePosition(int position) {
        if (position > 9) throw  new IndexOutOfBoundsException("Position ranges from 1 to 9");
        Position p = new Position(position);
        if (gameboard.getGameBoard()[p.getxCoordinate()][p.getyCoordinate()] != EMPTY)
            throw new IllegalArgumentException("You can only play on empty squares");
        return p;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }

}
