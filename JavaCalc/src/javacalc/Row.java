/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author rkornas
 */
class Row extends Vector {

    Row(int el) {
        for (int i = 0; i < el; i++) {
            data.add(2);
        }
    }

    Row(Integer[] row) {
        data.addAll(Arrays.asList(row));
//        for (Integer rowElement : row) {
//            data.add(rowElement);
    }

}
