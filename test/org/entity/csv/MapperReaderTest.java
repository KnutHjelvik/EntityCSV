/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.entity.csv;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.entity.csv.cell.Cell;
import org.entity.csv.cell.CellImpl;
import org.entity.csv.reading.CSVReader;
import org.entity.csv.row.BareLine;
import org.entity.csv.row.HeaderMapping;
import org.entity.csv.row.Line;
import org.entity.csv.row.Row;
import org.entity.csv.row.RowReader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Knut
 */
public class MapperReaderTest {

    public MapperReaderTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of read method, of class MapperReader.
     */
    @Test
    public void testRead() {
//        CSVReader cSVReader = new CSVReader(new File("C:\\CookiesSmall.txt"));
//        RowReader reader = new RowReader(cSVReader);
//        HeaderMapping headerMapping = reader.readHeader();
//        List<Row> rows = reader.readRows();
//        for(Row row: rows){
//            for(Cell cell: row.getCells()){
//                String header = headerMapping.getHeaderName(cell.getColumnIndex());
//                System.out.println(header+": " +cell.getStr());
//            }
//        }

//        String quotes = "\"Tex,t1\",\"Text2\",\"Text3\",\"Text4\"";
//        System.out.println(quotes);
//        Pattern p = Pattern.compile("\"([^\"]*)\"");
//        Matcher m = p.matcher(quotes);
//        List<String> strings = new ArrayList<>();
//        while (m.find()) {
//            strings.add(m.group(1));
//        }
//        
//        for(String s: strings){
//            System.out.println(s);
//        }
//        boolean inQuotes = false;
//        List<String> strings = new ArrayList<>();
//        String[] s = quotes.split("");
//        int tmpIndex = 0;
//        StringBuilder builder = new StringBuilder();
//        StringBuilder tokens = new StringBuilder();
//        for (int i = 0; i < s.length; i++) {
//            String k = s[i];
//            if (k.equals("\"")) {
//                inQuotes = true;
//                int index = i;
//                while (inQuotes) {
//                    if (index + 1 >= s.length) {
//                        break;
//                    }
//                    index++;
//                    String l = s[index];
//                    if (l.equals("\"")) {
//                        inQuotes = false;
//                    }
//                    if(!l.equals("\"")){
//                        builder.append(l);
//                    }
//                    
//                }
//            }
//
//        }
//        System.out.println(builder.toString());
//
//    }
    }

    @Test
    public void sdas() throws IOException {
        String text ="text\ntest";
        System.out.println(text);
        StringReader reader = new StringReader(text);
        int c;
        while ((c = reader.read()) != -1) {
            char character = (char) c;
            System.out.println(character);
        }
        
        char ch = (char)-1;
        System.out.println(ch);
        
    }
}
