package string;

import java.util.Objects;

public class CheckPairParsingAndSearch {
    public static void main(String[] args) {
        String world = "HeLLoo";

        System.out.println(isAtEvenIndex(world, 'L'));
        System.out.println(isAtEvenIndex(world, 'H'));
        System.out.println(isAtEvenIndex(world, 'o'));
        System.out.println(isAtEvenIndex(world, 'e'));
        System.out.println(isAtEvenIndex(world, 'n'));
        System.out.println(isAtEvenIndex("", 'H'));
        System.out.println(isAtEvenIndex(world, 'T'));
        System.out.println(isAtEvenIndex(world, 'U'));
        System.out.println(isAtEvenIndex(world, 'O'));
    }


    public static boolean isAtEvenIndex(String world, char item) {
        if (Objects.isNull(world) || world.isEmpty())
            return false;

        for (int i = 0; i < world.length() / 2 + 1; i= i + 2) {
            if (world.charAt(i) == item)
                return true;
        }
        return false;
    }

}
