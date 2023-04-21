package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");

        Contacts contacts = new Contacts("Ranjeet", "Kumar", "Ward no 04", "Jabalpur", "MadhyaPradesh","480661", "7777788888","rsingh@gmail.com");
        System.out.println(contacts.getFirstName());
        System.out.println(contacts.getLastName());
        System.out.println(contacts.getEmail());
        System.out.println(contacts.getAddress());
        System.out.println(contacts.getCity());
        System.out.println(contacts.getState());
        System.out.println(contacts.getContactNo());
        System.out.println(contacts.getZipCode());
    }
}
