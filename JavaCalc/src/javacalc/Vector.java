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
 * @author R
 */
public class Vector {

    protected List<Integer> data = new ArrayList<>();

    Integer get(int i) {
        return data.get(i);
    }

    public void printVector() {
        String vectorStr = "[";
        for (int i = 0; i < this.data.size(); i++) {
            vectorStr = vectorStr + " " + this.get(i);
        }
        vectorStr = vectorStr + " ]";
        System.out.println(vectorStr);
    }
}
