package olgalashuk231;

import java.util.*;

public class PrimesGeneratorTest {
    public static void generatePrimesTest(){
        int n = 15;

        PrimesGenerator pg = new PrimesGenerator(n);

        System.out.print("Прості числа у прямому порядку: ");
        for (int prime : pg) {
            System.out.print(prime + " ");
        }

        Iterator<Integer> reverseIterator = pg.reverseIterator();

        System.out.print("\nПрості числа у зворотному порядку: ");
        while (reverseIterator.hasNext()) {
            System.out.print(reverseIterator.next() + " ");
        }
    }
}
