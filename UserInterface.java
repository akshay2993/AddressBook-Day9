package com.bridgelabz.Java_Day9.addressbook;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private static UserInterface userInterfaceInstance;

    private UserInterface() {

    }

    public static UserInterface getUserInterfaceInstance() {
        if (userInterfaceInstance == null){
            userInterfaceInstance = new UserInterface();
        }
        return userInterfaceInstance;
    }

    public int showMainMenu() {
        System.out.println("Enter your choice:\n1.Add Contact\n2.Edit contact\n3.Delete contact\n4.View Contact List\n5.Exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        return choice;
    }

    public Contact createContact() {
        Contact contact = new Contact();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name:");
        contact.firstName = sc.nextLine();
        System.out.println("Enter Last Name:");
        contact.lastName = sc.nextLine();
        System.out.println("Enter Address:");
        contact.address = sc.nextLine();
        System.out.println("Enter City:");
        contact.city = sc.nextLine();
        System.out.println("Enter State:");
        contact.state = sc.nextLine();
        System.out.println("Enter Zip code:");
        contact.zip = sc.nextLong();
        System.out.println("Enter Phone Number:");
        contact.phoneNumber = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter E-mail id:");
        contact.city = sc.nextLine();

        return contact;
    }

    public void printContacts(List<Contact> contactList) {
        if(!(contactList.isEmpty())){
            for (Contact contact : contactList) {
                System.out.println(contact);
            }
            System.out.println("\n");
        }else {
            System.out.println("No contact found!");
        }
    }

}
