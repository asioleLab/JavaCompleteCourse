package Car;

import Car.Car;

public class Main {

    public static void main(String[] args) {
//        System.out.println("This is a Car.Main");
        Car lamborghini = new Car();
        Car merchedes = new Car();
        lamborghini.setModel("Diablo");
        System.out.println("Model is: "+ lamborghini.getModel());
    }
}
