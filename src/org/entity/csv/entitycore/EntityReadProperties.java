package org.entity.csv.entitycore;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.entity.csv.annotation.Column;
import org.entity.csv.common.ColumnType;
import org.entity.csv.example.Bean;

/**
 *
 * @author Knut
 */
public class EntityReadProperties {

    private Class clazz;

    public EntityReadProperties(Class clazz) {
        this.clazz = clazz;
    }

    public EntityProperties readEntityProperties() throws Exception {
        Field[] fields = clazz.getDeclaredFields();
        EntityProperties entityProperties = new EntityProperties();
        for (Field field : fields) {
            PropertyDescriptor descriptor = getWriteMethod(field);
            Column column = field.getAnnotation(Column.class);
            ColumnType columnType = column.type();
            String name = column.header();
            EntityProperty entityProperty = new EntityProperty(descriptor, field, name, columnType);
            entityProperties.addEntityProperty(name, entityProperty);
        }
        return entityProperties;
    }

    private PropertyDescriptor getWriteMethod(Field field) throws Exception {
        PropertyDescriptor descriptor = null;
        String fieldName = field.getName();
        try {
            PropertyDescriptor[] descriptors = Introspector.getBeanInfo(clazz).getPropertyDescriptors();
            for (PropertyDescriptor propertyDescriptor : descriptors) {
                if (propertyDescriptor.getWriteMethod() != null
                        && fieldToDescriptor(propertyDescriptor, fieldName)) {
                    descriptor = propertyDescriptor;
                    break;
                }
            }
        } catch (IntrospectionException ex) {
            Logger.getLogger(EntityReadProperties.class.getName()).log(Level.SEVERE, null, ex);
        }
        return descriptor;
    }

    private boolean fieldToDescriptor(PropertyDescriptor propertyDescriptor, String fieldName) {
        return propertyDescriptor.getWriteMethod().getName().equalsIgnoreCase(Methods.write + fieldName);
    }
//    
//    public static void main(String[] args) throws Exception {
//        EntityReadProperties entityReadProperties = new EntityReadProperties(Bean.class);
//        EntityProperties entityProperties = entityReadProperties.readEntityProperties();
//        System.out.println(entityProperties);
//    }
}
