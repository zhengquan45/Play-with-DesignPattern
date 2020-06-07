package enum0;

public class Test {
    public static void main(String[] args) {
        PromotionActivity activity618 = new PromotionActivity(PromotionStrategyEnum.COUPON);
        PromotionActivity activity1111 = new PromotionActivity(PromotionStrategyEnum.CASHBACK);
        activity618.execute();
        activity1111.execute();
    }
}
