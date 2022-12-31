package phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Phonebook {
    private List<Contact> contacts = new ArrayList<>();
    public List<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public Contact findContactByName(String name) {
        for (Contact contact : contacts) {
            if (Objects.equals(contact.getFirstName(), name)) return contact;
            else throw new NullPointerException("Name not found");
        }
        return null;
    }

    public Contact findContactByPhoneNumber(String phoneNumber) {
        for (Contact contact : contacts) {
            if (Objects.equals(contact.getPhoneNumbers(), phoneNumber)) return contact;
        }
        return null;
    }

    public void deleteContact(String name) {

        contacts.remove(findContactByName(name));
    }
}
