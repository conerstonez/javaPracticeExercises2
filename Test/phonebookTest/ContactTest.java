package phonebookTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import phonebook.Contact;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactTest {

    private Contact contact;

    @BeforeEach
    void setUp() {
        contact = new Contact("Noah", "55646474");
    }

    @Test
    void contactHasName() {
        String name = "Queen";
        contact.setFirstName(name);
        assertEquals("Queen", contact.getFirstName());
    }

    @Test
    void contactCanHaveMoreThanOnePhoneNumber() {
        String phone1 = "08101661863";
        String phone2 = "09064374326";
        contact.addPhoneNumbers(phone1);
        contact.addPhoneNumbers(phone2);
        assertEquals(2, contact.getPhoneNumbers().size());
    }

    @Test
    void addEmailAddress() {
        String mail = "trtryeye@gmail.com";
        contact.setEmail(mail);
        assertEquals(mail, contact.getEmail());
    }

    @Test
    void addContactAddress() {
        String address = "Forlan street";
        contact.setAddress(address);
        assertEquals(address, contact.getAddress());
    }
}
