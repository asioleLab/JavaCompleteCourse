import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args){
        System.out.println("Hello, this is my first java program");

        int firstNumber=5;
        System.out.println("The value of the variable firstNumber is "+firstNumber);

        int minIntValue=Integer.MIN_VALUE;
        int maxIntValue=Integer.MAX_VALUE;
        System.out.println("Integer minimum value = "+ minIntValue + " and maximum value = " + maxIntValue);

        byte minByteValue=Byte.MIN_VALUE;
        byte maxByteValue=Byte.MAX_VALUE;
        System.out.println("Byte minimum value = "+ minByteValue + " and maximum value = " + maxByteValue);

        short minShortValue=Short.MIN_VALUE;
        short maxShortValue=Short.MAX_VALUE;
        System.out.println("Short minimum value = "+ minShortValue + " and maximum value = " + maxShortValue);

        int total = (minIntValue / 2);
        byte newByteValue = (byte) (minByteValue / 2);

        short newShortValue = (short) (minShortValue / 2);

        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        int myInt = scanner.nextInt();
        scanner.close();

        System.out.println("myString is: " + myString);
        System.out.println("myInt is: " + myInt);
    }
}
