package CC;
import CC.Contact;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
public class ContactList {
ArrayList<Contact> list = new ArrayList<>();
Scanner scanner = new Scanner(System.in);

public void selectList(){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/contactlist?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                           "root","" );
                        Statement stmt = conn.createStatement();
                ){
            String strSelect = "select * from contact";
            System.out.println("Contact List :" + strSelect + "\n");

        }   catch (SQLException ex){
ex.printStackTrace();
        }
    }
public void addList(Contact contact){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/contactlist?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                            "root","");
                        Statement stmt = conn.createStatement();
                ){
    String sqlInsertList = "insert into contact values(" + contact.getName() + "," + contact.getPhone() + ")";
            System.out.println("The new contact list is: " + sqlInsertList + "\n");
        } catch (SQLException ex){
            ex.printStackTrace();
        }
}
public void deleteList(String name){
    try(
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/contactlist?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                    "root","");
            Statement stmt = conn.createStatement();
            ){
        String sqlDeleteList ="DELETE FROM contact WHERE name = " + name ;
        System.out.println("The contact which have been deleted is: " + sqlDeleteList + "\n");
    } catch (SQLException ex){
        ex.printStackTrace();
    }
}
public void searchList(String name){
    try(
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/contactlist?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                    "root","");
            Statement stmt = conn.createStatement();
    ){
        String sqlSearchList ="select * from contact where name =" + name ;
        System.out.println("The contact is: " + sqlSearchList + "\n");
    }catch (SQLException ex){
        ex.printStackTrace();
    }
}









}
