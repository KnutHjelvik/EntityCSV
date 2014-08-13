/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.entity.csv.conversion;

/**
 *
 * @author Knut
 */
public class DoubleConverter implements Converter<Double>{

    @Override
    public Double convert(Object value) {
        return Double.parseDouble((String) value);
    }
    
}
