package ro.sci.bv;

/**
 * Displays data for all classes from Tables Classes and Crosslitings in School Database
 * where Department is COS and coursenum starts with 3;
 *
 * Some columns (e.g. courseid, doubled) are ignored for a better display
 *
 * @author Marian Pescaru
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SchoolDBDept {
    Statement st = null;
    ResultSet rs = null;

    public void displayTableDept() {

        Connection conn = SchoolDBConnection.getConnection();
        final String format = "%20s %20s %20s %20s %20s %20s %20s %20s\n";
        try {
            st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery("select*from classes join crosslistings on (classes.courseid = crosslistings.courseid) " +
                    "where dept = \"COS\" and coursenum like \"3%\";");
            boolean hasResults = rs.next();
            if (hasResults) {
                System.out.format(format, "ClassID", "CourseID", "Start_time","End_time","Building","Room_number", "Department", "Coursenum");
                do {
                    System.out.format(format, rs.getString("ClassID"), rs.getString("CourseID"),
                            rs.getString("Starttime"),rs.getString("Endtime"),
                            rs.getString("bldg"), rs.getString("Roomnum"),
                            rs.getString("dept"),rs.getString("coursenum"));
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
