package string;

public class isPasswordComplex {

    public static void main(String[] args) {
        System.out.println(algorithm("helL0"));
        System.out.println(algorithm("Hello"));
        System.out.println(algorithm("HELLO"));
        System.out.println(algorithm("hello"));
    }

    public static boolean algorithm(String value) {
        return value.chars().anyMatch(Character::isUpperCase) &&
                value.chars().anyMatch(Character::isLowerCase) &&
                value.chars().anyMatch(Character::isDigit);
    }
}
