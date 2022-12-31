package TicTacToe;

import static TicTacToe.PlayConstants.*;

public class TicTacToeGame {

    private Player[] players;
    private Gameboard gameboard;
    private boolean win;

    public TicTacToeGame() {
        players = new Player[2];
        gameboard = new Gameboard();
    }

    public Player[] getPlayers() {
        return players;
    }

    public void addPlayer(Player player, int playerId) {
        this.players[playerId - 1] = player;
        player.setPlayerId(playerId);
    }

    public void play(Player player, int position) throws IllegalArgumentException{
//        try {
//            player.play(playConstant, position);
//        } catch (IllegalArgumentException e) {
//            System.err.println(e.getMessage());
//        }
        PlayConstants playConstant;
        if (player.getPlayerId() == 1) playConstant = X;
        else playConstant = O;
        player.play(playConstant, position);
    }

    public Gameboard getGameBoard() {
        return gameboard;
    }

    public boolean win() {
        //if () win = true;
        return win;
    }
}
