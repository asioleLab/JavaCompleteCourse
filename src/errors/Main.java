package errors;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*int x = 98;
        int y = 0;
        System.out.println("divideEAFP: " + divideEAFP(x,y));
        System.out.println("divideLBYB: "+ divideLBYB(x,y));*/

//        int x = getInt();
        int x = getIntLBYB();
        System.out.println("The value of x is "+x);

    }

    private static int getInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        return scanner.nextInt();
    }

    private static int getIntLBYB(){
        Scanner scanner = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Enter an integer");
        String input = scanner.next();
        for (int i= 0; i<input.length();i++){
            if (!Character.isDigit(input.charAt(i))){
                isValid=false;
                break;
            }
        }
        if (isValid){
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int getIntEAFP(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        try {
            return scanner.nextInt();
        }catch (InputMismatchException e){
            return 0;
        }

    }

    private static int divideLBYB(int x, int y){
        if(y!=0){
            return x/y;
        }else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y){
        try {
            return x/y;
        }catch (ArithmeticException e){
            return 0;
        }
    }
}
