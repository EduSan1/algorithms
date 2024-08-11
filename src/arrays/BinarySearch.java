package arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 35, 37, 46, 56, 65, 73, 75, 78, 80, 81, 82, 89, 93, 96, 99};
        int[] startedList = list;

        list = addItemToList(list, 45);
        list = addItemToList(list, 56);
        list = addItemToList(list, 8);
        list = addItemToList(list, 25);
        list = addItemToList(list, 8);

//        System.out.println("-------------------------------");
//        System.out.println(Arrays.binarySearch(list, 45));

        System.out.println("started List => " + Arrays.toString(startedList));
        System.out.println("new List     => " + Arrays.toString(list));
    }

    private static int[] addItemToList(int[] list, int item) {
        var indexItemNumber = binarySearch(list, item);

        if (indexItemNumber >= 0)
            System.out.println("Item " + item + " already exist in the list");
        else {
            list = updateList(list, Math.abs(indexItemNumber), item);
            System.out.println("Item " + item + " added to list");
        }
        return list;
    }

    private static int binarySearch(int[] list, int item) {
        var minIndex = 0;
        var maxIndex = list.length - 1;

        while (minIndex <= maxIndex) {
            int middle = (minIndex + maxIndex) / 2;
            int middleItem = list[middle];

            if (item == middleItem)
                return middle;
            else if (item < middleItem)
                maxIndex = middle - 1;
            else
                minIndex = middle + 1;
        }

        return maxIndex * -1;
    }

    private static int[] updateList(int[] list, int itemIndex, int item) {
        int[] newList = Arrays.copyOf(list, list.length + 1);
        int index = 0;

        System.out.println(itemIndex);

        while (index <= itemIndex) {
            newList[index] = list[index];
            index++;
        }

        newList[index] = item;
        index++;

        while (index <= list.length) {
            newList[index] = list[index - 1];
            index++;
        }

        return newList;
    }
}
