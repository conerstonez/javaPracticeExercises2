import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test       
    void setAccountNameTest(){
        Account newAccount = new Account();
        newAccount.setName("Tola");
//        String input = "Tola";
        assertEquals("Tola", newAccount.getName());
    }
    @Test
    void reverseNameTest(){
        Account newAccount = new Account();
        newAccount.setName("Jerry");
        assertEquals("yrreJ", newAccount.reverseName());
    }

}
