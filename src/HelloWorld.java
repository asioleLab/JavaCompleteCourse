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

    }
}
