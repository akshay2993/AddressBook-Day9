package com.bridgelabz.Java_Day9.addressbook;

public class Contact {

    String firstName, lastName;
    String address;
    String city, state;
    String email;
    long zip, phoneNumber;

    @Override
    public String toString() {
        return "Contact{" +
                "Name='" + firstName +" "+ lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", zip=" + zip +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
