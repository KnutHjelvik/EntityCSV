package org.entity.csv.reading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.entity.csv.row.BareLine;
import org.entity.csv.row.HeaderLine;
import org.entity.csv.row.Line;

/**
 *
 * @author Knut
 */
public class CSVReader {

    private InputStreamReader inputStreamReader;
    private FileInputStream fileInputStream;
    private BufferedReader bufferedReader;
    private HeaderReader headerReader;

    public CSVReader(File csvFile) {
        try {
            fileInputStream = new FileInputStream(csvFile);
            inputStreamReader = new InputStreamReader(fileInputStream,"ISO-8859-1");
            bufferedReader = new BufferedReader(inputStreamReader);
            headerReader = new HeaderReader(bufferedReader);
        } catch (Exception ex) {
            Logger.getLogger(CSVReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public HeaderLine readHeader() {
        return headerReader.readHeader();
    }

    public Line readLine() {
        if (!headerReader.isHeaderRead()) {
            headerReader.readHeader();
        }
        try {
            String rawLine = bufferedReader.readLine();
            Line line = new BareLine(rawLine);
            return line;
        } catch (IOException ex) {
            //throw new RuntimeException(ex);
            return null;
        }
    }

}
