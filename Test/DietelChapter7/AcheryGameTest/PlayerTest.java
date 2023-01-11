package DietelChapter7.AcheryGameTest;

import DietelChapter7.AcheryGame.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    Player player;

    @BeforeEach
    void setUp() {
        player = new Player("Bola");
    }

    @Test
    void playerObjectExistTest() {
        assertNotNull(player);
    }

    @Test
    void playerInformationTest() {
        assertEquals("Bola", player.getPlayerName());
    }

    @Test
    void createNewPlayer() {
        new Player("Tunde");
        assertEquals("Tunde", player.getPlayerName());
    }

}
