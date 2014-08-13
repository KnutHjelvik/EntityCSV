/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.entity.csv.entitycore;

import org.entity.csv.row.HeaderMapping;

/**
 *
 * @author Knut
 */
public class EntityPropertyValidation {

    private EntityProperties properties;
    private HeaderMapping headerMapping;

    public EntityPropertyValidation(HeaderMapping headerMapping, EntityProperties entityProperties) {
        this.properties = entityProperties;
        this.headerMapping = headerMapping;
    }
   
    public boolean headersAndPropertiesExists() {
        boolean valid = false;
        int count = headerMapping.count();
        PropertyValidations propertyValidations = new PropertyValidations(count);
        for (int i = 0; i < headerMapping.count(); i++) {
            String headerName = headerMapping.getHeaderName(i);
            for (String key : properties.getColumnToEntityProperty().keySet()) {
                EntityProperty entityProperty = properties.getMappedPropperty(headerName);
                if (entityProperty != null) {
                    propertyValidations.incrementValidation();
                    break;
                }
                throw new IllegalStateException("Property: " + headerName + " does not exist on the EntityBean. Please add this property to the EntityBean");
            }
        }
        return propertyValidations.isValid();
    }

}
