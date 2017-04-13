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
public class JavaCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long i = 50; 
        Fibonacci fib = new Fibonacci(i);

        long elementFib = fib.calcFibonacci(i);
        fib.viewElement(i);
    }

}
