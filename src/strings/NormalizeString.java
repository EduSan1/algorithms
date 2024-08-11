package strings;

public class NormalizeString {

    public static void main(String[] args) {
        System.out.println(algorithm("  heLlO TheRe,,, BUddy    "));
    }

    public static String algorithm(String value) {
        return value.toLowerCase().trim().replace(",", "");
    }
}
