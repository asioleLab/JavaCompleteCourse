package lambda_functions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main_new {

    public static void main(String[] args) {
        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);
        Employee red = new Employee("Red RidingHood", 35);
        Employee charming = new Employee("Prince Charming", 31);
        Employee test = new Employee("Prince Blu Charming", 31);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);
        employees.add(red);
        employees.add(charming);
        employees.add(test);



        Function<Employee,String> getLastName = (Employee employee) ->{
            return employee.getName().substring(employee.getName().indexOf(' ')+1);
        };

        String lastName = getLastName.apply(employees.get(1));
//        System.out.println(lastName);

        Function<Employee, String> getFirstName = (Employee employee) -> {
            return employee.getName().substring(0, employee.getName().indexOf(' '));
        };

        for (Employee employee:employees) {
//            String completeName = employee.getName();
            String completeName = "Prince Blu Green Charming";
            int occurency = getOccurency(completeName);
//        chiamata per nome
            List<String> nameSplitted = new ArrayList<>();
            String firstName;
            String lastname;

            nameSplitted = getNameSplitted(completeName, occurency);


//        String name = getName();
           firstName=nameSplitted.get(0);
            lastname= nameSplitted.get(1);
            System.out.println("Name: "+ firstName + " lastName: "+ lastname);
        }

        Random random1 = new Random();
        for(Employee employee : employees) {
            if(random1.nextBoolean()) {
                System.out.println(getAName(getFirstName, employee));
            } else {
                System.out.println(getAName(getLastName, employee));
            }
        }
    }

    private static String getAName(Function<Employee, String> getName, Employee employee) {
        return getName.apply(employee);
    }

    private static void printEmployeesByAge(List<Employee> employees,
                                            String ageText,
                                            Predicate<Employee> ageCondition) {

        System.out.println(ageText);
        System.out.println("==================");
        for(Employee employee : employees) {
            if (ageCondition.test(employee)) {
                System.out.println(employee.getName());
            }
        }
    }

    private static int getOccurency(String completeName){
        return completeName.split(" ").length;
    }

    private static List<String> getNameSplitted(String completeName, int occurrency){
        List<String> result = new ArrayList<>();

//        if(occurrency==3){
            int k=0;
            if (occurrency<2){
               return Collections.emptyList();
            }else if(occurrency==2){
                k=0;
            }else if (occurrency==3){
                k=1;
            }else if (occurrency>=4){
                k=2;
            }
            String[] res= completeName.split(" ");
            String temp="";
            String temp2="";
            for(int i= 0; i<occurrency-k;i++){
//                if(i==occurrency-2){
//                    temp= temp + res[i];
//                }else{
//                    temp= temp + res[i] + " ";
//                }
                temp= temp+res[i]+(i!=occurrency-k-1?" ": "");
            }
            for(int i= occurrency-k;i<res.length;i++){
                temp2= temp2+res[i]+(i!=res.length-1?" ": "");
            }
           result.add(0, temp);
           result.add(1, temp2);
//        }
        return result;
    }


}


