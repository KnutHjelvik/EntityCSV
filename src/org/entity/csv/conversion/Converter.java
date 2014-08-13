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
public interface Converter<T> {
    
    public T convert(Object value);
}
