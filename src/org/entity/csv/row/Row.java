/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.entity.csv.row;

import java.util.List;
import org.enity.csv.cell.Cell;

/**
 *
 * @author Knut
 */
public interface Row {

    public int getRowIndex();
    public List<Cell> getCells();
    public void setRowIndex(int rowIndex);
    public void setCells(List<Cell> cells);
}
