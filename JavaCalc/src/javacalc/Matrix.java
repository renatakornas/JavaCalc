/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalc;

import java.util.Arrays;

/**
 *
 * @author rkornas
 */
public class Matrix {

    int row;
    int column;
    int matrix[][];

    Matrix() {
        this.row = 5;
        this.column = 5;
        this.matrix = new int[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 2;
            }
        }
    }

    void pokaz() {

        for (int i = 0; i < this.row; i++) {
            System.out.println(Arrays.toString(this.matrix[i]));
        }

    }
}
