/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.enity.csv.cell;

import java.util.ArrayList;
import java.util.List;
import org.entity.csv.row.Line;

/**
 *
 * @author Knut
 */
public class QuotedCellFactory implements ICellFactory<Line> {


    @Override
    public List<Cell> createCells(Line quotedLine) {
        String quotes = quotedLine.getRawLine();
        List<Cell> cells = new ArrayList<>();
        int headerIndex = 0;
        for (int i = 0; i < quotes.length(); i++) {
            StringBuilder quotedValues = new StringBuilder();
            char c = quotes.charAt(i);
            boolean inQuotes = false;
            if (c == '"') {
                inQuotes = true;
                int indexInQuotes = i;
                while (inQuotes) {
                    if (indexInQuotes + 1 >= quotes.length()) {
                        break;
                    }
                    indexInQuotes++;
                    i++;
                    char k = quotes.charAt(indexInQuotes);
                    if (k == '"') {
                        inQuotes = false;
                    }
                    if (k != '"') {
                        quotedValues.append(k);
                    }
                }
            }
            if (!inQuotes) {
                if (!quotedValues.toString().isEmpty()) {
                    Cell cell = new CellImpl(headerIndex, quotedValues.toString());
                    cells.add(cell);
                    headerIndex++;
                }
            }
        }
        return cells;
    }

}
