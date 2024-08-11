package strings;

import java.util.Objects;

public class CheckPairParsingAndSearch {
    public static void main(String[] args) {
        String word = "HeLLoo";

        System.out.println(isAtEvenIndex(word, 'L'));
        System.out.println(isAtEvenIndex(word, 'H'));
        System.out.println(isAtEvenIndex(word, 'o'));
        System.out.println(isAtEvenIndex(word, 'e'));
        System.out.println(isAtEvenIndex(word, 'n'));
        System.out.println(isAtEvenIndex("", 'H'));
        System.out.println(isAtEvenIndex(word, 'T'));
        System.out.println(isAtEvenIndex(word, 'U'));
        System.out.println(isAtEvenIndex(word, 'O'));
    }


    public static boolean isAtEvenIndex(String word, char item) {
        if (Objects.isNull(word) || word.isEmpty())
            return false;

        for (int i = 0; i < word.length() / 2 + 1; i= i + 2) {
            if (word.charAt(i) == item)
                return true;
        }
        return false;
    }

}
