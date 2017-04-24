/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalc;

import javacalc.fibonacci.Fibonacci;
import java.math.BigDecimal;
import java.util.HashMap;
import javacalc.matrix.Matrix;
import javacalc.matrix.MatrixCalc;

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

        //////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n\n\n Mnożenie macierzy - mnożenie Cauchy'ego - zdefiniowane wyłącznie dla macierzy, z których pierwsza ma tyle kolumn, co druga wierszy");
//        Matrix firstMatrix = new Matrix(5, 2);
//        Matrix secondMatrix = new Matrix(2, 5);

        System.out.println("\nPierwsza macierz");
        Integer[][] mat = {{1, 5}, {2, 4}, {1, 3}, {1, 1}};
        Matrix firstMatrix = new Matrix(mat);
        firstMatrix.printMatrix();
        System.out.println("\nDruga macierz");
        Integer[][] mat1 = {{3, 6, 1}, {1, 4, 2}};
        Matrix secondMatrix = new Matrix(mat1);
        secondMatrix.printMatrix();

        System.out.println("\nWynik mnożenia");

        Matrix resultMatrix = MatrixCalc.mulMatrix(firstMatrix, secondMatrix);

        resultMatrix.printMatrix();
    }
}
