/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalc;

import java.math.BigDecimal;
import java.util.Arrays;
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
        int i = 200;
        Fibonacci fib = new Fibonacci();
//        long start = System.currentTimeMillis();
        BigDecimal el = fib.getFibonacciStrainElement(i);
//        long diff = System.currentTimeMillis() - start;
//        System.out.println("diff " + diff);

        System.out.println(i + " wyraz ciągu Fibonacciego to: " + el + "\n");

        HashMap fibAll = fib.getAllFibonacciStrainElements(i);
        for (int j = 1; j <= fibAll.size(); j++) {
            System.out.println(j + " element ciągi Fibonacciego to: " + fibAll.get(j));
        }

        //////////////////////////////////////////////
        System.out.println("\n\n\n Mnożenie macierzy");
        
        System.out.println("\nPierwsza macierz");
        Matrix firstMatrix = new Matrix(5,2);
        firstMatrix.show();
        System.out.println("\nDruga macierz");
        Matrix secondMatrix = new Matrix(2,5);
        secondMatrix.show();

        
        System.out.println("\nWynik mnożenia");
//        resultMatrix.show();
    }
}
