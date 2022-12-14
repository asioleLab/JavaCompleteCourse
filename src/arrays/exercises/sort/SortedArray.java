package arrays.exercises.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortedArray {
    private static Scanner scanner = new Scanner(System.in);
    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static int[] sortIntegersBase(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            // element 0     160
            // element 1     50
            // element 2     40

            for(int i=0; i<sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;

    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);

        sortedArray=Arrays.stream(sortedArray).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        return sortedArray;

    }


    public static void printArray(int[] arraytoPrint){
        for(int i=0; i<arraytoPrint.length; i++) {
            System.out.println("Element "+ i + " contents " + arraytoPrint[i]);
        }
    }
}
