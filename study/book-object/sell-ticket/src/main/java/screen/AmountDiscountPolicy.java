package screen;

/**
 * ### 2.3 할인 요금 구하기
 *
 * - 할인 조건을 만족할 경우 일정한 금액을 할인해주는 금액 할인 정책을 구현
 * */
public class AmountDiscountPolicy extends DiscountPolicy {

    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount,
                                DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }

}
