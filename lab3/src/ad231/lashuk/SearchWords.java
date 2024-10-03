package ad231.lashuk;

public class SearchWords {

    public static void isWords(String input) {

        if (input == null || input.length() == 0) {
            System.out.println("Empty String");
        }

        String[] words = input.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}
