package main.java.sandbox.map.basicOperations.exercise001;

public class Main {
    public static void main(String[] args) {
        ContactsBook contactsBook = new ContactsBook();

        contactsBook.addContact("Gabriel", "84 98787-8980");
        contactsBook.addContact("João", "81 92710-3940");
        contactsBook.addContact("Maria", "89 93460-8323");
        // O número (valor) de Gabriel (chave) será sobrescrito!
        contactsBook.addContact("Gabriel", "86 99707-2940");

        contactsBook.showAllContacts();

        contactsBook.removeContact("João");

        System.out.println("Número de telefone da Maria: " + contactsBook.findByName("Maria"));
        contactsBook.showAllContacts();
    }
}
