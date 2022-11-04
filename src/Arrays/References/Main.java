package Arrays.References;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myArray = new int[5];
        int[] anotherArray = myArray;
        int[] thirdArray = Arrays.copyOf(myArray, myArray.length);

        System.out.println("myArray " + Arrays.toString(myArray));
        System.out.println("anotherArray " + Arrays.toString(anotherArray));
        System.out.println("thirdArray " + Arrays.toString(thirdArray));

        anotherArray[0]=1;

        System.out.println("after change myArray " + Arrays.toString(myArray));
        System.out.println("after change anotherArray " + Arrays.toString(anotherArray));
        System.out.println("after change thirdArray " + Arrays.toString(thirdArray));

//        anotherArray= new int[] {4,5,6,7,8};
        modifyArray(myArray);

        System.out.println("after modify myArray " + Arrays.toString(myArray));
        System.out.println("after modify anotherArray " + Arrays.toString(anotherArray));
        System.out.println("after modify thirdArray " + Arrays.toString(thirdArray));
    }
    private static void modifyArray(int[] array){

        array[0]=2;
        array=new int[]{1,2,3,4,5};
    }
}
