package com.bridgelabz;

import java.util.ArrayList;

// creating class AddressBook
public class AddressBook {

    private Contact[] contacts;
    private int numContacts;

    public AddressBook() {
        contacts = new Contact[100];
        numContacts = 0;
    }

    public void addContact(Contact contact) {
        if (numContacts < contacts.length) {
            contacts[numContacts] = contact;
            numContacts++;
        } else {
            System.out.println("Address book is full. Cannot add more contacts.");
        }
    }

    public void removeContact(int index) {
        if (index >= 0 && index < numContacts) {
            for (int i = index; i < numContacts - 1; i++) {
                contacts[i] = contacts[i + 1];
            }
            contacts[numContacts - 1] = null;
            numContacts--;
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void displayContacts() {
        if (numContacts == 0) {
            System.out.println("No contacts.");
        } else {
            System.out.println("Contacts:");
            for (int i = 0; i < numContacts; i++) {
                System.out.println(i + ". " + contacts[i]);
            }
        }
    }
}

