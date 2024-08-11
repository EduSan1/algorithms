package arrays;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class LinearSearch {

    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4, 5, 6 };
        System.out.println("--------- Linear Search ---------");
        System.out.println(linearSearch(list, 1));
        System.out.println(linearSearch(list, 8));
        System.out.println("--------- Linear Search With Streams ---------");
        linearSearchWithStreams(list, 1).ifPresent(System.out::println);
        linearSearchWithStreams(list, 8).ifPresent(System.out::println);
    }

    private static OptionalInt linearSearchWithStreams(int[] list, int item) {
        return Arrays.stream(list).filter(listItem -> listItem == item).findFirst();
    }

    private static Integer linearSearch(int[] list, int item) {
        for (int current : list) {
            if (current == item)
                return item;
        }
        return null;
    }
}
