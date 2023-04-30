package connection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DatabaseConnection {
    static String databaseName = "";
    static String databasePassword = "";
    static String databaseFirstName = "";
    static String databaseSurname = "";
    static String databaseIndexNumber = "";

    public String username(){
        try {
            File myObj = new File("D:\\Java\\InClass\\JavaFX\\Login\\Database\\usernames.txt");
            Scanner sc = new Scanner(myObj);
            while (sc.hasNextLine()) {
                databaseName = sc.nextLine();
                break;
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }

        return databaseName;
    }

    public String password(){
        try {
            File myObj = new File("D:\\Java\\InClass\\JavaFX\\Login\\Database\\passwords.txt");
            Scanner sc = new Scanner(myObj);
            while (sc.hasNextLine()) {
                databasePassword = sc.nextLine();
                break;
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
        return databasePassword;
    }

    public String firstname(){
        try {
            File myObj = new File("D:\\Java\\InClass\\JavaFX\\Login\\Database\\firstnames.txt");
            Scanner sc = new Scanner(myObj);
            while (sc.hasNextLine()) {
                databaseFirstName = sc.nextLine();
                break;
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }

        return databaseFirstName;
    }

    public String surname(){
        try {
            File myObj = new File("D:\\Java\\InClass\\JavaFX\\Login\\Database\\surnames.txt");
            Scanner sc = new Scanner(myObj);
            while (sc.hasNextLine()) {
                databaseName = sc.nextLine();
                break;
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }

        return databaseSurname;
    }

    public String indexNumber(){
        try {
            File myObj = new File("D:\\Java\\InClass\\JavaFX\\Login\\Database\\indexNumbers.txt");
            Scanner sc = new Scanner(myObj);
            while (sc.hasNextLine()) {
                databaseName = sc.nextLine();
                break;
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }

        return databaseIndexNumber;
    }
}
