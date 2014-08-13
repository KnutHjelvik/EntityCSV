package org.entity.csv.entitycore;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import org.entity.csv.common.ColumnType;

/**
 *
 * @author Knut
 */
public class EntityProperty {
    
    private PropertyDescriptor propertyDescriptor;
    
    private String columnName;
    
    private final ColumnType columnType;
    
    private Field field;

    public EntityProperty(PropertyDescriptor propertyDescriptor, Field field,String columnName,ColumnType columnType) {
        this.propertyDescriptor = propertyDescriptor;
        this.field = field;
        this.columnName = columnName;
        this.columnType = columnType;
    }
    
    public PropertyDescriptor getPropertyDescriptor() {
        return propertyDescriptor;
    }

    public Field getField() {
        return field;
    }

    public void setPropertyDescriptor(PropertyDescriptor propertyDescriptor) {
        this.propertyDescriptor = propertyDescriptor;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnName() {
        return columnName;
    }

    public ColumnType getColumnType() {
        return columnType;
    }
    
    
    
    
    
    
}
