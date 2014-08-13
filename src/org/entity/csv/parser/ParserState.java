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
public class ParserState {
    
    private State state;
    private int quotesInCell;
    private Symbol currentSymbol;

    public void setState(State state) {
        this.state = state;
    }
    
    
    public void incrementQuotes(){
        quotesInCell++;
    }
    
    public boolean isSymbolQuoted(){
        return currentSymbol.isQuote();
    }

    public boolean  inQuotes() {
        return state == State.IN_QUOTES;
    }
    
    public Symbol getCurrentSymbol() {
        return currentSymbol;
    }
    public boolean isAllQuotesEncountered(){
        return quotesInCell % 2 == 0;
    }

    public void setCurrentSymbol(Symbol currentSymbol) {
        this.currentSymbol = currentSymbol;
    }
    
    
}
