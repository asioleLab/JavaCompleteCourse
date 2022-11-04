package Arrays.exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    private static Scanner scanner = new Scanner(System.in);

    private static int readInteger(){
        System.out.println("Enter integer values.\r");
        int number=scanner.nextInt();
        return number;
    }

    private static int[] readElements(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    private static int findMin(int[] values){
        int min= values[0];

        for(int i=0; i<values.length; i++) {
            if(values[i]<min){
                min=values[i];
            }
            System.out.println("minimo è " + min);
        }

        return min;
    }

    private static int findMinCollection(int[] values){

        int min = Arrays.stream(values).min().getAsInt();
        System.out.println("Il minimo parziale è " + min);

        return min;
    }

    public static void main(String[] args) {
        int number= readInteger();
        int[] array =readElements(number);
//        int minimum= findMin(array);
        int minimum= findMinCollection(array);

        System.out.println("Il minimo è " + minimum);
    }

}
