package main.java.sandbox.set.search.exercise001;

public class Main {
    public static void main(String[] args) {
        ContactsBook contactsBook = new ContactsBook();

        contactsBook.addContact("Gabriel", "87 98778-7987");
        contactsBook.addContact("Maria", "89 98318-5602");
        contactsBook.addContact("João", "82 98378-1309");

        contactsBook.showContacts();

        System.out.println("Contatos encontrados: " + contactsBook.findAllContactsByName("Gabriel"));

        contactsBook.updateContactNumber("Maria", "85 98318-5602");
        contactsBook.showContacts();
    }
}
