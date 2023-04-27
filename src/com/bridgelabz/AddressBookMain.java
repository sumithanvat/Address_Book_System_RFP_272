package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;
/*
Creating class address book main to operate addressbook
 */

public class AddressBookMain {
    // main method started
    public static void main(String[] args) {


        // creating object addressbook
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
// using while loop
        while (!quit) {

            System.out.println("1. Add contact");
            System.out.println("2. Remove contact");
            System.out.println("3. Display contacts");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
// using switch case to take input
            switch (choice) {
                case 1:
                    System.out.print("Enter first name: ");
                    String firstName = scanner.next();
                    System.out.print("Enter last name: ");
                    String lastName = scanner.next();
                    System.out.print("Enter address: ");
                    String address = scanner.next();
                    System.out.print("Enter city: ");
                    String city = scanner.next();
                    System.out.print("Enter state: ");
                    String state = scanner.next();
                    System.out.print("Enter zip: ");
                    String zip = scanner.next();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.next();
                    System.out.print("Enter email: ");
                    String email = scanner.next();
                    Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
                    addressBook.addContact(contact);
                    break;
                case 2:
                    addressBook.displayContacts();
                    System.out.print("Enter index of contact to remove: ");
                    int index = scanner.nextInt();
                    addressBook.removeContact(index);
                    break;
                case 3:
                    addressBook.displayContacts();
                    break;
                case 4:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }
}



