package strings;

public class BasicParsingAndSearch {
    public static void main(String[] args) {
        String word = "HeLLo";
        System.out.println(word.contains("LL"));

        parseContents(word);
    }

    public static void parseContents(String word) {
        System.out.println("Option 1");
        for (char c : word.toCharArray()) {
            System.out.print(c);
        }

        System.out.println("\nOption 2");
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            System.out.print(c);
        }
    }

}
