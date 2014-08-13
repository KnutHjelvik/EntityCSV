/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.entity.csv.cell;

import java.util.List;
import org.entity.csv.common.Delimiter;
import org.entity.csv.row.Line;

/**
 *
 * @author Knut
 */
public interface ICellFactory<T extends Line>{
    
    public List<Cell> createCells(T t);
}
