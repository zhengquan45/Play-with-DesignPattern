package simple;

import java.util.HashMap;
import java.util.Map;

public class PromotionFactory {
    private static Map<String, PromotionStrategy> map = new HashMap<String, PromotionStrategy>();

    static {
        map.put("COUPON", new CouponStrategy());
        map.put("CASHBACK", new CashBackStrategy());
        map.put("GROUPBUY", new GroupBuyStrategy());
    }

    private PromotionFactory() {}

    public PromotionStrategy getPromotionStrategy(String strategy) {
        PromotionStrategy promotionStrategy = map.get(strategy);
        return promotionStrategy == null ? new EmptyStrategy() : promotionStrategy;
    }
}
