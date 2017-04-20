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
class Col {
        private List<Integer> data = new ArrayList<>();

    Col(int el) {
        for (int i = 0; i < el; i++) {
            data.add(2);
        }
    }
    
    Integer get(int i){
        return data.get(i);   
    }
}
