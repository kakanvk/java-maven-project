package com.mycompany.app;

/**
 * This class provides utility methods for checking prime numbers.
 */
public final class App {

    private App() {
        // private constructor to prevent instantiation
        throw new AssertionError("Utility class - cannot be instantiated");
    }

    /**
     * Checks whether a given number is a prime number.
     *
     * @param n The number to be checked
     * @return True if the number is prime, false otherwise
     */
            public static boolean isPrime(final int n) {
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
    public static void main(final String[] args) {
        // Main method intentionally left blank
    }
}
