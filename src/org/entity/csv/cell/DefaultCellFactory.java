/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.entity.csv.cell;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.entity.csv.common.Delimiter;
import org.entity.csv.row.Line;

/**
 *
 * @author Knut
 */
public class DefaultCellFactory implements ICellFactory<Line> {

    private Delimiter delimiter;

    public DefaultCellFactory(Delimiter delimiter) {
        this.delimiter = delimiter;
    }

    @Override
    public List<Cell> createCells(Line line) {
        String rawLine = line.getRawLine();
        String delimiter = this.delimiter.getDelimiter();
        String[] falsyCells = rawLine.split(delimiter);
        List<Cell> trustyCells = new ArrayList<>();
        for(int columnIndex = 0; columnIndex < falsyCells.length; columnIndex++){
            String value = falsyCells[columnIndex];
            Cell cell = new CellImpl(columnIndex, value);
            trustyCells.add(cell);
        }
        return trustyCells;
    }

}
