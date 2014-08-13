package org.entity.csv.row;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.entity.csv.cell.Cell;
import org.entity.csv.cell.DefaultCellFactory;
import org.entity.csv.cell.ICellFactory;
import org.entity.csv.cell.QuotedCellFactory;
import org.entity.csv.common.Delimiter;
import org.entity.csv.reading.CSVReader;

/**
 *
 * @author Knut
 */
public class RowReader implements IReader {

    private final CSVReader cSVReader;
    private final Delimiter delimiter;
    private ICellFactory<Line> quotedCellFactory;
    private HeaderMapping headerMapping;
    private int rowIndex = 0;

    /**
     *
     * @param reader
     */
    public RowReader(CSVReader reader) {
        this.cSVReader = reader;
        this.delimiter = new Delimiter(',');
        this.quotedCellFactory = new DefaultCellFactory(delimiter);
        this.headerMapping = new HeaderMapperImpl();
        d("using default delimiter => ;");

    }

    public RowReader(CSVReader reader, Delimiter delimiter) {
        this.cSVReader = reader;
        this.delimiter = delimiter;
    }

    @Override
    public List<Row> readRows() {
        if(!headerMapping.hasMapped())
            readHeader();
        Line line;
        List<Row> rows = new ArrayList<>();
        while ((line = cSVReader.readLine()).getRawLine() != null) {
            List<Cell> cells = quotedCellFactory.createCells(line);
            incrementRowIndex();
            Row row = new RowImpl(rowIndex, cells);
            rows.add(row);
        }
        return rows;
    }

    @Override
    public HeaderMapping readHeader() {
        HeaderLine headerLine = cSVReader.readHeader();
        List<Cell> cells = quotedCellFactory.createCells(headerLine);
        mapHeaders(cells);
        return headerMapping;
    }

    private void mapHeaders(List<Cell> cells) {
        for(Cell cell:cells){
            headerMapping.mapHeader(cell.getColumnIndex(), cell.getStr());
        }
    }

    private void d(String message) {
        Logger.getLogger(this.getClass().getName()).log(Level.INFO, message);
    }

    @Override
    public int incrementRowIndex() {
        return this.rowIndex++;
    }
}
