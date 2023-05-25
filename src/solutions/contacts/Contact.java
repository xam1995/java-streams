package solutions.contacts;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Step 1: Overriding toString()-method, so we see something else than the hashcode.
    // Step 1: Kevin Bacon, 555-8642
    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + phoneNumber;
    }
}
