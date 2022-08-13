package com.bridgelabz;
import java.util.Scanner;
import java.util.ArrayList;
public class AddressBook {
    ArrayList<AddressBook> list = new ArrayList();
    public void addNew() {
        System.out.println("Welcome to Address Book Program  on Main Branch");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName = sc.next();
        System.out.println("Enter Last Name");
        String lastName = sc.next();
        System.out.println("Enter Address");
        String address =  sc.next();
        System.out.println("Enter City");
        String city = sc.next();
        System.out.println("Enter State");
        String state = sc.next();
        System.out.println("Enter ZIP Code");
        int zip = sc.nextInt();
        System.out.println("Enter your phone number");
        int phoneNo = sc.nextInt();
        System.out.println("Enter Email ID");
        String email = sc.next();

        AddressBook contact = new AddressBook();
        list.add(contact);

    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.addNew();
        System.out.println("Add another contact");
        addressBook.addNew();
        System.out.println(addressBook.list);
    }
}
