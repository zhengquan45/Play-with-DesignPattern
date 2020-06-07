package enum0;

import simple.PromotionStrategy;

public class PromotionActivity {
    private PromotionStrategyEnum promotionStrategy;

    public PromotionActivity(PromotionStrategyEnum promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }
    public void execute(){
        promotionStrategy.doPromotion();
    }
}
