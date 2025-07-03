package by.java_masterclass_tasks;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {

    private String phoneNumber;
    private List<Contact> contacts;

    public MobilePhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.contacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        return this.contacts.add(contact);
    }

    public boolean updateContact(Contact contact) {
        int index = this.contacts.indexOf(contact);
        if (index == -1) {
            return false;
        }
        this.contacts.set(index, contact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        return this.contacts.remove(contact);
    }

    public int findContact(Contact contact) {
        return this.contacts.indexOf(contact);
    }

    public int findContact(String name) {
        return this.contacts
                .stream()
                .map(Contact::getName)
                .anyMatch(n -> n.equals(name)) ? 0 : -1;

    }

    public Contact queryContact(String name) {
        return this.contacts
                .stream()
                .filter(contact -> contact.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public void printContacts() {
        for (Contact contact : this.contacts) {
            System.out.println(contact);
        }
    }
}
