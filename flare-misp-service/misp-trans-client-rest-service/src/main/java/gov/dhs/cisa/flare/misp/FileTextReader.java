package gov.dhs.cisa.flare.misp;

import java.util.Date;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileTextReader {
    public static String readFile(String filename) throws FileNotFoundException {
        try {
            File ptr = new File(filename);
            Scanner txt = new Scanner(ptr);
            StringBuilder sb = new StringBuilder();
            while (txt.hasNextLine()) {
                String temp = txt.nextLine();
                /*
                 * Replace timestamp
                 */
                if (temp != null && temp.indexOf("2014-10-31T16:44:24.766014+00:00") != -1 ) {
                    temp = temp.replaceAll("2014-10-31T16:44:24.766014+00:00", new Date().toString());
                    System.out.println("++++++++++++" + temp);
                }
                sb.append(temp + "\n");
            }
            return sb.toString();
        }
        catch (Exception e){
            return "File was not found";
        }
    }
}