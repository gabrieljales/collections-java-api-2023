package main.java.sandbox.set.search.exercise001;

import java.util.HashSet;
import java.util.Set;

public class ContactsBook {
    private Set<Contact> contactSet;

    public ContactsBook() {
        this.contactSet = new HashSet<>();
    }

    public void addContact(String name, String phoneNumber) {
        contactSet.add(new Contact(name, phoneNumber));
    }

    public void showContacts() {
        System.out.println(contactSet);
    }

    public Set<Contact> findAllContactsByName(String name) {
        Set<Contact> contactsToReturn = new HashSet<>();

        if(!contactSet.isEmpty()) {
            for (Contact contact: contactSet) {
                if (contact.getName().startsWith(name)) {
                    contactsToReturn.add(contact);
                }
            }
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }

        return contactsToReturn;
    }

    public Contact findContactByName(String name) {
        if (!contactSet.isEmpty()) {
            Contact contactToReturn = null;

            for (Contact contact: contactSet) {
                if (contact.getName().equalsIgnoreCase(name)) {
                    contactToReturn = contact;
                    break;
                }
            }

            return contactToReturn;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public void updateContactNumber(String name, String newPhoneNumber) {
        Contact contact = findContactByName(name);

        contact.setPhoneNumber(newPhoneNumber);
    }
}
