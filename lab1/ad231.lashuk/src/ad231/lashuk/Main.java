package ad231.lashuk;

public class Main {

    public static void main(String[] args) {
        /*
         * Перевірка масивів
         */
        int[] arrayRegular = {1, 7, 11, 20};
        int[] arrayIrregular = {1, 20, 11, 7};

        System.out.println(" Перший масив регулярнй за зростанням : " + checkArray(arrayRegular));
        System.out.println(" Другий масив регулярний за зростанням : " + checkArray(arrayIrregular));

        /*
         * Виклик методу
         */
        fizzBuzz();

        /*
         * Перевірка масивів
         */
        int[] arrayCorrect = {1, 1, 1, 1, 2};
        int[] arrayIncorrect = {2, 1, 1, 2, 1};
        int[] arrayEqual = {10, 10};

        System.out.println(" Method 1 : " + splitMiddle(arrayCorrect));
        System.out.println(" Method 2 : " + splitMiddle(arrayIncorrect));
        System.out.println(" Method 3 : " + splitMiddle(arrayEqual));
    }

    /**
     * Завдання 1
     */
    static boolean checkArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Завдання 2
     */
    static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(" FizzBuzz ");
            } else if (i % 5 == 0) {
                System.out.print(" Buzz ");
            } else if (i % 3 == 0) {
                System.out.print(" Fizz ");
            } else {
                System.out.print(" " + i + " ");
            }
        }
    }

    /**
     * Завдання 3
     */
    static boolean splitMiddle(int [] array) {
        int length = array.length;
        int sumLeft = 0;
        int sumRight = 0;
        int middle = length / 2;

        if (length % 2 == 0) {
            for (int i = 0; i < middle; i++) {
                sumLeft += array[i];
            }
            for (int i = middle; i < length; i++) {
                sumRight += array[i];
            }
        } else {
            for (int i = 0; i <= middle; i++) {
                sumLeft += array[i];
            }
            for (int i = middle + 1; i < length; i++) {
                sumRight += array[i];
            }
        }
        return sumLeft == sumRight;
    }
}