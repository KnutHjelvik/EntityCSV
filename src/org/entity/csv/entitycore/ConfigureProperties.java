package org.entity.csv.entitycore;

import org.entity.csv.row.HeaderMapping;
import org.entity.csv.row.IReader;

/**
 *
 * @author Knut
 */
public class ConfigureProperties<T> {

    private EntityProperties entityProperties;
    private IReader reader;
    private HeaderMapping headerMapping;

    public ConfigureProperties(EntityProperties entityProperties, IReader reader, HeaderMapping headerMapping) {
        this.entityProperties = entityProperties;
        this.reader = reader;
        this.headerMapping = headerMapping;
    }

    public T configureProperties() {
        
        return null;
    }
}
