/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalc;

import static java.util.Collections.list;
import java.util.HashMap;

/**
 *
 * @author R
 */
// FRAGMENT DO WATKOW
//    public class Fibonacci implements Runnable {
//    public int seriesElement; // element ciągu
//    private Thread runner;    // wątek
//    ArrayList<Long> fibonacciTable = new ArrayList<Long>(); // tablica elementów ciągu fibonacciego
////--------------------------------------------------------------------------------
//    Fibonacci(int i) { //otwieramy wątek dla obliczeń (dla potestowania, nie jest to tutaj potrzebne)
//        seriesElement = i;
//        if (runner == null) {
//            runner = new Thread(this);
//            runner.start();
//        }
//    }
////--------------------------------------------------------------------------------
//    public void run() {
//        calcFibonacci(seriesElement);
//    }
////--------------------------------------------------------------------------------
public class Fibonacci {

    private int seriesElement; // element ciągu
    private long el;
    private HashMap<Integer, Long> fibonacciTable;

    // konstruktor ustawia dwie pierwsze wartości ciągu na 0 i 1
    public Fibonacci() {
        this.fibonacciTable = new HashMap<>();
        fibonacciTable.put(1, 0L);
        fibonacciTable.put(2, 1L);
    }

    // metoda calcFibonacci(n) uzupełnia tablicę elementami ciągu od 1 do n
    private long calcFibonacci(int strainElement) {
        if (fibonacciTable.size() >= strainElement) {
            el = fibonacciTable.get(strainElement);
        } else {
            el = (calcFibonacci(strainElement - 1) + calcFibonacci(strainElement - 2));
            fibonacciTable.put(strainElement, el);
        }
        return el;
    }

    // metoda zwracająca wartość i-tego elementu ciągu
    public long getFibonacciStrainElement(int i) {
        long element = calcFibonacci(i);
        return element;
    }
    
    // metoda zwracająca Hashmapę wszystkich elementów ciągu
    public HashMap getAllFibonacciStrainElements(int i) {
        calcFibonacci(i);
        return fibonacciTable;
    }
}
