package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

// creating class AddressBook
public class AddressBook { // creating class AddressBook

    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact1) {
        this.contacts.add(contact1);
    }

    public List<Contact> getContacts() {
        return this.contacts;
    }
}
