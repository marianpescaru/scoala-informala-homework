package ro.sci.bv;

/**
 * Main class for displaying requested information from School Database
 *
 * @author Marian Pescaru
 */


public class SchoolDBMain {
    public static void main(String[] args) {

        SchoolDBConnection conn = new SchoolDBConnection("root","Parola01@");
        // variables in SchoolDBConnection could be introduced by user input
        conn.getConnection(); // establish connection with database;

        SchoolDBDisplay display1 = new SchoolDBDisplay();
        display1.displayTable();

        System.out.println("---------------------");

        SchoolDBDisplayID display2 = new SchoolDBDisplayID();
        display2.displayTableID();

        System.out.println("----------------------");

        SchoolDBDisplayIntro display3 = new SchoolDBDisplayIntro();
        display3.displayTableIntro();

        System.out.println("---------------------");

        SchoolDBDept display4 = new SchoolDBDept();
        display4.displayTableDept();
    }
}
