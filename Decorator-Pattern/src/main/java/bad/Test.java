package bad;

public class Test {
    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getMsg() + "卖" + batterCake.getPrice() + "元");

        BatterCakeWithEgg batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getMsg() + "卖" + batterCakeWithEgg.getPrice() + "元");

        BatterCakeWithEggAndSausage batterCakeWithEggAndSausage = new BatterCakeWithEggAndSausage();
        System.out.println(batterCakeWithEggAndSausage.getMsg() + "卖" + batterCakeWithEggAndSausage.getPrice() + "元");
    }
}
