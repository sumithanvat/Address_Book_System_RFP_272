package com.bridgelabz;

import java.util.ArrayList;

// creating class AddressBook
public class AddressBook {

        private ArrayList<Contacts> contacts;

        public AddressBook() {
            contacts = new ArrayList<Contacts>();
        }

        public void addContact(Contacts contact) {
            contacts.add(contact);
        }
    }

