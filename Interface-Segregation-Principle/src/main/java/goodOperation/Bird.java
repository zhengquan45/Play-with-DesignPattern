package goodOperation;

public class Bird implements IFlyAnimal,IEatAnimal {
    public void eat() {
        System.out.println("Bird eat...");
    }

    public void fly() {
        System.out.println("Bird fly...");
    }
}
