/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.enity.csv.cell;

/**
 *
 * @author Knut
 */
public interface Cell {
    public Object getValue();
    public String getStr();
    public int getInt();
    public double getDouble();
    public void setHeaderIndex(int headerIndex);
    public void setValue(Object object);
    public int getColumnIndex();
    @Override
    public String toString();
    
}
