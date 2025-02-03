package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Factorizer {
   public ArrayList<Integer> primeFactors(Integer n) {
        ArrayList<Integer> factors = new ArrayList<>();

        if (n <= 1) {
            return factors;
        }

        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }

        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        if (n > 2) {
            factors.add(n);
        }

        return factors;
    }

    public boolean isPrime(int n) {
        return n > 1 && primeFactors(n).size() == 1;
    }

    public boolean isComposite(int n) {
        return n > 1 && primeFactors(n).size() > 1;
    }

    public String reduce(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }

        ArrayList<Integer> numFactors = primeFactors(numerator);
        ArrayList<Integer> denFactors = primeFactors(denominator);

        numFactors.retainAll(denFactors);
        int gcd = numFactors.isEmpty() ? 1 : Collections.max(numFactors);

        int reducedNumerator = numerator / gcd;
        int reducedDenominator = denominator / gcd;

        return reducedDenominator == 1 ? String.valueOf(reducedNumerator) : reducedNumerator + "/" + reducedDenominator;
    }
}
