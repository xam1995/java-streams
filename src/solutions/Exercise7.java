package solutions;

import solutions.contacts.Contact;

import java.util.Comparator;
import java.util.List;

public class Exercise7 {
    public static List<Contact> contacts = List.of(
            new Contact("Tom", "Cruise", "555-1234"),
            new Contact("Melanie", "Griffith", "555-5678"),
            new Contact("Michael", "J. Fox", "555-2468"),
            new Contact("Sigourney", "Weaver", "555-3690"),
            new Contact("Harrison", "Ford", "555-7890"),
            new Contact("Meryl", "Streep", "555-1357"),
            new Contact("Robin", "Williams", "555-9753"),
            new Contact("Sean", "Connery", "555-2468"),
            new Contact("Kathleen", "Turner", "555-0246"),
            new Contact("Kevin", "Bacon", "555-8642"),
            new Contact("Eddie", "Murphy", "555-2468"),
            new Contact("Diane", "Keaton", "555-7890"),
            new Contact("Ally", "Sheedy", "555-9999"),
            new Contact("Rob", "Lowe", "555-1111"),
            new Contact("Andrew", "McCarthy", "555-2222"),
            new Contact("Sylvester", "Stallone", "555-3456"),
            new Contact("Arnold", "Schwarzenegger", "555-7890")
    );
    public static void main(String[] args) {
        // Step 2: Sort list by last name
        List<Contact> sortedContacts = contacts.stream()
                .sorted(
                        Comparator.comparing(Contact::getLastName)
                ) // contact -> contact.getLastName()
                .toList();

        // Print sorted contacts to console
        System.out.println("Sorted by first name:");
        sortedContacts.forEach(System.out::println); // same as: sortedContact -> System.out.println(sortedContact)

        // Step 3: Sort list by last name
        sortedContacts = contacts.stream()
                .sorted(Comparator.comparing(Contact::getFirstName))
                .toList();

        // Print sorted contacts to console
        System.out.println("Sorted by last name:");
        sortedContacts.forEach(System.out::println); // same as: sortedContact -> System.out.println(sortedContact)
    }
}
