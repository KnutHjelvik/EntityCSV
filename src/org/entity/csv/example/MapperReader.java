/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.entity.csv.example;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author Knut
 */
public class MapperReader<T> {

//    public Class<T> clazz;
//
//    public MapperReader(Class<T> clazz) {
//        this.clazz = clazz;
//
//    }
//
//    public void read() throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
//        Bean bean = new Bean();
//        PropertyDescriptor[] descriptors = Introspector.getBeanInfo(clazz).getPropertyDescriptors();
//        for (PropertyDescriptor p : descriptors) {
//            Method method = p.getWriteMethod();
//            if (method != null) {
//                if (method.getParameters()[0].getType() == int.class) {
//                    method.invoke(bean, (int)1);
//                }
//            }
//        }
//
//    }

//    public static void main(String[] args) throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
//        MapperReader<Bean> mapperReader = new MapperReader(Bean.class);
//        mapperReader.read();
//    }
}
