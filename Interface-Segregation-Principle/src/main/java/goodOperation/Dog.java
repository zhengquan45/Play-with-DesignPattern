package goodOperation;

public class Dog implements ISwimAnimal,IEatAnimal {
    public void eat() {
        System.out.println("Dog eat...");
    }

    public void swim() {
        System.out.println("Dog swim...");
    }
}
