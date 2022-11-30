package collections.adventure.challenge;

import java.util.ArrayList;
import java.util.List;


public class Order {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(3);
        li.add(36);
        li.add(2);
        li.add(0);
        li.add(30000);
        System.out.println( sortList(li));

    }
    public static int sortList(List<Integer> lista){
        int min=lista.get(0);
        for(Integer i:lista){
            if(i<min){
                min=i;
            }
        }
        return min;
    }

}
