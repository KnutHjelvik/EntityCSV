/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.entity.csv.reading;

import java.io.BufferedReader;
import java.io.IOException;
import org.entity.csv.row.HeaderLine;

/**
 *
 * @author Knut
 */
public class HeaderReader {

    private boolean headersRead;
    private final BufferedReader bufferedReader;
    private String rawLine;

    public HeaderReader(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
        this.headersRead = false;
    }

    public boolean isHeaderRead() {
        return this.headersRead;
    }

    public HeaderLine readHeader() {
        if (!isHeaderRead()) {
            try {
                this.rawLine = bufferedReader.readLine();
                HeaderLine headerLine = new HeaderLine(rawLine);
                headersRead = true;
                return headerLine;
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        return new HeaderLine(rawLine);
    }
}
