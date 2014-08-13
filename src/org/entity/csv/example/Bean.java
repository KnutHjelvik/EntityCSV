/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.entity.csv.example;

import org.entity.csv.annotation.Column;
import org.entity.csv.common.ColumnType;

/**
 *
 * @author Knut
 */
public class Bean {

    @Column(header = "by", type = ColumnType.TEXT)
    private String city;
    @Column(header = "Navn", type = ColumnType.TEXT)
    private String name;
    @Column(header = "adresse", type = ColumnType.TEXT)
    private String adress;
    @Column(header = "number", type = ColumnType.DOUBLE)
    private double number;

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Bean{" + "city=" + city + ", name=" + name + ", adress=" + adress + ", number=" + number + '}';
    }

}