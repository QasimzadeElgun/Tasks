/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Elgun
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int primeCounter = 0;
        int i = 0;
        int sum = 0;
        while (primeCounter <= 1000) {

            if (i != 0) {
                if (i != 1) {
                    if (primeCheck(i)) {
                        primeCounter++;
                        sum += i;
                    }
                }
            }
            if (primeCounter == 1000) {
                break;
            }
            i++;
        }
        System.out.println("The sum of the first 1000 prime numbers is "+sum);
    }

    static boolean primeCheck(int number) {
        int half = number / 2;
        for (int j = 2; j <= half; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }

}
