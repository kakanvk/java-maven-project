package com.mycompany.app;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
    @Test
    public void testIsPrime() {
        assertTrue(App.isPrime(2));
        assertTrue(App.isPrime(3));
        assertTrue(App.isPrime(5));
        assertTrue(App.isPrime(7));
        assertTrue(App.isPrime(11));
        assertTrue(App.isPrime(7919));
        assertTrue(App.isPrime(1257787));
        assertTrue(App.isPrime(3021377));
        
        assertFalse(App.isPrime(4));
        assertFalse(App.isPrime(6));
        assertFalse(App.isPrime(8));
        assertFalse(App.isPrime(9));
        assertFalse(App.isPrime(10));
        assertFalse(App.isPrime(12));
    }
}
