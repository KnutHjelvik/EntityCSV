package org.entity.csv.row;

import java.util.List;
import org.enity.csv.cell.Cell;

/**
 *
 * @author Knut
 */
public class RowImpl implements Row{
    
    private int rowIndex=0;
    private List<Cell> cells;

    public RowImpl(int rowIndex, List<Cell> cells) {
        this.rowIndex = rowIndex;
        this.cells = cells;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public List<Cell> getCells() {
        return cells;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public void setCells(List<Cell> cells) {
        this.cells = cells;
    }
}
