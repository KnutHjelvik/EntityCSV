/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.entity.csv.cell;

import org.entity.csv.conversion.DoubleConverter;

/**
 *
 * @author Knut
 */
public class CellImpl implements Cell {

    private int headerIndex;
    private Object value;

    public CellImpl() {
    }

    public CellImpl(int headerIndex, Object value) {
        this.headerIndex = headerIndex;
        this.value = value;
    }

    @Override
    public int getColumnIndex() {
        return headerIndex;
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public int getInt() {
        return Integer.parseInt((String) value);
    }

    @Override
    public String getStr() {
        return (String) value;
    }

    @Override
    public double getDouble() {
        return new DoubleConverter().convert(value);
    }

    @Override
    public void setHeaderIndex(int headerIndex) {
        this.headerIndex = headerIndex;
    }

    @Override
    public void setValue(Object value) {
        this.value = value;
    }
}
