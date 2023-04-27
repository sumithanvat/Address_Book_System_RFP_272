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



        addressbooksystem.addDetails();
        addressbooksystem.DisplayDetails();
        System.out.println("Enter First Name for which you want to modify info: ");
        String fName = scanner.nextLine();
        addressbooksystem.editDetails(fName);
        System.out.println("After Edit Details Are");
        addressbooksystem.DisplayDetails();
        System.out.println("Enter First Name to delete");


    }
}