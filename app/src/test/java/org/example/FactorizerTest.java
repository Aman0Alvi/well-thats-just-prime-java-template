package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class FactorizerTest {
    @Test
    void itReturnsAnEmptyListForZero() {
        Factorizer factorizer = new Factorizer();
        assertEquals(new ArrayList<Integer>(), factorizer.primeFactors(0));
    }

    @Test
    void itReturnsAnEmptyListForOne() {
        Factorizer factorizer = new Factorizer();
        assertEquals(new ArrayList<Integer>(), factorizer.primeFactors(1));
    }

    @Test
    void itReturnsCorrectFactorsForPrimeNumbers() {
        Factorizer factorizer = new Factorizer();
        assertEquals(Arrays.asList(17), factorizer.primeFactors(17));
    }

    @Test
    void itReturnsCorrectFactorsForCompositeNumbers() {
        Factorizer factorizer = new Factorizer();
        assertEquals(Arrays.asList(2, 2, 5, 5), factorizer.primeFactors(100));
        assertEquals(Arrays.asList(3, 3), factorizer.primeFactors(9));
        assertEquals(Arrays.asList(2, 5), factorizer.primeFactors(10));
    }
}
