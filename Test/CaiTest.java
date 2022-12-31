import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CaiTest {
    @Test
    void generateNumbersTest(){
      Cai cai = new Cai();
      double product = cai.generateNUmber(4, 5);
      assertEquals(20, product);
    }
    @Test
    void answerCheckTest(){
        Cai cai = new Cai();

    }
}
