/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.entity.csv.row;

import java.util.List;

/**
 *
 * @author Knut
 */
public interface IReader {
    
    public List<Row> readRows();
    /**
     * Reads the header
     * @return 
     */
    public HeaderMapping readHeader();
    
    public int incrementRowIndex();
}
