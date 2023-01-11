import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTest {

    @Test
    void returnsTwentyFourHourTime(){
        Time time = new Time(5, 35, 45);
        assertEquals(time.getTime(), "5: 35: 45");
    }

    @Test
    void setTimeTest(){
        Time time = new Time(0,0,0);
        time.setHour(4);
        time.setMinute(25);
        time.setSecond(32);
        assertEquals("4: 25: 32", time.getTime());
    }
}
