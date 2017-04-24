/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalc.matrix;

import javacalc.matrix.vector.Col;
import javacalc.matrix.vector.Row;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rkornas
 */
public class Matrix {

    private List<Row> matrix;

    public Matrix(int rowNum, int colNum) {
        matrix = new ArrayList<>();
        for (int i = 0; i < rowNum; i++) {
            matrix.add(new Row(colNum));
        }
    }

    public Matrix(Integer[][] rows) {
        matrix = new ArrayList<>();
        for (Integer[] row : rows) {
            matrix.add(new Row(row));
        }
    }

    Row getRow(int i) {
        return matrix.get(i);
    }

    int getRowNumber() {
        return matrix.size();
    }

    Col getCol(int i) {
        Col col = new Col(0);
        for (int j = 0; j < matrix.size(); j++) {
            col.data.add(getRow(j).get(i));
        }
        return col;
    }

    int getColNumber() {
        return this.getRow(0).data.size();
    }

    Integer mulRowCol(Row row, Col col) {
        Integer result = 0;
        for (int i = 0; i < row.data.size(); i++) {
            Integer z = row.get(i) * col.get(i);
            result = result + z;
        }
        return result;
    }

    public void printMatrix() {
        for (int i = 0; i < this.matrix.size(); i++) {
            this.getRow(i).printVector();
        }
    }

}
