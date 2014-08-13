/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.entity.csv.cell;

import java.util.List;
import org.entity.csv.parser.ParserState;
import org.entity.csv.parser.State;
import org.entity.csv.parser.Symbol;
import org.entity.csv.row.Line;

/**
 *
 * @author Knut
 */
public class AdvancedCellFactory implements ICellFactory<Line> {

    private ParserState parserState = new ParserState();

    @Override
    public List<Cell> createCells(Line rawLine) {
        String line = rawLine.getRawLine();
        int lengthOfLine = rawLine.numberOfCharakters();
        int charaktersRead = 0;
        while (true) {
            char workingCharakter = line.charAt(charaktersRead);
            Symbol symbol = new Symbol(workingCharakter);
            parserState.setCurrentSymbol(symbol);
            if (parserState.isSymbolQuoted()) {
                parserState.setState(State.IN_QUOTES);
                parserState.incrementQuotes();
                int indexInQuotes = charaktersRead + 1;
                while (parserState.inQuotes()) {
                    StringBuilder builder = new StringBuilder();
                    char workingCharakterInQuotes = line.charAt(indexInQuotes);
                    Symbol symbolInQuotes = new Symbol(workingCharakterInQuotes);
                    parserState.setCurrentSymbol(symbolInQuotes);
                    if (parserState.isSymbolQuoted()) {
                        parserState.incrementQuotes();
                        builder.append(workingCharakterInQuotes);
                    }
                    if (!parserState.isSymbolQuoted()) {
                        builder.append(workingCharakterInQuotes);
                    }

                    if (parserState.isAllQuotesEncountered()) {
                        parserState.setState(State.OUTSIDE_QUOTES);
                        indexInQuotes = 0;
                    }
                    indexInQuotes++;
                }

            }
            charaktersRead++;
        }

    }

    public static void main(String[] args) {
        AdvancedCellFactory acf = new AdvancedCellFactory();
        Line line = new Line("\"Text1\",\"Text2\",\"Text3\",\"Text4\"");
        acf.createCells(line);
    }

}
