package good;

public class Test {
    public static void main(String[] args) {
        BatterCake batterCake;
        batterCake = new BaseBatterCake();
        batterCake = new EggDecorator(batterCake);
        batterCake = new EggDecorator(batterCake);
        batterCake = new SausageDecorator(batterCake);
        System.out.println(batterCake.getMsg() + "卖" + batterCake.getPrice() + "元");
    }
}
