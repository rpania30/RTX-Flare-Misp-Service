package gov.dhs.cisa.flare.misp;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import org.slf4j.Logger;

public class FileTextReader {
    public void readFile(Logger log) throws FileNotFoundException {
        File ptr = new File("D:\\Raytheon\\flare-misp-service\\misp-trans-client-rest-service\\Taxii1DataSmall.xml");
        Scanner txt = new Scanner(ptr);
        while (txt.hasNextLine()) {
            log.info(txt.nextLine());
        }
        log.info("");
    }
}