package com.mycompany.app;

/**
 * This is the main application class.
 */
public class App {

    /**
     * Checks whether a given number is a prime number.
     *
     * @param n The number to be checked
     * @return True if the number is prime, false otherwise
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Main method.
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        // Main method intentionally left blank
    }
}
