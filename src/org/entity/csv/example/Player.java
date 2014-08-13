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
public class Player {

    @Column(header = "playerID", type = ColumnType.TEXT)
    private String playerID;
    @Column(header = "schoolID", type = ColumnType.TEXT)
    private String schoolID;
    @Column(header = "yearMax", type = ColumnType.INTEGER)
    private int yearMax;
    @Column(header = "yearMin", type = ColumnType.INTEGER)
    private int yearMin;

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public void setSchoolID(String schoolID) {
        this.schoolID = schoolID;
    }

    public int getYearMax() {
        return yearMax;
    }

    public void setYearMin(int yearMin) {
        this.yearMin = yearMin;
    }

    public String getPlayerID() {
        return playerID;
    }

    public String getSchoolID() {
        return schoolID;
    }

    public int getYearMin() {
        return yearMin;
    }

    public void setYearMax(int yearMax) {
        this.yearMax = yearMax;
    }

    @Override
    public String toString() {
        return "Player{" + "playerID=" + playerID + ", schoolID=" + schoolID + ", yearMax=" + yearMax + ", yearMin=" + yearMin + '}';
    }
    
    

}
