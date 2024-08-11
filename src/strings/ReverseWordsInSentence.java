package strings;

import java.util.Objects;
import java.util.StringJoiner;

public class ReverseWordsInSentence {
    public static void main(String[] args) {
        String s = "Sally is a great worker";
        String result = reverseSentence(s);
        System.out.println(result);
    }

    public static String reverseSentence(String sentence) {
        if (Objects.isNull(sentence) || sentence.isBlank())
            return sentence;

        String[] words = sentence.split(" ");
        StringJoiner reversedSentence = new StringJoiner(" ");

        for (String word : words) {
            reversedSentence.add(reverseWord(word));
        }

        return reversedSentence.toString();
    }

    public static String reverseWord(String word) {
        StringBuilder reversedString = new StringBuilder();

        for(int i = word.length() - 1; i >= 0; i--) {
            reversedString.append(word.charAt(i));
        }

        return reversedString.toString();
    }
}