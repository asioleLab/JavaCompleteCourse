package errors;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        int result = divide();
        System.out.println("Result: "+result);
    }

    private static int divide(){
        int x ;
        int y ;
        try{
            x = getInt();
            y = getInt();
        }catch (NoSuchElementException e){
            throw new ArithmeticException("no such element");
        }
        System.out.println("x is "+x+" , y is "+y);
        try {
            return x/y;
        }catch (ArithmeticException e){
            throw new ArithmeticException("attempt to divide by zero");
        }
    }

    private static int getInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert an integer ");
        return scanner.nextInt();
    }
}
