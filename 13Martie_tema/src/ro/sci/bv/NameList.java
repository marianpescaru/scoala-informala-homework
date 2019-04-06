package ro.sci.bv;

/**reates a class to be used in the name and month array list
 *
 * @author Marian Pescaru
 */

// creates a class to be used in the name and month array list
public class NameList {
    private String name;
    private String birthDate;
    private int birthDateMonth;

    // class constructor
    public NameList(String name, String birthDate, int birthDateMonth) {
        this.name = name;
        this.birthDate = birthDate;
        this.birthDateMonth = birthDateMonth;
    }

    // splits the date input and gets the month as an Integer
    String [] dateParts = birthDate.split("/");
    public int getMonth() {
        birthDateMonth = Integer.parseInt(dateParts[1]);
        return birthDateMonth;
    }


}
