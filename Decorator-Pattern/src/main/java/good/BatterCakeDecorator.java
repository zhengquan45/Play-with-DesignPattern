package good;

public abstract class BatterCakeDecorator extends BatterCake{

    private BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    protected abstract void doSomething();

    @Override
    protected String getMsg() {
        return batterCake.getMsg();
    }

    @Override
    protected int getPrice() {
        return batterCake.getPrice();
    }
}
