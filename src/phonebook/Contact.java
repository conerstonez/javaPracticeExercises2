package phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Contact {
    private String firstName;
    private String lastName = "";
    private List<String> phoneNumbers = new ArrayList<>();
    private String email;
    private String address;

    public Contact (String firstName, String phoneNumber) {
        this.firstName = firstName;
        this.phoneNumbers.add(phoneNumber);
    }

    public Contact (String firstName, String phoneNumber, String email) {
        this(firstName, phoneNumber);
        this.email = email;
    }

    public Contact (String firstName, String phoneNumber, String email, String address) {
        this(firstName, phoneNumber, email);
        this.address = address;
    }

    public Contact (String firstName, String lastName, String phoneNumber, String email, String address) {
        this(firstName, phoneNumber, email, address);
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void addPhoneNumbers(String phoneNumber) {
        this.phoneNumbers.add(phoneNumber);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object contact) {
        Contact compared = (Contact) contact;
        return (Objects.equals(compared.firstName, this.firstName) &&
                Objects.equals(compared.address, this.address) &&
                Objects.equals(compared.email, this.email) &&
                Objects.equals(compared.phoneNumbers.toString(), this.phoneNumbers.toString()));
    }


    @Override
    public String toString() {
        return String.format("""
                %s %s
                Phone Numbers: %s
                e-mail: %s
                Address: %s
                """, firstName.toUpperCase(), lastName, phoneNumbers, email, address);
    }
}
