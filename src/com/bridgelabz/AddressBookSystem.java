package com.bridgelabz;


import java.util.ArrayList;
import java.util.Scanner;

// creating class AddressBook
public class AddressBookSystem {


    static ArrayList<Contacts> contactsDetails = new ArrayList();
    static Scanner scanner = new Scanner(System.in);
    static Contacts contacts = new Contacts();

    public void addDetails() {

        System.out.println("Enter First Name");
        contacts.setFirstName(scanner.nextLine());
        System.out.println("Enter last Name");
        contacts.setLastName(scanner.nextLine());
        System.out.println("Enter Email");
        contacts.setEmail(scanner.nextLine());
        System.out.println("Enter Address");
        contacts.setAddress(scanner.nextLine());
        System.out.println("Enter Contact No");
        contacts.setContactNo(scanner.nextLine());
        System.out.println("Enter City");
        contacts.setCity(scanner.nextLine());
        System.out.println("Enter State");
        contacts.setState(scanner.nextLine());
        System.out.println("Enter Zip Code");
        contacts.setZipCode(scanner.nextLine());
        contactsDetails.add(contacts);
    }

    public void DisplayDetails() {
        for (Contacts contactsDetail : contactsDetails) {
            System.out.println(contactsDetail);
        }
    }

    public void editDetails(String FirstNameSearch) {
        for (Contacts contacts : contactsDetails) {
            System.out.println("First Name " + contacts.getFirstName());
            if (contacts.getFirstName().equals(FirstNameSearch)) {
                System.out.println("Enter a No For Edit the Details");
                System.out.println("""
                        1 =  First Name
                        2 = Last Name
                        3 = Email
                        4 = Contact No
                        5 = Address
                        6 = City
                        7 = State
                        8 = Zip Code""");
                int edit = scanner.nextInt();
                System.out.println("Enter value For Update");
                switch (edit) {
                    case 1 -> {
                        String UpdateFirstname = scanner.next();
                        contacts.setFirstName(UpdateFirstname);
                    }
                    case 2 -> {
                        String UpdateLastName = scanner.next();
                        contacts.setLastName(UpdateLastName);
                    }
                    case 3 -> {
                        String UpdateEmail = scanner.next();
                        contacts.setEmail(UpdateEmail);
                    }
                    case 4 -> {
                        String UpdateContactNo = scanner.next();
                        contacts.setContactNo(UpdateContactNo);
                    }
                    case 5 -> {
                        String UpdateAddress = scanner.next();
                        contacts.setAddress(UpdateAddress);
                    }
                    case 6 -> {
                        String UpdateCity = scanner.next();
                        contacts.setCity(UpdateCity);
                    }
                    case 7 -> {
                        String UpdateState = scanner.next();
                        contacts.setState(UpdateState);
                    }
                    case 8 -> {
                        String UpdateZipCode = scanner.next();
                        contacts.setZipCode(UpdateZipCode);
                    }
                    default -> System.out.println("Enter Correct No");
                }
            } else {
                System.out.println("Enter Correct Name");
            }
        }
    }
}