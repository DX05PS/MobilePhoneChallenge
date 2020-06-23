package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MobilePhone {
    private List<Contact> contacts;

    public MobilePhone() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact newContact) {
        if (!isPresent(newContact.getContactName())){
            contacts.add(newContact);
            System.out.println("added");
        } else
            System.out.println("Already exists");
    }

    public void printContacts() {
        if (contacts.size() > 0) {
            for (Contact c :
                    contacts) {
                System.out.println("Name: " + c.getContactName() + " --> Number: " + c.getPhoneNumber());
            }
        } else
            System.out.println("Contact list is empty");
    }

    public void removeContact(String name) {
        if (isPresent(name)) {
            contacts.remove(searchFor(name));
            System.out.println("Removed");
        } else
            System.out.println("Contact not found");
    }

    public void modifyContact(String name, String newName, String newNumber) {
        if (isPresent(name)) {
            contacts.set(searchFor(name), new Contact(newName, newNumber));
        }
    }


    //SUPPLEMENTAL SEARCH METHODS
    public boolean isPresent(String name) {
        for (Contact c :
                this.contacts) {
            if (c.getContactName().contains(name)) {
                return true;
            }
        }
        return false;
    }

    private int searchFor(String name) {
        int index = -1;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getContactName().contains(name)){
                index = i;
            }
        }
        return index;
    }
}
