package com.company;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static MobilePhone phone = new MobilePhone();

    public static void main(String[] args) {

        boolean running = true;
        printOptions();

        while (running) {
            System.out.println("Enter action: (0 to show all available actions)");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0 -> printOptions();
                case 1 -> phone.printContacts();
                case 2 -> addNewContact();
                case 3 -> removeContact();
                case 4 -> modifyContact();
                case 5 -> running = false;
            }
        }
        scanner.close();

    }

    public static void addNewContact() {
        System.out.println("Type name:");
        String name = scanner.nextLine();
        System.out.println("Type number");
        String number = scanner.nextLine();
        phone.addContact(new Contact(name, number));
    }

    public static void removeContact() {
        System.out.println("Type name:");
        String name = scanner.nextLine();
        phone.removeContact(name);
    }

    public static void modifyContact()  {
        System.out.println("Provide name: ");
        String oldName = scanner.nextLine();
        if (phone.isPresent(oldName)) {
            System.out.println("Type new name: ");
            String newName = scanner.nextLine();
            System.out.println("Type new number");
            String newNumber = scanner.nextLine();
            phone.modifyContact(oldName, newName, newNumber);
        } else
            System.out.println("Contact not found");
    }

    public static void printOptions() {
        System.out.println("0 - Show available options");
        System.out.println("1 - Show phone book contacts");
        System.out.println("2 - Add new contact to the phone book");
        System.out.println("3 - Remove existing contact");
        System.out.println("4 - Modify existing contact");
        System.out.println("5 - Remove contact from the phone book");
    }
}
