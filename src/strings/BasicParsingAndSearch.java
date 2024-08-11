package string;

public class BasicParsingAndSearch {
    public static void main(String[] args) {
        String world = "HeLLo";
        System.out.println(world.contains("LL"));

        parseContents(world);
    }

    public static void parseContents(String world) {
        System.out.println("Option 1");
        for (char c : world.toCharArray()) {
            System.out.print(c);
        }

        System.out.println("\nOption 2");
        for (int i = 0; i < world.length(); i++) {
            char c = world.charAt(i);
            System.out.print(c);
        }
    }

}
