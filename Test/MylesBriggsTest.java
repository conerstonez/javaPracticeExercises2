import MylesBriggs.UserProfile;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MylesBriggsTest {

    @Test
    void setNameTest() {
        UserProfile mb = new UserProfile("Tola", "Yemi", 45);
        mb.setFirstName("Kunle");
        assertEquals("Kunle Yemi", mb.getName());
        mb.setLastName("Okafor");
        assertEquals("Kunle Okafor", mb.getName());
    }

    @Test
    void setAgeTest() {
        UserProfile mb = new UserProfile("Tola", "Ogunde", 45);
        mb.setAge(45);
        assertEquals(45, mb.getAge());
    }

}