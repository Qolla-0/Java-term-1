package ad231.lashuk;

public class Main {

    public static void main(String[] args) {
        //Task 1
        printEndCheck();
        //Task 2
        printSumNumbers();
        //Task 3
        printLongestBlock();
        //Task 4
        printSearchWords();
        //Task 5
        printMixStrings();
    }

    public static void printEndCheck() {
        System.out.println("Task 1: ");
        System.out.println(EndCheck.isStringEnd("cooked"));
        System.out.println(EndCheck.isStringEnd("ed"));
        System.out.println(EndCheck.isStringEnd("1"));
    }

    public static void printSumNumbers() {
        System.out.println("Task 2: ");
        System.out.println(SumNumbers.isSum("8620"));
        System.out.println(SumNumbers.isSum(null));
        System.out.println(SumNumbers.isSum("Hello"));
        System.out.println(SumNumbers.isSum("Hello123"));
    }

    public static void printLongestBlock() {
        System.out.println("Task 3: ");
        System.out.println(LongestBlock.isBlock("aabcbccbbb"));
        System.out.println(LongestBlock.isBlock("abc"));
        System.out.println(LongestBlock.isBlock(null));
    }

    public static void printSearchWords() {
        System.out.println("Task 4: ");
        System.out.println("Original string: Cat Dog Fox");
        SearchWords.isWords("Cat Dog Fox");
    }

    public static void printMixStrings() {
        System.out.println("Task 5: ");
        System.out.println("First string: olya");
        System.out.println("Second string: 19102005");
        String mix = MixStrings.mixedStrings("olya", "19102005");
        System.out.println("Mixed strings: " + mix);
    }
}