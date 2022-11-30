package collections;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if(languages.containsKey("Java")){
            System.out.println("Java already exist");
        }else{
            languages.put("Java","a compiled high-level, object oriented, platform independent language");
        }
        languages.put("Python","an interpreted, object oriented, high-level language");
        languages.put("Algol","an algorithmic language");
        System.out.println(languages.put("BASIC","base"));
        System.out.println(languages.put("Lisp","madness"));


        if (languages.containsKey("Java")){
            System.out.println("Languages contains Java");
//            System.out.println(languages.get("Java"));
        }else {
            languages.put("Java","a java course");
//            System.out.println(languages.get("Java"));
        }

        System.out.println("================================================");

        languages.remove("Lisp");
        if(languages.remove("Algol", "an algorithmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }
        if(languages.replace("Lisp", "Therein lies madness", "a functional programming language with imperative features")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }
//        System.out.println(languages.replace("Scala", "this will not be added"));

        for (String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
