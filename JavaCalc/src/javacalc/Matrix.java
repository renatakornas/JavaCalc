/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rkornas
 */
public class Matrix {

    private List<Row> matrix;

    Matrix(int rowNum, int colNum) {
        matrix = new ArrayList<>();
        for (int i = 0; i < rowNum; i++) {
            matrix.add(new Row(colNum));
        }
    }

    Row getRow(int i) {
        return matrix.get(i);
    }

    Col getCol(int i) {
        Col result = new Col(i);
        for (Row row : matrix) {
            result.get(i);
        }
        return result;
    }

    Integer mulRowCol(List<Integer> x, List<Integer> y) {
        Integer result = 0;
        for (int i : x) {
            Integer z = x.get(i) * y.get(i);
            result = result + z;
        }
        return result;
    }

    void printMatrix() {
        for (int i = 0; i < this.matrix.size(); i++) {
            this.getRow(i).printRow();
        }
    }
}
