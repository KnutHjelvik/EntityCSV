/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.entity.csv.entitycore;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author Knut
 */
public class EntityProperties {
    
    private Map<String,EntityProperty> columnToEntityProperty;
    
    public EntityProperties(){
        columnToEntityProperty = new HashMap<>();
    }
    
    public void addEntityProperty(String columnName, EntityProperty entityProperty){
        columnToEntityProperty.put(columnName, entityProperty);
    }
    
    public EntityProperty getMappedPropperty(String column){
        return columnToEntityProperty.get(column);
    }

    public Map<String, EntityProperty> getColumnToEntityProperty() {
        return columnToEntityProperty;
    }
}
