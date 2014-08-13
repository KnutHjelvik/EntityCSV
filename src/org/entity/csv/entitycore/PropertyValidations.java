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
class PropertyValidations {

    private final int neededValidations;
    private int currentValidations;

    public PropertyValidations(int initialValidations) {
        this.neededValidations = initialValidations;
    }

    public void incrementValidation() {
        currentValidations++;
    }

    public void decrementValidation() {
        currentValidations--;
    }

    public boolean isValid() {
        return neededValidations == currentValidations;
    }

}
