/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalc.matrix;

import javacalc.matrix.vector.Col;
import javacalc.matrix.vector.Row;

/**
 *
 * @author rkornas
 */
public class MatrixCalc {
    
        public static Matrix mulMatrix(Matrix mat1, Matrix mat2) {
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
}
