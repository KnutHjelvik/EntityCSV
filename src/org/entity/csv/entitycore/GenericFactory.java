/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.entity.csv.entitycore;

/**
 *
 * @author Knut
 */
public class GenericFactory<T> {

    public T create(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (Exception ex) {
            System.out.println("bad");
        }
        return null;
    }
}
