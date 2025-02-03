package org.example;

public class App {
    public static void main(String[] args) {
        Factorizer factorizer = new Factorizer();

        System.out.println(factorizer.primeFactors(100)); // [2, 2, 5, 5]
        System.out.println(factorizer.isPrime(17)); // true
        System.out.println(factorizer.isComposite(24)); // true
        System.out.println(factorizer.reduce(12, 26)); // "6/13"
    }
}
