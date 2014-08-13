/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.entity.csv.row;

/**
 *
 * @author Knut
 */
public class Line {
    private String rawLine;

    public Line(String rawLine) {
        this.rawLine = rawLine;
    }
    
    public void setRawLine(String rawLine) {
        this.rawLine = rawLine;
    }

    public String getRawLine() {
        return rawLine;
    }
    
    public int numberOfCharakters(){
        return rawLine.length();
    }

    @Override
    public String toString() {
        return "Line{" + "rawLine=" + rawLine + '}';
    }
    
    
}
