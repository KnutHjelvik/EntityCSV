/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.entity.csv.mapper;

import java.lang.reflect.Method;
import org.entity.csv.cell.Cell;
import org.entity.csv.entitycore.EntityProperty;

/**
 *
 * @author Knut
 */
public class InvokeProperty<T> {

    public void invoke(T entity, EntityProperty entityProperty, Cell cell) {
        try {
            Method method = entityProperty.getPropertyDescriptor().getWriteMethod();
            switch (entityProperty.getColumnType()) {
                case TEXT:
                    method.invoke(entity, cell.getStr());
                    break;
                case DOUBLE:
                    method.invoke(entity, new Double(cell.getStr()));
                    break;
                case INTEGER:
                    method.invoke(entity, new Integer(cell.getStr()));
                    break;
            }
        } catch (Exception ex) {
            System.out.println("In exceptin thrown: "+entity);
        }
    }
}
