package good;

public class SausageDecorator extends BatterCakeDecorator {
    public SausageDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    protected void doSomething() {
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "一根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
