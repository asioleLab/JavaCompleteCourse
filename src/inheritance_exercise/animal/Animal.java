package inheritance_exercise.animal;

import java.util.Collection;
import java.util.List;

public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Animal eat() called");
    }

    public void move(int speed){
        System.out.println("Animal move() called"+ speed);
    }


    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public <T extends Animal> void sleep(T type){
        System.out.println("i'm a "+type.getClass());
    }

    public void type(List<? extends Animal> list){
        for (Object l : list) {
            System.out.println("i'm a "+l.getClass());
        }
    }
}
