/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalc;

import java.util.HashMap;

/**
 *
 * @author R
 */
public class JavaCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 90;
        Fibonacci fib = new Fibonacci();
        long el = fib.getFibonacciStrainElement(i);
        System.out.println(i + " wyraz ciągu Fibonacciego to: " + el +"\n");

        HashMap fibAll = fib.getAllFibonacciStrainElements(i);
        for (int j = 1; j <= fibAll.size(); j++) {
            System.out.println(j + " element ciągi Fibonacciego to: " + fibAll.get(j));
        }
    }
}
