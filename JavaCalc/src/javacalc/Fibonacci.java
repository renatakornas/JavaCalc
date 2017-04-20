/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalc;

import java.math.BigDecimal;
import java.util.HashMap;

/**
 *
 * @author R
 */
public class Fibonacci {

    private int seriesElement; // element ciągu
    private BigDecimal el;
    private final HashMap<Integer, BigDecimal> fibonacciTable;

    // konstruktor ustawia dwie pierwsze wartości ciągu na 0 i 1
    public Fibonacci() {
        this.fibonacciTable = new HashMap<>();
        fibonacciTable.put(1, BigDecimal.ZERO);
        fibonacciTable.put(2, BigDecimal.ONE);
    }

    // metoda calcFibonacci(n) uzupełnia tablicę elementami ciągu od 1 do n
    private BigDecimal calcFibonacci(int strainElement) {
        if (fibonacciTable.size() >= strainElement) {
            el = fibonacciTable.get(strainElement);
        } else {
            el = (calcFibonacci(strainElement - 1).add(calcFibonacci(strainElement - 2)));
            fibonacciTable.put(strainElement, el);
        }
        return el;
    }

    // metoda zwracająca wartość i-tego elementu ciągu
    public BigDecimal getFibonacciStrainElement(int i) {
        BigDecimal element = calcFibonacci(i);
        return element;
    }
    
    // metoda zwracająca Hashmapę wszystkich elementów ciągu
    public HashMap getAllFibonacciStrainElements(int i) {
        calcFibonacci(i);
        return fibonacciTable;
    }
}
