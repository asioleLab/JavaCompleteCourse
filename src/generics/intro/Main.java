package generics.intro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        printArrayList(arrayList);
    }

    private static void printArrayList(ArrayList<Integer> arrayList){
        for (int arr:arrayList){
            System.out.println( arr*2);
        }
    }
}
