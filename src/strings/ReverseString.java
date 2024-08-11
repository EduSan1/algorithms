package strings;

import java.util.Objects;

public class ReverseString {
    public static String reverse(String word) {
        if (Objects.isNull(word) || word.isBlank())
            return word;

        StringBuilder reversedWorld = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWorld.append(word.charAt(i));
        }
        return reversedWorld.toString();
    }

    public static String stringBuilderReverse(String word) {
        if (Objects.isNull(word) || word.isBlank())
            return word;

        StringBuilder reversedWorld = new StringBuilder(word);
        return reversedWorld.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("Hello world!"));
        System.out.println("-----");
        System.out.println(stringBuilderReverse("Hello world!"));
    }
}