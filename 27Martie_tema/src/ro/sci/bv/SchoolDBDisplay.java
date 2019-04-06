package ro.sci.bv;

/**
 * Displays data for all classes from Table Classes in School Database
 *
 * @author Marian Pescaru
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SchoolDBDisplay {

    Statement st = null;
    ResultSet rs = null;

    public void displayTable() {

        Connection conn = SchoolDBConnection.getConnection();
        final String format = "%20s %20s %20s %20s %20s %20s %20s \n";
        try {
            st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery("select * from classes");
            boolean hasResults = rs.next();
            if (hasResults) {
                System.out.format(format, "ClassID", "CourseID", "Days", "Start_time","End_time","Building","Room_number");
                do {
                    System.out.format(format, rs.getString("classID"), rs.getString("courseID"),
                            rs.getString("Days"),rs.getString("Starttime"),
                            rs.getString("Endtime"),rs.getString("bldg"),
                            rs.getString("Roomnum"));
                } while (rs.next());
            } else {
                System.out.println("no results");
            }
        } catch (
                SQLException e) {
            System.err.println("Cannot execute query: " + e.getMessage());
        } finally {
            if (rs != null) try {
                rs.close();
            } catch (SQLException e) {
            }
            if (st != null) try {
                rs.close();
            } catch (SQLException e) {
            }
            try {
                conn.close();
            } catch (SQLException e) {
            }
        }
    }
}
