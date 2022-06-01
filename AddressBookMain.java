package com.bridgelabz.Java_Day9.addressbook;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program.");
        int userSelection = 0;
        while(userSelection != 5){
            UserInterface ui = UserInterface.getUserInterfaceInstance();
            AddressBookMain main = new AddressBookMain();
            userSelection = ui.showMainMenu();
            main.handleUserSelection(userSelection);
        }
    }

    public void handleUserSelection(int userSelection){
        UserInterface ui = UserInterface.getUserInterfaceInstance();
        AddressBook addressBook = AddressBook.getAddressBookInstance();
        Scanner sc = new Scanner(System.in);
        switch (userSelection){
            case 1:
                Contact contact = ui.createContact();
                addressBook.add(contact);
                System.out.println("Contact Added!");
                break;
            case 2:
                System.out.println("Enter first-name to edit contact:");
                String firstName = sc.nextLine();
                Contact contact1 = addressBook.getContact(firstName);
                if(addressBook.getContactList().contains(contact1)){
                    addressBook.remove(contact1);
                    addressBook.add(ui.createContact());
                    System.out.println("Contact updated successfully!");
                }else {
                    System.out.println("No contact found!");
                }
                break;
            case 3:
                System.out.println("Enter first-name to remove contact:");
                String name = sc.nextLine();
                Contact contact2 = addressBook.getContact(name);
                if (addressBook.getContactList().contains(contact2)){
                    addressBook.remove(contact2);
                    System.out.println("Contact deleted!");
                }else {
                    System.out.println("Contact not found!");
                }
                break;
            case 4:
                if(addressBook.getContactList().size() !=0){
                    ui.printContacts(addressBook.getContactList());
                }else {
                    System.out.println("No contact found!");
                }
                break;
        }
    }
}
