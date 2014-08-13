/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.entity.csv.entitycore;

import java.util.ArrayList;
import java.util.List;
import org.entity.csv.mapper.EntityPropertyMapper;
import org.entity.csv.row.HeaderMapping;
import org.entity.csv.row.IReader;
import org.entity.csv.row.Row;

/**
 *
 * @author Knut
 */
public class CoreEntityMapper<T> {

    private final Class<T> entityClass;
    private final IReader rowReader;
    private final GenericFactory<T> genericFactory;

    public CoreEntityMapper(Class entityClass, IReader rowReader) {
        this.entityClass = entityClass;
        this.rowReader = rowReader;
        this.genericFactory = new GenericFactory<>();
    }

    public EntityProperties readProperties() throws Exception {
        return new EntityReadProperties(entityClass).readEntityProperties();
    }

    public List<Row> readRows() {
        return rowReader.readRows();
    }
    
    public HeaderMapping getHeaderMapping(){
        return rowReader.readHeader();
    }
    
    
    public EntityPropertyValidation getEntityPropertyValidation() throws Exception{
        return new EntityPropertyValidation(getHeaderMapping(), getEntityProperties());
    }
    
    public EntityProperties getEntityProperties() throws Exception{
        return new EntityReadProperties(entityClass).readEntityProperties();
    }

    public List<T> readEntities() throws Exception {
        List<Row> rows = readRows();
        List<T> entities = new ArrayList<>();
        EntityProperties entityProperties = new EntityReadProperties(entityClass).readEntityProperties();
        HeaderMapping headerMapping = rowReader.readHeader();
        for (Row row : rows) {
            T entity = genericFactory.create(entityClass);
            EntityPropertyMapper<T> mapper = new EntityPropertyMapper<>();
            mapper.mapProperty(entity, row, entityProperties, headerMapping);
            entities.add(entity);
        }
        return entities;
    }
}
