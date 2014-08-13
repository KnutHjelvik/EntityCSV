/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.entity.csv.common;

/**
 *
 * @author Knut
 */
public class Delimiter {
    private char delimiter;
    
    public Delimiter(char delimiter){
        this.delimiter = delimiter;
    }

    public String getDelimiter() {
        return Character.toString(delimiter);
    }

    public void setDelimiter(char delimiter) {
        this.delimiter = delimiter;
    }
}
