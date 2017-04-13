/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalc;

import java.util.ArrayList;

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
//
//        calcFibonacci(seriesElement);
//    }
////--------------------------------------------------------------------------------
public class Fibonacci {

    public int seriesElement; // element ciągu
    ArrayList<Long> fibonacciTable = new ArrayList<Long>(); // tablica elementów ciągu fibonacciego

    public long calcFibonacci(int seriesElement) {
        long el;
        fibonacciTable.add((long) 0);
        fibonacciTable.add((long) 1);
        for (int k = 0; k == seriesElement; k++) { //pozostałą część tablicy wypełniam zerami
            fibonacciTable.add((long) 0);
            System.out.println("k = " + fibonacciTable.get(k));
        }


        if (seriesElement <= 1) {
            el = fibonacciTable.get(seriesElement - 1); //pobieramy z tablicy

        } else {
//            if (fibonacciTable.get(seriesElement - 1) == 0) {
//                el = (calcFibonacci(seriesElement - 1) + calcFibonacci(seriesElement - 2));
//                fibonacciTable.set(seriesElement - 1, el);
//            } else {
//                el = fibonacciTable.get(seriesElement - 1);
//            }
el = 5;
System.out.println("fibonacciTable.get(seriesElement - 1)" + fibonacciTable.get(seriesElement - 1));
        }
        return el;
    }
//--------------------------------------------------------------------------------
//
//    public void viewElement(int i) {
//
//        long element = fibonacciTable.get(i - 1);
//        System.out.println(i + " element ciągu Fibonacciego to: " + element);
//    }
//--------------------------------------------------------------------------------
}
