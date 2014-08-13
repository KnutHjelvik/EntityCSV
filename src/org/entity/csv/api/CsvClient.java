/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.entity.csv.api;

import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.entity.csv.entitycore.CoreEntityMapper;
import org.entity.csv.reading.CSVReader;
import org.entity.csv.row.IReader;
import org.entity.csv.row.RowReader;
import org.entity.csv.example.Bean;
import org.entity.csv.example.Player;
import org.entity.csv.row.Line;

/**
 *
 * @author Knut
 */
public class CsvClient<T> {

    private Class<T> clazz;
    private IReader reader;
    private CoreEntityMapper<T> coreEntityMapper;

    public CsvClient(String filePath, Class<T> clazz) {
        this.clazz = clazz;
        this.reader = new RowReader(new CSVReader(new File(filePath)));
        this.coreEntityMapper = new CoreEntityMapper(clazz, reader);
    }

    public List<T> readEntities(){
        try {
            boolean valid = coreEntityMapper.getEntityPropertyValidation().headersAndPropertiesExists();
            if(valid){
                return coreEntityMapper.readEntities();
            }
        } catch (Exception ex) {
            Logger.getLogger(CsvClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void main(String[] args) throws Exception {
        CsvClient<Player> csvClient = new CsvClient("C:\\SchoolsPlayers.csv", Player.class);
        List<Player> players = csvClient.readEntities();
        for(Player player:players){
            System.out.println(player);
        }
    }

}
