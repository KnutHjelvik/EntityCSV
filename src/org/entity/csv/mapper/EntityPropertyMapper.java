/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.entity.csv.mapper;
import org.enity.csv.cell.Cell;
import org.entity.csv.entitycore.EntityProperties;
import org.entity.csv.entitycore.EntityProperty;
import org.entity.csv.row.HeaderMapping;
import org.entity.csv.row.Row;

/**
 *
 * @author Knut
 */
public class EntityPropertyMapper<T> {
    
    public void mapProperty(T entity,Row row,EntityProperties propertys,HeaderMapping headerMapping){
        for(Cell cell: row.getCells()){
            String column = headerMapping.getHeaderName(cell.getColumnIndex());
            EntityProperty entityProperty = propertys.getMappedPropperty(column);
            InvokeProperty<T> invokeProperty = new InvokeProperty();
            invokeProperty.invoke(entity, entityProperty, cell);
        }
    }
    
}
