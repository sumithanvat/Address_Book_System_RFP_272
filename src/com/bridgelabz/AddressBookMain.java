package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");

        // with use of contact class we create object and store all the values of contact
        Contacts contacts = new Contacts("Ranjeet", "Kumar", "Ward no 04", "Jabalpur", "MadhyaPradesh","480661", "7777788888","rsingh@gmail.com");

        // printing all the elements of contact
        System.out.println(contacts);
    }
}
