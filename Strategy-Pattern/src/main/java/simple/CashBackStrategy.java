package simple;

public class CashBackStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("返现促销,返回金额转到支付宝");
    }
}
