package gov.dhs.cisa.flare.misp;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import org.slf4j.Logger;

public class FileTextReader {
    public static void readFile(Logger log) throws FileNotFoundException {
        try {
            File ptr = new File("Taxii1DataSmall.xml");
            Scanner txt = new Scanner(ptr);
            while (txt.hasNextLine()) {
                log.info(txt.nextLine());
            }
            log.info("");
        }
        catch (Exception e){
            log.info("File was not found");
        }
    }
}