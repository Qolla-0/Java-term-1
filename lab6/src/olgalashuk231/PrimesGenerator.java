package olgalashuk231;

import java.util.*;

public class PrimesGenerator implements Iterable<Integer> {
    private List<Integer> primes;
    public PrimesGenerator(int n) {
        primes = new ArrayList<>();
        generatePrimes(n);
    }

    private void generatePrimes(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
    }

    private boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Iterator<Integer> iterator() {
        return primes.iterator();
    }

    public Iterator<Integer> reverseIterator() {
        List<Integer> reversedPrimes = new ArrayList<>(primes);
        Collections.reverse(reversedPrimes);
        return reversedPrimes.iterator();
    }
}
