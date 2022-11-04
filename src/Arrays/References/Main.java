package Arrays.References;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myArray = new int[5];
        int[] anotherArray = myArray;
        int[] thirdArray = Arrays.copyOf(myArray, myArray.length);

        System.out.println("myArray " + Arrays.toString(myArray));
        System.out.println("anotherArray " + Arrays.toString(anotherArray));
        System.out.println("anotherArray " + Arrays.toString(thirdArray));

        anotherArray[0]=1;

        System.out.println("myArray " + Arrays.toString(myArray));
        System.out.println("anotherArray " + Arrays.toString(anotherArray));
        System.out.println("anotherArray " + Arrays.toString(thirdArray));
    }
}
