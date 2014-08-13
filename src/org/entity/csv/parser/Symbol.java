/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.entity.csv.parser;

/**
 *
 * @author Knut
 */
public class Symbol {

    private char symbol;

    public Symbol(char symbol) {
        this.symbol = symbol;
    }

    public boolean isQuote() {
        return symbol == '"';
    }
}
