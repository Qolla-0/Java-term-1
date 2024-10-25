package olgalashuk231;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        exploreList();
        PrimesGeneratorTest.generatePrimesTest();
        TestClass.testSet();
    }

    public static void exploreList() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("a) Створіть масив із N чисел: " + Arrays.toString(array));

        List<Integer> list = new ArrayList<>();
        for (int n : array) {
            list.add(n);
        }
        System.out.println("b) На основі масиву створіть список List: " + list);

        Collections.sort(list);
        System.out.println("c) Відсортуйте список у натуральному порядку: " + list);

        Collections.reverse(list);
        System.out.println("d) Відсортуйте список у зворотному порядку: " + list);

        Collections.shuffle(list);
        System.out.println("e) Перемішайте список: " + list);

        Collections.rotate(list, 1);
        System.out.println("f) Виконайте циклічний зсув на 1 елемент: " + list);

        List<Integer> uniqueList = new ArrayList<>();
        List<Integer> duplicatesList = new ArrayList<>();
        Set<Integer> encountered = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int n : array) {
            if (!encountered.add(n)) {
                duplicates.add(n);
            }
        }

        for (int n : array) {
            if (!duplicates.contains(n)) {
                uniqueList.add(n);
            }
        }

        duplicatesList.addAll(duplicates);

        System.out.println("g) Залишіть у списку лише унікальні елементи: " + uniqueList);
        System.out.println("h) Залишіть у списку лише елементи, що дублюються: " + duplicatesList);

        Integer[] arrayList = list.toArray(new Integer[list.size()]);
        System.out.println("i) Зі списку отримайте масив: " + Arrays.toString(arrayList));
    }
}