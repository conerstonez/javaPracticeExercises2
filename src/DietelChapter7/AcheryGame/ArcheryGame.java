package DietelChapter7.AcheryGame;


import java.util.ArrayList;

public class ArcheryGame {
    private ArrayList<Player> players;
    private ScoreBoard scoreBoard;
    private int gameRounds;
    private int score;


    public ArcheryGame(String name, int rounds) {
        players = new ArrayList<>();
        players.add(new Player(name));
        gameRounds = rounds;
        scoreBoard = new ScoreBoard(players.size(), rounds);
    }

    public void addPlayers(Player player) {
        players.add(player);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void createScoreBoard(ScoreBoard scoreBoard) {
        this.scoreBoard = scoreBoard;
    }

    public void play(Player player, int round, int playerIndex) {
        score = player.play();
        scoreBoard.setScores(round, playerIndex, score);
    }

    public int[][] getScore() {
        return scoreBoard.getScores();
    }

}

