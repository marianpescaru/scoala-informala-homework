package ro.sci.bv;

/**reads data from a file and writes on another file
 * data written should be filtered by a given month
 * data written should be sorted alphabetically
 *
 * @author Marian Pescaru
 */

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class NameDate {
    public static void main(String[] args) throws IOException {

        BufferedReader in = null;
        BufferedWriter out = null;
        FileReader fr = null;
        ArrayList<NameList> myList = new ArrayList<>();

        // Path inPath = Paths.get("files/listapersoane.txt");

        try {

            fr = new FileReader("files/listapersoane.txt");
            in = new BufferedReader(fr);
            out = new BufferedWriter(new FileWriter("files/outlistapersoane.txt"));
            String line;
            while ((line = in.readLine()) != null) {
                String[] lineValues = line.split(","); //split the string on spaces into array
                out.write(line);
                System.out.println("Name and birthdate " + line);
            }
        } catch(IOException e){
            System.out.println("Error" + e);

        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (fr != null) {
                    fr.close();
                }
                if (out != null){
                    out.close();
                }
            } catch (IOException ex){
                ex.printStackTrace();
            }
        }
        }
    }