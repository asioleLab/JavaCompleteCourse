package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29",
                "O71");

//        List<String> gNumbers = new ArrayList<>();
//        someBingoNumbers.forEach(number -> {
//            if (number.toUpperCase().startsWith("G")) {
//                System.out.println(number);
//            }
//
//        });
        someBingoNumbers
                .stream()
                .map(num->  num.toUpperCase())
                .filter(num -> num.startsWith("G"))
                .sorted()
                .forEach(System.out::println);
        /*
        .forEach(System.out::println); the long statement of this is (String s) ->  System.out.println(s);
        * */
        List<String> sortedGNumbers = someBingoNumbers
                .stream()
                .map(num->  num.toUpperCase())
                .filter(num -> num.startsWith("G"))
                .sorted()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        for (String sortedGNumber : sortedGNumbers) {
            System.out.println(sortedGNumber);
        }
    }
}