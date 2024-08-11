package strings;

public class IsLowerCase {

    public static void main(String[] args) {
        System.out.println(algorithm("Hello"));
        System.out.println(algorithm("HELLO"));
        System.out.println(algorithm("hello"));
    }

    public static boolean algorithm(String value) {
        return value.chars().allMatch(Character::isLowerCase);
    }
}

