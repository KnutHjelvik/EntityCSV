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
public interface HeaderMapping {
    
    public String getHeaderName(int columnIndex);
    
    public void mapHeader(int columnIndex, String columnName);
    
    public boolean hasMapped();
    
    public int count();
}
