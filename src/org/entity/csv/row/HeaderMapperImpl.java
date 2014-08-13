/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.entity.csv.row;

import java.util.HashMap;

/**
 *
 * @author Knut
 */
public class HeaderMapperImpl implements HeaderMapping{
    
    private HashMap<Integer,String> headerMapping;
    private boolean hasMappend = false;

    public HeaderMapperImpl() {
        headerMapping = new HashMap<>();
    }
    
    
    
    
    @Override
    public String getHeaderName(int columnIndex) {
        return headerMapping.get(columnIndex);
    }

    @Override
    public void mapHeader(int columnIndex, String columnName) {
        headerMapping.put(columnIndex, columnName);
        hasMappend = true;
    }

    @Override
    public boolean hasMapped() {
        return hasMappend;
    }

    @Override
    public int count() {
        return headerMapping.size();
    }
    
}
