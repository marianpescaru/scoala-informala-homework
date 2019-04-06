package ro.sci.bv;

/**
 * Displays data for all classes from Tables Classes and Courses in School Database
 * filtered by courses which starts with 'Intro'
 *
 * Some columns (e.g. courseid, doubled) are ignored for a better display
 *
 * @author Marian Pescaru
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SchoolDBDisplayIntro {

    Statement st = null;
    ResultSet rs = null;

    public void displayTableIntro() {

        Connection conn = SchoolDBConnection.getConnection();
        final String format = "%20s %20s %20s %20s %20s %20s %20s %20s\n";
        try {
            st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery("select*from classes join courses on (classes.courseid = courses.courseid) where title like \"intro%\";");
            boolean hasResults = rs.next();
            if (hasResults) {
                System.out.format(format, "ClassID", "CourseID", "Start_time","End_time","Building", "Area", "Title", "Description");
                do {
                    System.out.format(format, rs.getString("ClassID"), rs.getString("CourseID"),rs.getString("Starttime"),
                            rs.getString("Endtime"),rs.getString("bldg"),
                            rs.getString("area"),rs.getString("title"),
                            rs.getString("descript"));
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
