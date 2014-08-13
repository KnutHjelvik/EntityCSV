/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.entity.csv;

/**
 *
 * @author Knut
 */
public class CharakterValue {
    private char charakter;
    private boolean inQuotes;
    private boolean isSeparator;

    public CharakterValue(char charakter, boolean inQuotes) {
        this.charakter = charakter;
        this.inQuotes = inQuotes;
    }

    public char getCharakter() {
        return charakter;
    }

    public boolean isInQuotes() {
        return inQuotes;
    }

    public boolean isIsSeparator() {
        return isSeparator;
    }

    public void setCharakter(char charakter) {
        this.charakter = charakter;
    }

    public void setInQuotes(boolean inQuotes) {
        this.inQuotes = inQuotes;
    }

    public void setIsSeparator(boolean isSeparator) {
        this.isSeparator = isSeparator;
    }
    
    
}
