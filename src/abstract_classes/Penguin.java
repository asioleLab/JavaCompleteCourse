package abstract_classes;

public class Penguin extends Bird implements CanFly{
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I'm not good in flying");
    }
}
