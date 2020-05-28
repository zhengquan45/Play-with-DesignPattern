package badOperation;

public class Dog implements IAnimal {
    public void eat() {
        System.out.println("dog eat...");
    }

    public void fly() {
        throw new UnsupportedOperationException();
    }

    public void swim() {
        System.out.println("dog swim...");
    }
}
