package ad231.lashuk;

public class SumNumbers {

    public static int isSum(String input) {

        if(input != null) {
            int sum = 0;
            for(int i = 0; i < input.length(); i++) {
                char currentNum = input.charAt(i);
                if(Character.isDigit(currentNum)) {
                    sum += Character.getNumericValue(currentNum);
                }
            }
            return sum;
        }
        return 0;
    }
}
