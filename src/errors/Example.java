package errors;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println("Result: "+result);
        }catch (ArithmeticException | NoSuchElementException e){
            System.out.println(e.toString());
            System.out.println("unable to perform division");
        }

    }

    private static int divide(){
        int x ;
        int y ;
//        try{
            x = getInt();
            y = getInt();
            System.out.println("x is "+x+" , y is "+y);
            return x/y;
//        }catch (NoSuchElementException e){
//            throw new ArithmeticException("no such element");
//        }catch (ArithmeticException e){
//            throw new ArithmeticException("attempt to divide by zero");
//        }

    }

    private static int getInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert an integer ");
        return scanner.nextInt();
    }
}
