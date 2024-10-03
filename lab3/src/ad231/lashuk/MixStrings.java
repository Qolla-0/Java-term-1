package ad231.lashuk;

public class MixStrings {

    public static String mixedStrings(String a, String b) {

        if (a == null || b == null) {
            System.out.println("Empty String");
        }

        String mix = " ";

        int min = Math.min(a.length(), b.length());

        for (int i = 0; i < min; i++) {
            mix = mix + a.charAt(i);
            mix = mix + b.charAt(i);
        }

        if (a.length() > min) {
            mix = mix + a.substring(min);
        }

        if (b.length() > min) {
            mix = mix + b.substring(min);
        }

        return mix;
    }
}
