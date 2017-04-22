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

    Matrix(Integer[][] rows) {
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

    public Matrix mulMatrix(Matrix mat1, Matrix mat2) {
        Matrix resultMatrix = new Matrix(mat1.getRowNumber(), mat2.getColNumber());
        Integer el = 0;
        Integer[][] rows = new Integer[mat1.getRowNumber()][mat2.getColNumber()];
        for (int i = 0; i < mat1.getRowNumber(); i++) {
            Row row = mat1.getRow(i);
            for (int j = 0; j < mat2.getColNumber(); j++) {
                Col col = mat2.getCol(j);
                el = resultMatrix.mulRowCol(row, col);
                rows[i][j] = el;
            }
        }
        resultMatrix = new Matrix(rows);

        return resultMatrix;
    }

    void printMatrix() {
        for (int i = 0; i < this.matrix.size(); i++) {
            this.getRow(i).printVector();
        }
    }

}
