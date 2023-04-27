package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

import static com.bridgelabz.AddressBookSystem.scanner;
/*
Creating class address book main to operate addressbook
 */

public class AddressBookMain {
    // main method started
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program!");

        AddressBookSystem addressbooksystem = new AddressBookSystem();

        System.out.println("   ");
        addressbooksystem.addDetails();
        addressbooksystem.DisplayDetails();
        addressbooksystem.editDetails();
        addressbooksystem.deleteContact();
    }
}