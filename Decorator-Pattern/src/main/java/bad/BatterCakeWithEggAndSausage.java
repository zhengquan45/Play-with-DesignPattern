package bad;

public class BatterCakeWithEggAndSausage extends BatterCakeWithEgg{

    @Override
    protected String getMsg() {
        return super.getMsg() + "一个香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
