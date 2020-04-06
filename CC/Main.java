package CC;

import CC.Contact;
import CC.ContactList;
import java.sql.SQLOutput;
import java.util.ArrayList;
import  java.util.Scanner;

public class Main {
final int SENTINEL = 0;
int n;
    Scanner scanner = new Scanner(System.in);
    ContactList List = new ContactList();

    public static void main(String[] args) {
        Main M = new Main();
        M.runMain();
    }

    public void menu(){
        System.out.println("Available Actions: ");
        System.out.println("Press");
        System.out.println("0 - to shut down ");
        System.out.println("1 - to print contact");
        System.out.println("2 - to add a new contact");
        System.out.println("3 - to update existing an existing contact ");
        System.out.println("4 - to remove an existing contact");
        System.out.println("5 - query if an existing contact exist");
        System.out.println("6 - to print list of available actions");
    }
    public void addContact(){
        System.out.println("New Name: ");
        String name = scanner.nextLine();
        System.out.println("New Phone: ");
        String phone = scanner.nextLine();
        Contact contact = new Contact(name,phone);
        List.addList(contact);
    }
    public void deleteContact(){
        System.out.println("Name of contact want to delete: ");
        String name = scanner.nextLine();
        List.deleteList(name);
    }
    public void runMain(){
        System.out.println(":)))))))");
        Main M = new Main();
        M.runMain();
        n = scanner.nextInt();

        while (n != SENTINEL){
            switch (n){
                case 1:
                    System.out.println("contact");
                    List.selectList();
                    break;

                case 2:
                    M.addContact();
                    break;

                case 4:
                    M.deleteContact();
                    break;

                case 6:
                    M.menu();
                    break;

            }
            M.menu();
            n = scanner.nextInt();
        }

    }


}
