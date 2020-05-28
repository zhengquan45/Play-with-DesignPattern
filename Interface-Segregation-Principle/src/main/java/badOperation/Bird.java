package badOperation;

public class Bird implements IAnimal {
    public void eat() {
        System.out.println("bird eat...");
    }

    public void fly() {
        System.out.println("bird fly...");
    }

    public void swim() {
        throw new UnsupportedOperationException();
    }
}
