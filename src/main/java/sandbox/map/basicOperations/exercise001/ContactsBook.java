package main.java.sandbox.map.basicOperations.exercise001;

import java.util.HashMap;
import java.util.Map;

public class ContactsBook {
    private Map<String, String> contactsBookMap;

    public ContactsBook() {
        this.contactsBookMap = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        contactsBookMap.put(name, phone);
    }

    public void removeContact(String name) {
        if  (!contactsBookMap.isEmpty()) {
            contactsBookMap.remove(name);
        } else {
            throw new RuntimeException("O Map está vazio!");
        }
    }

    public void showAllContacts() {
        System.out.println(contactsBookMap);
    }

    public String findByName(String name) {
        if (!contactsBookMap.isEmpty()) {
            return contactsBookMap.get(name);
        } else {
            throw new RuntimeException("O Map está vazio!");
        }
    }
}
