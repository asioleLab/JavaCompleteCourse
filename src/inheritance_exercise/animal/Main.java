package inheritance_exercise.animal;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Animal animal=new Animal("animal",1,1,5,5);
        Dog dog = new Dog("Yorky",8,20,2,4,1,20,"short silk");

        dog.eat();
//        dog.walk();
        dog.run();

        dog.sleep(dog);

        //dog.sleep("pippo");
        dog.type(Arrays.asList(dog,new Fish("fishy",8,8,8,8,8)));
    }
}
