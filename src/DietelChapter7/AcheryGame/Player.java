package DietelChapter7.AcheryGame;

import java.util.Random;

public class Player {

    private String name;
    Random random;

    public Player(String name) {
        this.name = name;
        random = new Random();
    }

//    public  void setPlayerName(String name) {
//        this.name = name;
//    }

    public String getPlayerName() {
        return name;
    }

    public int play() {
        return random.nextInt(1, 11);
    }
}
