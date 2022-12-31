package phonebookTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import phonebook.Contact;
import phonebook.Phonebook;

import static org.junit.jupiter.api.Assertions.*;

public class phonebookTest {

    private Phonebook phonebook;

    @BeforeEach
    void setUp() {
        phonebook = new Phonebook();
    }

    @Test
    void phonebookHasAListOfContacts() {
        assertNotNull(phonebook.getContacts());
    }

    @Test
    void contactsCanBeAddedToContactList() {
        phonebook.addContact(new Contact("Miles", "977622", "", ""));
        assertEquals(1, phonebook.getContacts().size());
    }


    @Test
    void findContactByName() {
        phonebook.addContact(new Contact("Miles", "977622", "", ""));
        phonebook.addContact(new Contact("Gary", "566454"));
        assertEquals(new Contact("Miles", "977622", "", ""), phonebook.findContactByName("Miles"));
    }

    @Test
    void findingContactThatDoesNotExistThrowsException() {
        phonebook.addContact(new Contact("Miles", "977622", "", ""));
        phonebook.addContact(new Contact("Gary", "566454"));
        assertThrows(Exception.class, ()-> phonebook.findContactByName("Comfort"));
    }

    @Test
    void contactCanBeDeletedFromContactList() {
        phonebook.addContact(new Contact("Miles", "977622", "", ""));
        phonebook.addContact(new Contact("Gary", "566454"));
        assertEquals(2, phonebook.getContacts().size());
        phonebook.deleteContact("Miles");
        assertEquals(1, phonebook.getContacts().size());
    }

    @Test
    void findContactByPhoneNumber() {
        phonebook.addContact(new Contact("Miles", "977622", "", ""));
        phonebook.addContact(new Contact("Gary", "566454"));
        assertEquals(new Contact("Miles", "977622", "", ""), phonebook.findContactByPhoneNumber("977622"));
    }

    @Test
    void contactPhoneNumberUpdate() {
        phonebook.addContact(new Contact("Miles", "977622", "", ""));
        phonebook.findContactByName("Miles").addPhoneNumbers("544677");
        assertEquals(new Contact("Miles", "977622, 544677", "", ""), phonebook.getContacts().get(0));
    }

    @Test
    void contactEmailUpdate() {
        phonebook.addContact(new Contact("Trevor", "566777", "kentberg@gmail.com", "Fortran road"));
        phonebook.addContact(new Contact("Miles", "977622", "", ""));
        phonebook.findContactByName("Trevor").setEmail("trevorSaliu@mail");
        assertEquals(new Contact("Trevor", "566777", "trevorSaliu@mail", "Fortran road"), phonebook.getContacts().get(0));
        phonebook.findContactByName("Trevor").setLastName("Saliu");
        assertEquals(new Contact("Trevor", "Saliu","566777", "trevorSaliu@mail", "Fortran road"), phonebook.getContacts().get(0));

    }

    @Test
    void duplicatedContactMerge() {

    }

}
