package com.addressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    /**
     *
     * Approaching as a OOps method
     * Creating Field
     */
    public static String firstName;
    public static String lastName;
    public static String address;
    public static String city;
    public static String state;
    public static int zipCode;
    public static long phoneNumber;
    public static String email;

    // Declaration
    public AddressBook(String firstName, String lastName, String address,String city,String state,int zipCode,long phoneNumber,String email){
        this.firstName = firstName;
        this.lastName =lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    //Method for addContact
    public void addContact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        firstName = sc.nextLine();
        System.out.println("Enter Last Name");
        lastName = sc.nextLine();
        System.out.println("Enter Address");
        address = sc.nextLine();
        System.out.println("Enter City");
        city = sc.nextLine();
        System.out.println("Enter State");
        state = sc.nextLine();
        System.out.println("Enter Zipcode");
        zipCode = sc.nextInt();
        System.out.println("Enter Phone Number");
        phoneNumber = Long.parseLong(sc.next());
        System.out.println("Enter Email");
        email = sc.next();
    }

    //Method for Displaying OutComes
    public String toString(){
        return ("\nfirst name:- " +firstName+"\nlast name:- "+ lastName+ "\nAddress:- "+address+"\ncity:- "+city+"\nstate:- " +state+"\nzip code:- "+zipCode+"\nphone number:- "+phoneNumber+"\nemail:- "+email);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");
        ArrayList<AddressBook> contacts = new ArrayList<>();
        AddressBook book = new AddressBook(firstName, lastName, address, city, state, zipCode, phoneNumber, email);
        book.addContact();
        book.toString();
        contacts.add(book);
        System.out.println(contacts.get(0));
    }
}
