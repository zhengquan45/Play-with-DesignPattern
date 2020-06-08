package good;

public class EggDecorator extends BatterCakeDecorator {
    public EggDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    protected void doSomething() {
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "一个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
