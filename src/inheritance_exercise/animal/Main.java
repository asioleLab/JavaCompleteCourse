package inheritance_exercise.animal;

public class Main {

    public static void main(String[] args) {
        Animal animal=new Animal("animal",1,1,5,5);
        Dog dog = new Dog("Yorky",8,20,2,4,1,20,"short silk");

        dog.eat();
//        dog.walk();
        dog.run();
    }
}
