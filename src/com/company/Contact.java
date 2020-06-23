package com.company;

public class Contact {
    private String contactName;
    private String phoneNumber;

    public Contact(String contactName, String phoneNumber) {
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
    }

    public Contact() {
        this("Default Name", "11111111");
    }

    public String getContactName() {
        return contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void printContact() {
        System.out.println("Name: " + getContactName() + "  -->  Number: " + getPhoneNumber());
    }
}
