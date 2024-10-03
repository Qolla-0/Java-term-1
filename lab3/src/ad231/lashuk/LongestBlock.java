package ad231.lashuk;

public class LongestBlock {

    public static String isBlock(String input) {

        if (input == null || input.length() == 0) {
            return "Empty string";
        }

        int maxBlock = 1;
        int currentBlock = 1;
        char longestBlockChar = input.charAt(0);
        String longestSequence = " ";

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                currentBlock++;
            } else {
                if (currentBlock > maxBlock) {
                    maxBlock = currentBlock;
                    longestBlockChar = input.charAt(i - 1);
                }
                currentBlock = 1;
            }
        }

        if (currentBlock > maxBlock) {
            maxBlock = currentBlock;
            longestBlockChar = input.charAt(input.length() - 1);
        }

        for (int j = 0; j < maxBlock; j++) {
            longestSequence = longestSequence + longestBlockChar;
        }

        return longestSequence;
    }
}
