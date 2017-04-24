/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalc.matrix.vector;

import java.util.Arrays;

/**
 *
 * @author rkornas
 */
public class Row extends Vector {

    public Row(int el) {
        for (int i = 0; i < el; i++) {
            data.add(2);
        }
    }

    public Row(Integer[] row) {
        data.addAll(Arrays.asList(row));
//        for (Integer rowElement : row) {
//            data.add(rowElement);
    }

}
