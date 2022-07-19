package gov.dhs.cisa.flare.misp;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import org.slf4j.Logger;

public class FileTextReader {
    public static String readFile(String filename) throws FileNotFoundException {
        try {
            File ptr = new File(filename);
            Scanner txt = new Scanner(ptr);
            StringBuilder sb = new StringBuilder();
            while (txt.hasNextLine()) {
                sb.append(txt.nextLine() + "\n");
            }
            return sb.toString();
        }
        catch (Exception e){
            return "File was not found";
        }
    }
}