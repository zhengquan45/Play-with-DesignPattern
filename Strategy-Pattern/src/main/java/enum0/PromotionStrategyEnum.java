package enum0;

public enum PromotionStrategyEnum {
    COUPON("COUPON"){
        public void doPromotion() {
            System.out.println("领取优惠卷,课程的价格直接减优惠卷面值抵扣");
        }
    },
    CASHBACK("CASHBACK"){
        public void doPromotion() {
            System.out.println("返现促销,返回金额转到支付宝");
        }
    },
    GROUPBUY("GROUPBUY"){
        public void doPromotion() {
            System.out.println("拼团,满20人成团,全团享受团购价");
        }
    },
    EMPTY("EMPTY"){
        public void doPromotion() {
            System.out.println("无促销活动");
        }
    };

    private String value;

    PromotionStrategyEnum(String value) {
        this.value = value;
    }

    public abstract void doPromotion();
}
