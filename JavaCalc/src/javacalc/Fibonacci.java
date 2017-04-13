/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalc;

/**
 *
 * @author R
 */
public class Fibonacci implements Runnable {

    public long seriesElement;
        private Thread runner;

//    public Fibonacci(long i) {
//        this.calcFibonacci(i);
//    }

    Fibonacci(long i) {
        seriesElement = i;
        if (runner == null) {
            runner = new Thread(this);
            runner.start();
        }
    }

    public void run() {
        
        calcFibonacci(seriesElement);
    }

    public long calcFibonacci(long i) {
        if (i <= 1) {
            return i;
        } else {
            return (calcFibonacci(i - 1) + calcFibonacci(i - 2));
        }
    }

    public void viewElement(long i) {

        long element = this.calcFibonacci(i);
        System.out.println(i + " element ciągu Fibonacciego to: " + element);
    }
}
