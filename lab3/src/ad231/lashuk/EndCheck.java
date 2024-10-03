package ad231.lashuk;

public class EndCheck {

    public static boolean isStringEnd(String input) {

        if (input != null && input.length() >= 2) {
            int length = input.length();
            String sublength = input.substring(length - 2);
            return sublength.equals("ed");
        }
        return false;
    }
}
